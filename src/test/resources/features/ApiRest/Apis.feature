Feature: Covid List Test
  yo como usuario de la aplicación de covid
  quiero enlistar los resultados de las pruebas covid
  para buscar el resultado de mi prueba

  @TestApiRest
  Scenario: Get List Result
    Given que el usuario de la prueba de sangre desea conocer el resultado
    When hago la petición de tipo Post
    And un json con la información del usuario