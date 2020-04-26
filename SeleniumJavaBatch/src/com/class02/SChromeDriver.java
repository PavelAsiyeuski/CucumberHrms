package com.class02;

public class SChromeDriver implements SWebDriver {

	public SChromeDriver() {
		System.err.println("Opening Chrome Browser...");
	}
	
	public void get(String url) {
		System.out.println("Launching Chrome Browser");
		
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Current url is ");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
