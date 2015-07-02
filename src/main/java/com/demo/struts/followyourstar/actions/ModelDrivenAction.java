package com.demo.struts.followyourstar.actions;

import com.demo.struts.followyourstar.actions.vo.ActionVO;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ModelDrivenAction extends BaseAction implements ModelDriven<ActionVO>, Preparable {

	@Override
	public ActionVO getModel() {
		
		return createModel();
	}

	public void prepare() throws Exception {
		configure();
	}
	
	protected void configure(){
		
	}
	
	protected ActionVO createModel(){
		return null;
	}

}
