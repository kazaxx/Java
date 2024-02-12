package zadanie4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChecBox {
    public void checbox () {
        WebDriver driver = new ChromeDriver();

        driver.get("https://suninjuly.github.io/math.html");
        WebElement xElement = driver.findElement(By.id("input_value"));
        String xText = xElement.getText();
        double xValue = Double.parseDouble(xText);

        double a = (double) Math.log(Math.abs(12 * Math.sin(xValue)));

        WebElement result = driver.findElement(By.id("answer"));
        result.sendKeys(xText.valueOf(a));

        WebElement robot = driver.findElement(By.className("form-check-label"));

        robot.click();

        WebElement robotradio = driver.findElement(By.id("robotsRule"));

        robotradio.click();

        WebElement sumbut = driver.findElement(By.xpath("//button[text()='Submit']"));

        sumbut.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
