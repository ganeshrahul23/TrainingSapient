package com.sapient.service;

public class NokiaLumia extends Nokia1100 {
	public void captureImage() {
		System.out.println("Capture Image");
	}
	
	public void browseNet() {
		System.out.println("Browse net");
	}

	@Override
	public void doConverse() {
		System.out.println("do converse 4g");
	}
}
