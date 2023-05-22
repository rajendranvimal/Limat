package cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=("/Users/VI20463981/eclipse-vimaljava1/demoproject/src/main/java/cucu/demo.feature"),
		glue={"cucu"},
		tags="@ABC",
		dryRun=true 
		)
public class runner {

	
}
