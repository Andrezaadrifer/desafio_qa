Feature: Criar Tarefa
  O usuário deve poder criar tarefas no aplicativo ToDo para realizar gestão de tarefas.

  Scenario: Criação de tarefas com uso do botão adicionar tarefa
    Given: usuario logado com sucesso
    When digitar texto para descrição da tarefa
    And selecionar o botão adicionar tarefa
    Then visualizar novo texto de descrição criado
