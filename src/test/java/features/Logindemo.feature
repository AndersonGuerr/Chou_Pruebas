Feature: Testear Login
  Scenario: Loguearse e ingresar al perfil
    Given Abrir el navegador
    And Abrir la pagina de login
    When Usuario ingresar usuario y contraseña
    And Usuario da clic en la sigin
    Then Usuario Navega en la pagina logueado
