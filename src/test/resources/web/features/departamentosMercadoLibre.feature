
Feature: MercadoLibre
  COMO usuario de Mercado Libre
  QUIERO ver verificar si contiene departamentos
  PARA llevar un control de los mismos
  @MLdpto
  Scenario Outline: Consulta Departamentos resultado exitoso
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity  | jsonName    | status |
      | GET       | DPTO    | rq          | 200    |






