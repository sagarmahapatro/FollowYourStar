package com.demo.struts.followyourstar.actions;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.demo.struts.followyourstar.service.dtos.UserDTO;

public class LogoutAction extends ModelDrivenAction implements SessionAware {

	private static Logger logger = Logger.getLogger(LogoutAction.class);
	private Map<String, Object> seesionMap = null;

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		seesionMap = arg0;
	}

	public String execute() throws Exception {
		logger.debug(" logging out user ");

		if (seesionMap != null) {
			UserDTO userDTO = (UserDTO) seesionMap.get("user");
			if (userDTO != null) {
				seesionMap.put("user", null);
				logger.debug("the user" + userDTO.userName
						+ "has been sccessfully logedout from the system");
			}

		}
		return SUCCESS;

	}

}
