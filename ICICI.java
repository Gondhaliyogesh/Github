package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class ICICI {

	public static void main(String[] args) 
	{
		
		WebDriver obj=new FirefoxDriver();
		
		obj.get("http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx?market-stats#");
		obj.findElement(By.linkText("Daily Share Prices")).click();
		
		int r =obj.findElements(By.xpath(".//*[@id='gridSource']/tbody/tr")).size();
		System.out.println("Row count:="+r);
		
		int c =obj.findElements(By.xpath(".//*[@id='gridSource']/tbody/tr/td")).size();
		System.out.println("Column Count:="+c);
		
		
		WebElement rct=obj.findElement(By.xpath(".//*[@id='gridSource']/thead/tr"));
		System.out.println("row title:==>"+" "+rct.getText());
		
		
		WebElement r_cont=obj.findElement(By.xpath(".//*[@id='gridSource']/tbody/tr[12]"));
		System.out.println("row value:==>"+" "+r_cont.getText());
		
		
		/*for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(obj.findElement(By.xpath(".//*[@id='gridSource']/tbody/tr["+i+"]/td["+j+"]"+" ")));
			}
			System.out.println("");
		}
		
		
		*/
		
	}

}
