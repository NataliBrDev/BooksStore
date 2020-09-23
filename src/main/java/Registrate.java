import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

class Registrate {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/home/natali/geckodriver/geckodriver");
        WebDriver driver = new FirefoxDriver();

        Registrate reg = new Registrate();
        reg.signin(driver);
    }

    public void signin(WebDriver driver) {
        driver.get("https://go.experitest.com/accessibility-cloud-launc?utm_campaign=Accessibility%20Cloud%20Launch%20September%202020%20&utm_source=Toolsqa&utm_medium=popup");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement();//
        /*driver.findElement(By.id("\"hs-eu-confirmation-button\"")).click();
        WebElement firstName = driver.findElement(By.id("firstname-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        firstName.sendKeys("Natali");
        WebElement lastName =driver.findElement(By.id("lastname-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        lastName.sendKeys("Braz");
        WebElement company = driver.findElement(By.id("company-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        company.sendKeys("Test");
        WebElement industry = driver.findElement(By.id("industry-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        industry.click();
        WebElement typeindustry = industry.findElement(By.xpath("//*[@id=\"industry-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916\"]/option[8]"));
        typeindustry.click();
        WebElement email = driver.findElement(By.id("email-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        email.sendKeys("natali.butko.dev@gmail.com");
        WebElement phoneCode =driver.findElement(By.id("phone_ext-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        phoneCode.click();
        phoneCode.findElement(By.xpath("//*[@id=\"phone_ext-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916\"]/option[221]"));
        phoneCode.click();
        WebElement phoneNum =driver.findElement(By.id("phone-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        phoneNum.sendKeys("989693744");
        WebElement country = driver.findElement(By.id("country-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916"));
        company.findElement(By.xpath("//*[@id=\"country-71504bc2-187d-44f3-934a-2cd8bbb43a55_7916\"]/option[227]"));
        company.click();*/
        driver.quit();

    }

}

