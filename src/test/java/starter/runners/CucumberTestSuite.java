package starter.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.jupiter.api.Tags;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "starter.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@pse2"
)
public class CucumberTestSuite {
}