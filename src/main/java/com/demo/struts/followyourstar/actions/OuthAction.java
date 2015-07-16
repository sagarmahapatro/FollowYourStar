package com.demo.struts.followyourstar.actions;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.struts.followyourstar.actions.vo.ActionVO;
import com.demo.struts.followyourstar.actions.vo.UserVO;
import com.demo.struts.followyourstar.service.UserService;
import com.demo.struts.followyourstar.service.dtos.UserDTO;

public class OuthAction extends ModelDrivenAction implements SessionAware {

	private static Logger logger = Logger.getLogger(OuthAction.class);

	private UserVO userVO = null;
	private UserDTO userDTO = null;
	private Map<String, Object> seesionMap = null;

	@Autowired
	UserService userService = null;

	protected void configure() {
		userVO = new UserVO();
		logger.debug(" createing model UserVO");
	}

	public String execute() throws Exception {
		logger.debug(" fatching student DTO ");
		userDTO = userService.login(userVO.getEmail(), userVO.getPassword());
		if (userDTO != null) {
			logger.debug(" createing model UserVO " + userDTO.isAuthonticated);
			if (seesionMap != null) {
				seesionMap.put("user", userDTO);
			}
			return LOGIN;
		} else {
			return ERROR;
		}
	}

	@Override
	protected ActionVO createModel() {
		return userVO;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		seesionMap = arg0;
	}
}
