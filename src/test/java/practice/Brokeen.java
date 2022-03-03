package practice;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

public class Brokeen {
	
	@Test
	public void verifyLinks() throws IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		
		List <WebElement> elements = driver.findElements(By.xpath("//a"));
		//10
		for(int i=0; i<elements.size();i++)
}
}