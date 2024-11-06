package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ordering_hooks {

	@Before(order = 1)
	public void before2() {
		System.out.println("Get permission from mother for shopping");
	}

	@After(order = 0)
	public void after2() {
		System.out.println("Return home");
	}

	@Before(order = 0)
	public void before1() {
		System.out.println("get amount from mother");
	}

	@After(order = 1)
	public void after1() {
		System.out.println("pay money");
	}
}
