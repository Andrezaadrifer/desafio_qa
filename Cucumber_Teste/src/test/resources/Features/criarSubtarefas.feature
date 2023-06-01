Feature: Criação de subtarefas
  Usuário deve poder criar subtarefas no aplicativo ToDo para dividir suas tarefas em partes menores.

  Background: Criar tarefa
    Given tenha criado uma tarefa
    And selecionado botão de gerenciar subtarefas

  Scenario Outline: Quantidade de subtarefas
    When visualizar <total do botao> de subtasks informados
    Then compara com o <total subtasks> da tarefa

    Examples: 
      | total do botao | total subtasks |
      | "0"            | "0"            |
      | "1"            | "1"            |

  Scenario: Edição campo o ID e descrição da tarefa
    When selecionar o campo de descrição da tarefa
    And digitar novo texto para descrição da tarefa
    Then não deve ser permitido alterar o texto da descrição da tarefa

  Scenario Outline: Inserir descrição e data de subtarefas
    When selecionar o campo de descrição da subtarefa
    And inserir o <texto subtarefa>
    And selecionar o campo de data de vencimento da subtarefa
    And inserir a <texto data>
    And selecionar botão de adicionar subtarefa
    Then deve comparar o texto e data iseridos com os valores existentes

    Examples: 
      | texto subtarefa                                                                                                                                                                                                                                               | texto data   |
      | "Teste - 249 caracteres: Caros amigos, a estrutura atual da organização obstaculiza a apreciação da importância das condições inegavelmente apropriadas. Desta maneira, a consolidação das estruturas acarreta um processo de reformulação e modernização."   | "05/26/2023" |
      | "Teste - 250 caracteres: Caros amigos, a estrutura atual da organização obstaculiza a apreciação da importância das condições inegavelmente apropriadas. Desta maneira, a consolidação das estruturas acarreta um processo de reformulação e modernização.."  | "05/26/2023" |
      | "Teste - 251 caracteres: Caros amigos, a estrutura atual da organização obstaculiza a apreciação da importância das condições inegavelmente apropriadas. Desta maneira, a consolidação das estruturas acarreta um processo de reformulação e modernização..." | "05/26/2023" |
      | ""                                                                                                                                                                                                                                                            | "05/26/2023" |
      | " "                                                                                                                                                                                                                                                           | "05/26/2023" |
      | "Nova subtarefa 1"                                                                                                                                                                                                                                            | ""           |
      | "Nova subtarefa 2"                                                                                                                                                                                                                                            | " "          |
      | "Nova subtarefa 3"                                                                                                                                                                                                                                            | "2023/05/26" |
