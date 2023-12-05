# Banco: Microservicio de transación
* El proyecto hace uso de java 17, Spring boot 3.0.4.
* El microservicio de transacciones proporciona dos endpoints para llevar a cabo operaciones clave: la creación de una nueva transacción, específicamente recargas de dinero, y la transferencia de fondos entre cuentas. Además, integra RabbitMQ para la recepción continua de mensajes a través de colas en donde se permite realizar nuevamente transacciones y recargas de cuentas.
* Se implementaron pruebas unitarias e integración en donde se configuro un .yml para realizar integración continua (CI)
## Integrantes
* Juan Sebastián Acosta
* Jhoan Oswaldo Ome
* María José Casanova
