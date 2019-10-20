import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchChromeTest {

@Test
public void launchChrome()
{
	WebDriver driver=new ChromeDriver();
}
@Test
public void Firefox()
{
	WebDriver driver=new FirefoxDriver();
}
}
