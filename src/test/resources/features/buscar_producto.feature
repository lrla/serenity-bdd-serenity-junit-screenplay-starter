# language: es
Característica: Realizar la compra de productos
  Como cliente de loja
  Quiero usar la aplicación
  Para realizar la compra de productos

  Antecedentes:
    Dado que el actor accede Dafiti

  Esquema del escenario:
    Y que el actor realiza el login llenando el campo <USERNAME> y <PASSWORD>
    Ejemplos:
      | USERNAME        | PASSWORD   |
      | teste@gmail.com | teste@Test |
  @pse
  Esquema del escenario: Agregar producto a la bolsa
    Y que el actor investiga un producto <PRODUTO>
    Y que el actor clic en el producto devuelto
    Entonces que el actor compruebo el carrito de compras
    Ejemplos:
      | PRODUTO |
      | Calça Sarja Wide Leg Feminina Cintura Alta Bolso Cargo 22969 Verde Militar Consciência   |
