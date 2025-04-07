package com.definitions;
import com.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class Hooks {
	@Before
	public static void setUp() {
		HelperClass.setDriver();
	}
	@After
	public static void tearDown(Scenario s) {
		HelperClass.tearDown();
	}
}
