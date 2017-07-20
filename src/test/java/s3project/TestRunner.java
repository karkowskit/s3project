package s3project;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by KarkowsT on 2017-07-09.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", format={"pretty","html:reports/test-report"})
public class TestRunner {
}
