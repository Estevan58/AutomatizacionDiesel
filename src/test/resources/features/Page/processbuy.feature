Feature: Compra de productos

  Yo como usuario
  Quiero añadir uno o varios producto al carrito de compras
  Para realizar una compra en el aplicativo

  Scenario: Verificar la búsqueda de un producto
    Given que el usuario está en la página de inicio
    When el usuario busca "Zapatos"
    Then se deberia mostrar los resultados relacionados con "Zapatos para hombre"


  Scenario: Agregar múltiples productos al carrito
    Given que el usuario ha buscado y seleccionado varios productos
    When el usuario agrega múltiples productos al carrito
    Then todos los productos seleccionados se agregarían al carrito correctamente


  Scenario: Eliminar un producto del carrito
    Given que el usuario tiene artículos en el carrito
    When el usuario elimina un producto del carrito
    Then el producto se eliminaran correctamente del carrito


  Scenario: Actualizar la cantidad de un producto en el carrito
    Given que el usuario tiene artículos en el carrito
    When el usuario actualiza la cantidad del producto
    Then la cantidad del producto en el carrito se actualiza correctamente

  @este
  Scenario: Realizar el proceso de pago
    Given que el usuario tiene artículos en el carrito
    When el usuario procede al pago
    And completa la información de envío y pago
    Then la orden de compra se debería realizar con éxito



  Scenario: Agregar un producto al carrito desde la pagina de detalles
    Given que he accedido a la pagina de detalles del producto
    When se anada un producto
    Then el producto deberia ser agregado al carrito

  @VerifyNameProduct
  Scenario:Verificar los nombres del producto
    Given que he accedido a la pagina de detalles del producto
    When Visualiza la informacion del producto
    Then deberia poder ver el nombre correctos del producto

    @VerifyCar
  Scenario: Verificar que el carrito esta vacio al ingresar por primera vez a la pagina
    Given que el usuario se encuentra en la pagina de inicio
    When el usuario va al carrito
    Then el carrito deberia estar vacio


  @VerifyColor
  Scenario: Verificar que aparezca el color del producto
    Given que he accedido a la pagina de detalles del producto
    When Visualiza la informacion del producto
    Then deberia poder ver el color del producto


  @ProductPrice
  Scenario: Verificar el precio del producto
    Given que he accedido a la pagina de detalles del producto
    When Visualiza la informacion del producto
    Then Revisa el precio del producto






