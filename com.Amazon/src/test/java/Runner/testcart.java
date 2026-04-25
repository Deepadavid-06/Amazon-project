package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/feature/cart.feature"},
		glue="cartstep",
		dryRun=false
	)

public class testcart extends AbstractTestNGCucumberTests {

}
