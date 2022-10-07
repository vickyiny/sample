package playwright;

import org.openqa.selenium.devtools.v85.browser.Browser;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Playwright playwright = Playwright.create();
    
	com.microsoft.playwright.Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
	Page page =  ((com.microsoft.playwright.Browser) browser).newPage();
	page.navigate("http://www.amazon.in/");
	
	String title = page.title();
	System.out.println("page title is : "+title);
	
	String url = page.url();
	System.out.println("url is :"+ url);
	
	Browser.close();
	
		
	}

}
