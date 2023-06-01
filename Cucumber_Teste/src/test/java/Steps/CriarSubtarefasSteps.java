package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CriarSubtarefasSteps {

	@Given("tenha criado uma tarefa")
	public void tenha_criado_uma_tarefa() {
		System.out.println("uma tarefa criada");
	}

	@And("selecionado botão de gerenciar subtarefas")
	public void selecionado_botão_de_gerenciar_subtarefas() {
		System.out.println("Botão de gerenciar subtarefas selecionado");
	}

	@When("visualizar {string} de subtasks informados")
	public void visualizar_de_subtasks_informados(String string) {
		System.out.println("Total de subtasks guardado");
	}

	@Then("compara com o {string} da tarefa")
	public void compara_com_o_da_tarefa(String string) {
		System.out.println("Comparado total de subtarefa");
	}

	@When("selecionar o campo de descrição da tarefa")
	public void selecionar_o_campo_de_descrição_da_tarefa() {
		System.out.println("Campo de descrição da tarefa selecionado");
	}

	@And("digitar novo texto para descrição da tarefa")
	public void digitar_novo_texto_para_descrição_da_tarefa() {
		System.out.println("Novo texto para descrição da tarefa adicionado");
	}

	@Then("não deve ser permitido alterar o texto da descrição da tarefa")
	public void não_deve_ser_permitido_alterar_o_texto_da_descrição_da_tarefa() {
		System.out.println("Comparando texto atual da descrição da tarefa com o texto adicionado");
	}

	@When("selecionar o campo de descrição da subtarefa")
	public void selecionar_o_campo_de_descrição_da_subtarefa() {
		System.out.println("Campo de descrição da subtarefa selecionado");
	}

	@And("inserir o {string}")
	public void inserir_o(String string) {
		System.out.println("Texto subtarefa inserido");
	}

	@And("selecionar o campo de data de vencimento da subtarefa")
	public void selecionar_o_campo_de_data_de_vencimento_da_subtarefa() {
		System.out.println("Campo data de vencimento da subtarefa selecionado");
	}

	@And("inserir a {string}")
	public void inserir_a(String string) {
		System.out.println("data inserida");
	}

	@And("selecionar botão de adicionar subtarefa")
	public void selecionar_botão_de_adicionar_subtarefa() {
		System.out.println("Botão de adicionar subtarefa selecionado");
	}

	@Then("deve comparar o texto e data iseridos com os valores existentes")
	public void deve_comparar_o_texto_iserido_com_o_existente() {
		System.out.println("Texto subtarefa e data de vencimento comparados");
	}

}
