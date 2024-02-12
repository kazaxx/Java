package zadanie1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {

    public void Gold_button() {
        WebDriver driver = new ChromeDriver();

        driver.get("http://suninjuly.github.io/xpath_examples");

        WebElement goldButton = driver.findElement(By.xpath("//button[text()='Gold']"));

        goldButton.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
