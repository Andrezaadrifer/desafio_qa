Feature: Login de usuário
  O usuário deve acessar o aplicativo ToDo para criar tarefas.

  Scenario: Autenticação com sucesso no aplicativo ToDo
    Given usuario acessa a pagina de login
    When usuario informa login e senha
    And clica sob o botão de realizar login
    Then usuario é direcionado a pagina inicial
