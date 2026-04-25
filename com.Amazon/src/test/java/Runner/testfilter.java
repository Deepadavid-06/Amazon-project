package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features= {	"src/test/java/feature/Filter.feature"},
	glue="filterstep",
	dryRun=false,
	plugin= {"pretty"}

		)

public class testfilter extends AbstractTestNGCucumberTests  {

}
