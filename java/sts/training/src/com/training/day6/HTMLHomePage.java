package com.training.day6;

import java.io.Serializable;

public class HTMLHomePage implements HTMLPage, HTMLEvents, Serializable {

	@Override
	public void implementHeader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void implementBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onLoad() {
		// TODO Auto-generated method stub
		
	}
	
	
}


interface HTMLPage {
	public void implementHeader();
	public void implementBody();
}

interface HTMLEvents {
	public void onLoad();
}

