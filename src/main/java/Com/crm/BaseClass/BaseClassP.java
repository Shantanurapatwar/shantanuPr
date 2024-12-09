package Com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import Com.crm.javautility.PropertyClass;

public class BaseClassP {
	public WebDriver driver=new ChromeDriver();
	public PropertyClass pc=new PropertyClass();
	@BeforeClass
public void condition() throws IOException {
		String browser=pc.propdata("browser");
		String url=pc.propdata("link");
	if (browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();	
	}
	else if (browser.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("fireFox")) {
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
	driver.get(url);
}
}
