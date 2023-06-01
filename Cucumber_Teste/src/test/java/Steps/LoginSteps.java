package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;

	@Given("usuario acessa a pagina de login")
	public void usuario_acessa_a_pagina_de_login() {

		System.out.println("Acesso a pagina de login");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Caminho do projeto:" + projectPath);

		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/Drivers/msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://qa-test.avenuecode.io/tasks");
	}

	@When("usuario informa login e senha")
	public void usuario_informa_login_e_senha() {

		driver.findElement(By.id("user_email")).sendKeys("andrezaadrifer@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Qualityassurance");
		System.out.println("informa login e senha");
	}

	@And("clica sob o botão de realizar login")
	public void clica_sob_o_botão_de_realizar_login() {

		System.out.println("clica no botão de login");
		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);

	}

	@Then("usuario é direcionado a pagina inicial")
	public void usuario_é_direcionado_a_pagina_inicial() throws InterruptedException {

		System.out.println("Acesso a pagina de login");

		driver.getPageSource().contains("Welcome, Andreza Fernanda!");

//		driver.findElement(By.xpath("//*[@id=\"new_task\"]")).sendKeys("Teste criação de tarefa");
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
