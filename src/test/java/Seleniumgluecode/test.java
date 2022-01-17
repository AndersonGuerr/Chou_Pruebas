package Seleniumgluecode;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    private ChromeDriver driver;
    @Given("^Abrir el navegador$")
    public void abrir_el_navegador() throws Throwable {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @And("^Abrir la pagina de login$")
    public void abrir_la_pagina_de_login() throws Throwable {
        WebElement titlecomicslocator = driver.findElementByClassName("login");
        titlecomicslocator.click();
    }


    @When("^Usuario ingresar usuario y contraseña$")
    public void usuario_ingresar_usuario_y_contraseña() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("anderson.pruebas@hotmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Knight1026");
    }
    @And("^Usuario da clic en la sigin$")
    public void usuario_da_clic_en_la_sigin() throws Throwable {
        driver.findElement(By.id("SubmitLogin")).click();
    }
    @Then("^Usuario Navega en la pagina logueado$")
    public void usuario_Navega_en_la_pagina_logueado() throws Throwable {
        driver.findElementByClassName("logout");
    }


}
