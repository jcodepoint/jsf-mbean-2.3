package services.impl;

import java.io.Serializable;

import services.MyService;

public class MyServiceImpl implements MyService, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public String getNewMessage() {
		return "Mensaje retornado por servicio";
	}

}
