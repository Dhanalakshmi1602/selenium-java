package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksConcept {
	@Before
	public void preScenario(Scenario sc) {
		System.out.println("Test Name" +  sc.getName());
		System.out.println("Test line no " + sc.getId());
		
	}
	
	@After
	public void postScenario(Scenario sc) {
		System.out.println("test Status" + sc.getStatus());
				
		
	}

}
