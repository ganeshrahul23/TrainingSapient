package com.service.client;

import com.sapient.service.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		NokiaLumia mob = new NokiaLumia();
		mob.doConverse();
		mob.sendSMS();
		mob.captureImage();
		mob.browseNet();
	}

}
