import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty" ,"html:reports/tests/F0004"},
        glue = "Steps",
        features = "src/test/resource/Search.feature"
)

public class Executor {
}
