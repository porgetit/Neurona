# Modelo-Vista-Controlador (MVC) en Java

## Introducción

El patrón de diseño Modelo-Vista-Controlador (MVC) es un enfoque arquitectónico comúnmente utilizado en el desarrollo de aplicaciones de software. Proporciona una estructura organizada y modular para separar las preocupaciones y facilitar el mantenimiento, escalabilidad y reutilización del código. Este README explica el concepto MVC y su importancia en el mundo actual, junto con una descripción detallada de un ejemplo de programa Java que implementa este patrón.

## ¿Qué es MVC?

MVC se divide en tres componentes principales:

1. **Modelo**: Representa la lógica de negocios y los datos subyacentes. En nuestro ejemplo, la clase `Logic` se encarga del cálculo de sumas y restas, actuando como el Modelo.

2. **Vista**: Es la interfaz de usuario (UI) que muestra la información al usuario y recibe las interacciones del usuario. En nuestro caso, la clase `View` contiene los elementos gráficos (campos de texto, botones) y se encarga de la presentación de la aplicación.

3. **Controlador**: Actúa como intermediario entre el Modelo y la Vista. Gestiona las solicitudes del usuario desde la Vista y realiza las operaciones apropiadas en el Modelo. En nuestro ejemplo, la clase `Controller` hace de Controlador.

## Importancia de MVC

MVC ofrece varios beneficios clave en el desarrollo de software:

### Separación de preocupaciones:

MVC permite separar claramente la lógica de la aplicación, la presentación y la gestión de interacciones. Esto hace que el código sea más organizado y mantenible.

### Reutilización de código:

Cada componente MVC es independiente y puede reutilizarse en otros proyectos. Esto ahorra tiempo y esfuerzo en el desarrollo de futuras aplicaciones.

### Escalabilidad:

El enfoque modular de MVC facilita la escalabilidad. Puedes extender o modificar cada componente sin afectar otros aspectos de la aplicación.

## Ventajas de MVC

- **Mantenibilidad**: Cambios en la lógica de negocio no afectan directamente a la interfaz de usuario y viceversa.
- **Reutilización**: Los componentes pueden reutilizarse en diferentes proyectos.
- **Pruebas**: Facilita las pruebas unitarias, ya que los componentes son independientes y se pueden probar por separado.

## Desventajas de MVC

- **Complejidad inicial**: Puede parecer más complejo en aplicaciones pequeñas.
- **Overhead**: Para aplicaciones simples, MVC puede agregar una sobrecarga innecesaria.

## Descripción del Programa de Ejemplo

Este programa Java es una simple calculadora que puede sumar o restar dos números. Utiliza el patrón MVC de la siguiente manera:

- **Modelo (`Logic`)**: Realiza cálculos matemáticos de suma y resta.
- **Vista (`View`)**: Muestra una interfaz gráfica de usuario con campos de texto para ingresar números, botones para sumar y restar, y un campo de texto para mostrar el resultado.
- **Controlador (`Controller`)**: Actúa como intermediario entre la Vista y el Modelo. Maneja las interacciones del usuario y actualiza el Modelo y la Vista en consecuencia.

## Cómo Ejecutar el Programa

Si eres nuevo en Git y GitHub, sigue estos pasos para ejecutar el programa:

1. **Descarga el código**: Haz clic en el botón verde "Code" en la parte superior derecha de esta página y selecciona "Download ZIP". Descomprime el archivo descargado en tu computadora.

2. **Instala Java**: Asegúrate de tener Java instalado en tu computadora. Puedes descargarlo desde [el sitio web oficial de Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

3. **Abre el proyecto**: Utiliza un entorno de desarrollo como Apache NetBeans o IntelliJ IDEA. Abre el proyecto descomprimido.

4. **Ejecuta la aplicación**: Busca el archivo `MVC.java` en el proyecto y ejecútalo. Esto abrirá la interfaz gráfica de la calculadora.

5. **Usa la aplicación**: Ingresa dos números en los campos de texto, luego haz clic en los botones "+" o "-" para realizar la operación correspondiente. El resultado se mostrará en el campo de texto de resultado.

¡Eso es todo! Has ejecutado con éxito un programa Java que sigue el patrón MVC.

## Conclusión

El patrón de diseño MVC es fundamental en el desarrollo de software moderno, ya que promueve una arquitectura organizada y modular. El ejemplo de la calculadora proporcionado aquí ilustra cómo se puede implementar MVC en una aplicación Java simple. Al comprender y aplicar MVC, puedes construir aplicaciones más mantenibles y escalables.
