@Login
Feature: Login

  @Login2
  Scenario Outline: El usuario se loguea exitosamente
    Given El usuario se encuentra en la web sausedemo para iniciar sesion
    When El usuario ingresa un '<username>' correcto
    And El usuario ingresa una '<password>' correcta
    And   El usuario clickea en el boton Login
    Then Se verifica que se ingreso al sitio web
    Examples:
      | username                | password         |
      | performance_glitch_user | secret_sauce     |


  @Login3
  Scenario Outline: El usuario ingresa un username incorrecto y un password correcto
    Given El usuario se encuentra en la web sausedemo para iniciar sesion
    When El usuario ingresa un '<username>' incorrecto
    And El usuario ingresa una '<password>' correcta
    And   El usuario clickea en el boton Login
    Then  se verifica que se muestre un mensaje de error que usuario o contraseña no coinciden
    Examples:
      | username          | password         |
      | performance_user  | secret_sauce     |


  @Login4
  Scenario Outline: El usuario ingresa un username correcto y un password incorrecto
    Given El usuario se encuentra en la web sausedemo para iniciar sesion
    When El usuario ingresa un '<username>' correcto
    And El usuario ingresa una '<password>' incorrecto
    And   El usuario clickea en el boton Login
    Then  se verifica que se muestre un mensaje de error que usuario o contraseña no coinciden
    Examples:
      | username                | password         |
      | performance_glitch_user | secret2          |



  @Login5
  Scenario Outline: El usuario ingresa usuario y contraseña incorrecta
    Given El usuario se encuentra en la web sausedemo para iniciar sesion
    When El usuario ingresa un '<username>' incorrecto
    And El usuario ingresa una '<password>' incorrecto
    And   El usuario clickea en el boton Login
    Then  se verifica que se muestre un mensaje de error que usuario o contraseña no coinciden
    Examples:
      | username         | password         |
      | performance_user | secret2          |
  @LoginFallido
  Scenario Outline: El usuario se loguea exitosamente(Falla al buscar un locator equivocado)
    Given El usuario se encuentra en la web sausedemo para iniciar sesion
    When El usuario ingresa un '<username>' correcto
    And El usuario ingresa una '<password>' correcta
    And   El usuario clickea en el boton Login
    Then Se verifica que se ingreso al sitio correctamente
    Examples:
      | username                | password         |
      | performance_glitch_user | secret_sauce     |