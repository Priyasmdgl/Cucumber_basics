package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class mangoes_hooks {

	@Before
	public void beforetest() {
		System.out.println("Mangoes");
	}

	@After
	public void aftertest() {
		System.out.println("buy some more mangoes");
	}
}
