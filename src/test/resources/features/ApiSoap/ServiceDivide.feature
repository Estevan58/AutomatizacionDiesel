Feature: Servicio de División de Enteros

  Yo como usuario
  Quiero obtener el resultado de una division
  Para conocer su codigo de manera acertiva

  Scenario Outline: Realizar division de dos numeros

    Given que el servicio DivideInteger está disponible
    When se realiza una solicitud para dividir dos enteros con valores <Arg1> y <Arg2>
    Then el resultado debe ser <resultado>

    Examples:
      | Arg1 | Arg2 | resultado |
      | 10   | 5    | 2              |
      | 20   | 4    | 5              |
      | 15   | 3    | 5              |