# Transacciones En Java JDBC

Una transacción es un conjunto de operaciones sobre una base de datos que se deben ejecutar como una unidad.

Hay ocasiones en las que es necesario que varias operaciones sobre la base de datos se realicen en bloque, es decir, que se ejecuten o todas o ninguna, pero no que se realicen unas sí y otras no.

Si se ejecutan parcialmente hasta que una da error, el estado de la base de datos puede quedar inconsistente. En este caso necesitaríamos un mecanismo para devolverla a su estado anterior, pudiendo deshacer todas las operaciones realizadas.

Ente ejemplo se suponiendo la cuenta bancaria de un banco en particular, se realizan la inserción de un nuevo cliente, por lo que se necesita insertar los datos del nuevo cliente el establecer un monto en la cuenta de ahorros y en la de crédito. Por lo que se necesita controlar que ambas operaciones se ejecuten correctamente, ya que no podemos tener un cliente sin una cuenta relacionada a él, y tampoco una cuenta que no esté relacionada a ningún cliente, de aquí es el uso de las transacciones, ya que nos ayudan con controlar cada operación que se ejecute en la base de datos.  


Funciones o métodos:

setAutoCommit(boolean value)
Este método setAutoCommit lo especifica el método setAutoCommit en la interfaz java.sql.Connection.
Si una conexión está en modo de confirmación automática, todas sus sentencias SQL se ejecutan y confirman como transacciones individuales. De lo contrario, sus sentencias SQL se agrupan en transacciones que finalizan mediante una llamada al método de confirmación o al método de reversión. De forma predeterminada, las nuevas conexiones están en modo de confirmación automática.
La confirmación se produce cuando se completa la declaración o se produce la siguiente ejecución, lo que ocurra primero. Cuando las declaraciones devuelven un objeto SQLServerResultSet, la declaración se completa cuando se recupera la última fila del conjunto de resultados o cuando se cierra el conjunto de resultados. En casos avanzados, una sola declaración puede devolver varios resultados además de los valores de los parámetros de salida. En estos casos, la confirmación se produce cuando se han recuperado todos los resultados y los valores de los parámetros de salida.
Puede activar o desactivar la confirmación automática mediante el método setAutoCommit() de la interfaz de conexión.
Este método acepta un valor booleano como parámetro. Si pasa verdadero a este método, activa la función de confirmación automática de la base de datos y, si pasa falso a este método, desactiva la función de confirmación automática de la base de datos.
Para realizar transacciones necesitamos lo contrario del setAutoCommit() falso ya que necesitamos controlar cada transacción.

commit ()
El método commit () de la interfaz Connection guarda todas las modificaciones realizadas desde la última confirmación.
Si ocurre algún problema después de la confirmación, puede revertir todos los cambios realizados hasta esta confirmación invocando el método rollback ().

rollBack ()
Una operación rollBack () deshace todos los cambios realizados por la transacción actual, es decir, si llama a un método rollBack () de la interfaz de conexión, todas las modificaciones se revierten hasta la última confirmación.
También puede revertir los cambios en la base de datos hasta un punto de guardado en particular pasando el objeto de punto de guardado requerido como parámetro a este método.
