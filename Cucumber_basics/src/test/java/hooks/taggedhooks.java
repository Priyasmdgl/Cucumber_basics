package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class taggedhooks {

	@Before
	public void beforescenario() {
		System.out.println("Run before every scenario");
	}

	@After
	public void afterscenario() {
		System.out.println("Run after every scenario");
	}

	@Before("@First")
	public void beforefirst() {
		System.out.println("Run before first scenario");
	}

	@After("@First")
	public void afterfirst() {
		System.out.println("Run after first scenario");
	}

	@Before("@Second")
	public void beforesecond() {
		System.out.println("Run before second scenario");
	}

	@After("@Second")
	public void aftersecond() {
		System.out.println("Run after second scenario");
	}

	@Before("@Third")
	public void beforethird() {
		System.out.println("Run before third scenario");
	}

	@After("@Third")
	public void afterthird() {
		System.out.println("Run after third scenario");
	}
}
