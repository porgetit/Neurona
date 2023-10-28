# AutoMap

## Descripción

El proyecto "AutoMap" es una aplicación que ofrece una variedad de servicios de lavado de automóviles, diseñados para satisfacer las necesidades de los clientes y mantener los vehículos en óptimas condiciones. En este ejercicio, se aplican los patrones de diseño Modelo-Vista-Controlador (MVC) y el patrón de diseño Decorador.

### Patrones a Aplicar

- **Modelo-Vista-Controlador (MVC)**: Este patrón se utiliza para separar la lógica de negocio (Modelo), la interfaz de usuario (Vista) y el control de la interacción (Controlador) en la aplicación.

- **Decorador**: El patrón de diseño Decorador se utiliza para extender las funcionalidades de los servicios de lavado de vehículos. Permite agregar características adicionales a los servicios básicos de lavado.

## Desarrollo

El proyecto "AutoMap" consta de varias clases que interactúan siguiendo los patrones de diseño mencionados:

### Clases Implementadas

1. **Lavado**: Representa el servicio básico de lavado de automóviles.

2. **LavadoLlantas**: Extiende el servicio de lavado básico y agrega la funcionalidad de lavado de llantas.

3. **LavadoMotor**: Extiende el servicio de lavado básico y agrega la funcionalidad de lavado de motor y teflón en las vestiduras.

4. **Encerado**: Extiende el servicio de lavado básico y agrega la funcionalidad de aplicación de jabón, cera espuma, encerado, pulido y descontaminación de la carrocería.

5. **Cristalizado**: Extiende el servicio de lavado básico y agrega la funcionalidad de porcelánica de carrocería y cristalizado de carrocería.

6. **EntregaDomicilio**: Extiende el servicio de lavado básico y agrega la funcionalidad de entrega a domicilio.

7. **iServicios**: Es una interfaz que define los métodos comunes para obtener la descripción y el precio de los servicios de lavado.

8. **VistaPrincipal**: Es la interfaz de usuario que permite al usuario seleccionar los servicios de lavado y proporcionar una matrícula. También muestra los precios de los servicios seleccionados.

9. **CtrlVistaPrincipal**: Actúa como el controlador que coordina la interacción entre la vista y el modelo. Controla la selección de servicios en la vista y utiliza las clases del modelo para crear un ticket.

10. **Ticket**: Utiliza la información proporcionada por el modelo y la muestra al usuario en un archivo PDF. Además, utiliza el patrón decorador para construir la descripción del servicio en el recibo.

## Autor

Este proyecto fue creado por Kevin Esguerra Cardona, estudiante del programa de Ingeniería en Sistemas y Computación de la Universidad Tecnológica de Pereira como solución al segundo parcial de la asignatura de POO/Programación 4 dirigida por el Profesor Guillermo Roberto Solarte Martinez en el semestre 2023-2.
