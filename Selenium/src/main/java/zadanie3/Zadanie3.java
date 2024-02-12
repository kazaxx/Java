package zadanie3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    public void tickbutton (){
        WebDriver driver = new ChromeDriver();

        driver.get("http://suninjuly.github.io/find_link_text");
        int result = (int) Math.ceil(Math.pow(Math.PI, Math.E) * 10000);

        WebElement link = driver.findElement(By.linkText(String.valueOf(result)));
        link.click();

        WebElement firstName = driver.findElement(By.name("first_name"));

        firstName.sendKeys("Artem");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Khalilov");

        WebElement city = driver.findElement(By.name("firstname"));
        city.sendKeys("Moscow");

        WebElement Country = driver.findElement(By.id("country"));
        Country.sendKeys("Russia");

        WebElement click = driver.findElement(By.xpath("//button[text()='Submit']"));
        click.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
