package zadanie6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadamie6 {
    public void Zad6() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://suninjuly.github.io/registration1.html");

        WebElement search1 = driver.findElement(By.xpath("//input[@class = 'form-control first']"));
        search1.sendKeys("Artem");

        WebElement search2 = driver.findElement(By.xpath("//input[@class = 'form-control second']"));
        search2.sendKeys("Khalilov");

        WebElement search3 = driver.findElement(By.xpath("//input[@class = 'form-control third']"));
        search3.sendKeys("@@@");

        WebElement search4 = driver.findElement(By.xpath("//button[@class = 'btn btn-default']"));
        search4.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
