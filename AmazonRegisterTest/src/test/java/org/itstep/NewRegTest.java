package org.itstep;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewRegTest {
	 private static WebDriver driver;

	    @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.com");
	    }

	@Test
	public void test() {
		WebElement avtorization = driver.findElement(By.id("nav-tools"));
        WebElement signIn = avtorization.findElement(By.id("nav-link-accountList"));
        String link = signIn.getAttribute("href");
        driver.get(link);


       WebElement email = driver.findElement(By.id("ap_email"));
       email.sendKeys("malwalanda@gmail.com");
       
       WebElement button = driver.findElement(By.id("continue"));
       button.submit();
       
       WebElement password = driver.findElement(By.id("ap_password"));
       password.sendKeys("qwzx1991");
       
       WebElement button1 = driver.findElement(By.id("signInSubmit"));
       button1.submit();
       
       WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
       search.sendKeys("cat toys");
       
       WebElement lupa = driver.findElement(By.id("nav-search-submit-text"));
       lupa.submit();
       
       WebElement chooseGoods = driver.findElement(By.xpath("//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal'][@title='16 Deluxe Cat Toys Kitten Toys Assortments, 2 in 1 Function LED Flashlight and Red Light Pointer, Interactive Feather Teaser Wand Toy, Catnip Mouse, Crinkle Balls for Cat, Puppy, Kitty Kitten']"));
       String a = chooseGoods.getAttribute("href");
       driver.get(a);
       
       WebElement addCart = driver.findElement(By.id("add-to-cart-button"));
       addCart.submit();
       
       WebElement asert = driver.findElement(By.id("huc-v2-order-row-confirm-text"));
       WebElement asert1 = asert.findElement(By.tagName("h1"));
       String text = asert1.getText();
       assertEquals("Added to Cart", asert1);
        /*WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("toy cats");
        
        /*WebElement createAcc = driver.findElement(By.id("createAccountSubmit"));
        String submit = createAcc.getAttribute("href");
        driver.get(submit);
         
        WebElement form = driver.findElement(By.id("ap_register_form"));

        WebElement name = form.findElement(By.id("ap_customer_name"));
        name.sendKeys("Anastasiia");

        WebElement eMail = form.findElement(By.id("ap_email"));
        eMail.sendKeys("nastiialu@gmail.com");

        WebElement password = form.findElement(By.id("ap_password"));
        password.sendKeys("qwert123");

        WebElement rePassword = form.findElement(By.id("ap_password_check"));
        rePassword.sendKeys("qwert123");

        WebElement button = form.findElement(By.id("continue"));
        button.submit();*/
        
        
	
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//driver.quit();
	}
	

	

}
