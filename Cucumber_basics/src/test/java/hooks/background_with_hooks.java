package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class background_with_hooks {
	@Before
	public void before() {
		System.out.println("Before all scenarios");
	}

	@After
	public void after() {
		System.out.println("After all scenarios");
	}
}
