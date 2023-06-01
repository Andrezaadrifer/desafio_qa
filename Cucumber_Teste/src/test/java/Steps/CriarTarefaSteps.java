package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CriarTarefaSteps {

	WebDriver driver = null;

	@Before
	@Given("usuario logado com sucesso")
	public void usuario_logado() {

		String projectPath = System.getProperty("user.dir");
		System.out.println("Caminho do projeto:" + projectPath);

		System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/Drivers/msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://qa-test.avenuecode.io/tasks");
		
		driver.findElement(By.id("user_email")).sendKeys("andrezaadrifer@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Qualityassurance");
		driver.findElement(By.name("commit")).click();
		
		System.out.println("informa login e senha");
		System.out.println("Acesso a home page de tarefas");
	}

	@When("digitar texto para descrição da tarefa")
	public void digitar_texto_para_descrição_da_tarefa() {

		driver.findElement(By.id("new_task")).sendKeys("2Teste- criar nova tarefa");

		System.out.println("Texto add para criar tarefa");
	}

	@And("selecionar o botão adicionar tarefa")
	public void selecionar_o_botão_adicionar_tarefa() {

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div[2]/span")).click();

		System.out.println("botão selecionado");
	}

	@Then("visualizar novo texto de descrição criado")
	public void visualizar_novo_texto_de_descrição_criado() throws InterruptedException {

		driver.getPageSource().contains("2Teste- criar nova tarefa");
		System.out.println("Descrição validada com sucesso!");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}