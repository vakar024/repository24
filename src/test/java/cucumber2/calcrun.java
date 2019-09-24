package cucumber2;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	 plugin= {"json:src/test/java/cucumber2/cucu.json"}
)
public class calcrun 
{
}

