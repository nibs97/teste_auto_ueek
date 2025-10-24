package br.com.meus.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAdminTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp() {

        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();
    }


    @Test
    public void deveRealizarLoginComSucesso() {

        driver.get("https://desafio-tester.ueek.dev/content-adm");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("admin@admin.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Admin123*");

        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();

        wait.until(ExpectedConditions.urlContains("/dashboard"));

        String currentUrl = driver.getCurrentUrl();

        assertEquals("https://desafio-tester.ueek.dev/content-adm/dashboard", currentUrl);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}