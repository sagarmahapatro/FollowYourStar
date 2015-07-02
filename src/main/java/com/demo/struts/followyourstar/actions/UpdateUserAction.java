package com.demo.struts.followyourstar.actions;

import java.sql.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.struts.followyourstar.actions.vo.ActionVO;
import com.demo.struts.followyourstar.actions.vo.UserVO;
import com.demo.struts.followyourstar.service.UserService;

public class UpdateUserAction extends ModelDrivenAction {
    private static Logger logger = Logger.getLogger(UpdateUserAction.class);
    
	private UserVO userVO;
	
	@Autowired
	UserService userService = null;
	
	public String getFirstName() {
		return userVO.getFirstName();
	}

	public void setFirstName(String firstName) {
		userVO.setFirstName(firstName);;
	}

	public String getLastName() {
		return userVO.getLastName();
	}

	public void setLastName(String lastName) {
		userVO.setLastName(lastName);
	}

	public String getEmail() {
		return userVO.getEmail();
	}

	public void setEmail(String email) {
		userVO.setEmail(email);
	}

	public String getPassword() {
		return userVO.getPassword();
	}

	public void setPassword(String password) {
		userVO.setPassword(password);
	}

	
	protected void configure() {
		userVO = new UserVO();
	}

	protected ActionVO createModel() {
		return userVO;
	}
	
	public String execute() throws Exception {
		logger.debug(" UpdateUserAction  execute called");
		System.out.println("  UpdateUserAction  execute called  ");
		userService.registerUser("", userVO.getFirstName(), userVO.getLastName(), "", userVO.getEmail(), userVO.getPassword());
		return SUCCESS;
	}

}
