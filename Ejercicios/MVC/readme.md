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

# Cómo Ejecutar el Programa

Este programa se encuentra alojado en un repositorio de GitHub llamado "Progra 4" y se ubica en la siguiente ruta: [Ejercicios/MVC](https://github.com/porgetit/progra4/tree/main/Ejercicios/MVC).

Para ejecutar el programa y probarlo, sigue estos pasos:

## Descargar el Repositorio Usando Git

1. Si no tienes Git instalado en tu computadora, descárgalo e instálalo desde [el sitio web oficial de Git](https://git-scm.com/).

2. Abre una terminal o línea de comandos en tu computadora.

3. Navega hasta el directorio donde deseas descargar el repositorio. Puedes hacerlo utilizando el comando `cd` seguido de la ruta del directorio. Por ejemplo:

   ```shell
   cd directorio/de/destino
   ```

4. Una vez en el directorio deseado, utiliza el siguiente comando para clonar el repositorio "Progra 4" que contiene el programa MVC:

   ```shell
   git clone https://github.com/porgetit/progra4.git
   ```

   Esto descargará el repositorio completo en tu computadora, incluyendo el programa MVC en la ubicación correcta.

## Ejecutar el Programa en Apache NetBeans

1. Abre Apache NetBeans, y selecciona "File" (Archivo) en la parte superior izquierda.

2. Selecciona "Open Project" (Abrir proyecto) y navega hasta la ubicación donde descargaste el repositorio "Progra 4".

3. Dentro del repositorio, navega a la carpeta "Ejercicios/MVC" y selecciona el archivo "MVC.java". Este es el punto de entrada del programa.

4. Haz clic en "Open Project" (Abrir proyecto) en NetBeans.

5. Ahora puedes ejecutar el programa seleccionando "Run" (Ejecutar) en la parte superior de NetBeans o haciendo clic derecho en "MVC.java" en el panel de proyectos y seleccionando "Run File" (Ejecutar archivo).

El programa MVC se abrirá y podrás usar la interfaz gráfica para realizar sumas y restas de números.

Siguiendo estos pasos, habrás descargado el repositorio, abierto el proyecto en NetBeans y ejecutado el programa MVC en tu computadora.

## Conclusión

El patrón de diseño MVC es fundamental en el desarrollo de software moderno, ya que promueve una arquitectura organizada y modular. El ejemplo de la calculadora proporcionado aquí ilustra cómo se puede implementar MVC en una aplicación Java simple. Al comprender y aplicar MVC, puedes construir aplicaciones más mantenibles y escalables.
