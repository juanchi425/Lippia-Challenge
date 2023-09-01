@Cart
Feature: El usuario añade Producto al carrito


  Background:
    Given El usuario se encuentra en la web sausedemo para iniciar sesion

  @AddCart1
  Scenario Outline: El usuario añade un producto al carrito desde el catalogo
    When El usuario ingresa un '<username>' correcto
    And El usuario ingresa una '<password>' correcta
    And  El usuario clickea en el boton Login
    Then Se verifica que se ingreso al sitio web
    And El usuario clickea en el boton de Add to Cart del producto Sauce Labs Backpack
    And El usuario clickea en el icono del carrito
    Then Se verifica que el Producto se haya cargado al carrito
    Examples:
      | username                | password         |
      | performance_glitch_user | secret_sauce     |

  @AddCart2
  Scenario Outline: El usuario añade un producto al carrito desde la vista individual del producto
    When El usuario ingresa un '<username>' correcto
    And El usuario ingresa una '<password>' correcta
    And  El usuario clickea en el boton Login
    Then Se verifica que se ingreso al sitio web
    And El usuario clickea en el producto Sauce Labs Backpack
    And El usuario clickea en el boton de Add to Cart del producto Sauce Labs Backpack
    And El usuario clickea en el icono del carrito
    Then Se verifica que el Producto se haya cargado al carrito
    Examples:
      | username                | password         |
      | performance_glitch_user | secret_sauce     |
  @AddCart3
  Scenario Outline: El usuario añade mas de un producto al carrito
    When El usuario ingresa un '<username>' correcto
    And El usuario ingresa una '<password>' correcta
    And  El usuario clickea en el boton Login
    Then Se verifica que se ingreso al sitio web
    And El usuario añade varios productos al carrito
    And El usuario clickea en el icono del carrito
    Then Se verifica que los Productos se hayan cargado al carrito
    Examples:
      | username                | password         |
      | performance_glitch_user | secret_sauce     |
