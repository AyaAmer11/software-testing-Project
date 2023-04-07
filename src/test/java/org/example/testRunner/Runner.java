package org.example.testRunner;

    import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    public class Runner {
    @CucumberOptions(
            features = "src/main/resources/features/ F02_Login.feature",
            glue = {"org.example.stepDefs"},
            plugin = { "pretty",
                    "html:target/cucumber.html",
                    "json:target/cucumber.json",
                    "junit:target/cukes.xml",
                    "rerun:target/rerun.txt"},
            tags = "@smoke"
    )

    public class runners extends AbstractTestNGCucumberTests {
    }
}
