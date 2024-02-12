package zadanie5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie5 {
    public void Zad5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://suninjuly.github.io/get_attribute.html");

        WebElement xElement = driver.findElement(By.id("treasure"));

        String xText = xElement.getAttribute("valuex");
        double xValue = Double.parseDouble(xText);

        double a = Math.log(Math.abs(12 * Math.sin(xValue)));

        WebElement result = driver.findElement(By.id("answer"));
        result.sendKeys(String.valueOf(a));

        WebElement click = driver.findElement(By.id("robotCheckbox"));
        click.click();

        WebElement click2 = driver.findElement(By.id("robotsRule"));
        click2.click();

        WebElement click3 = driver.findElement(By.xpath("//button[text()='Submit']"));
        click3.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
