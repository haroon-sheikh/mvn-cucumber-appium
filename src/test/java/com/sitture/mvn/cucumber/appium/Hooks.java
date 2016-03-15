package com.sitture.mvn.cucumber.appium;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setUp() throws MalformedURLException {
		// Start up appium here
	}

	@After
	public void tearDown() {
		// close app and/or quite application
	}

}
