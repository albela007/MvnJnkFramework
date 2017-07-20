package com.fanniemae.testcases;

import org.testng.annotations.Test;

import com.fanniemae.base.TestBase;

@Test
public class DummyTC extends TestBase {

	@Test(enabled = true)
	public void tc_LoginTestCase() {
		 
		super.click("id_loginBtn");
		super.type("id_UID", "sdet716@sdettraining.com");
		super.type("id_PWD", "Password");
		
	}
	
}
