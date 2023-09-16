# Clase `MVC` en Java

## Descripción General

La clase `MVC` en Java es la clase principal que actúa como punto de entrada del programa MVC (Modelo-Vista-Controlador). Esta clase se encarga de crear instancias de la Vista, el Modelo y el Controlador, establecer sus conexiones y ejecutar la aplicación. A continuación, se explicará en detalle el funcionamiento de esta clase, bloque por bloque, junto con un breve tutorial sobre cómo crear un proyecto Java utilizando Maven en Apache NetBeans.

## Bloque 1: Importación de Paquetes y Clases

```java
package com.mycompany.mvc;

import Views.View;
import Models.Logic;
import Controllers.Controller;
```

- En este bloque, se importan las clases y paquetes necesarios para el programa. Se incluyen las clases `View`, `Logic` y `Controller` de sus respectivos paquetes.

## Bloque 2: Método `main`

```java
public static void main(String[] args) {
    View view = new View();
    Logic logic = new Logic();
    Controller ctrl = new Controller(view, logic);
    ctrl.init();
}
```

- El método `main` es el punto de entrada del programa. En este bloque:
  - Se crea una instancia de la Vista (`View`), el Modelo (`Logic`) y el Controlador (`Controller`).
  - Se establece la conexión entre el Controlador, la Vista y el Modelo pasando las instancias correspondientes como argumentos al Controlador.
  - Finalmente, se llama al método `init()` del Controlador para iniciar la aplicación.

## Crear un Proyecto Java con Maven en Apache NetBeans

Para crear un proyecto Java utilizando Maven en Apache NetBeans, sigue estos pasos:

1. Abre Apache NetBeans en tu computadora.

2. En la barra de menú, selecciona "File" (Archivo) y luego "New Project" (Nuevo proyecto).

3. En el asistente de nuevo proyecto, selecciona "Maven" y "Java Application" (Aplicación Java) y haz clic en "Next" (Siguiente).

4. Ingresa un nombre para tu proyecto en el campo "Project Name" (Nombre del proyecto) y una ubicación en "Project Location" (Ubicación del proyecto). Asegúrate de que la opción "Create Main Class" (Crear clase principal) esté marcada y proporciona un nombre, por ejemplo, "MVC".

5. Haz clic en "Finish" (Finalizar) para crear el proyecto.

6. En el proyecto recién creado, encontrarás una carpeta llamada "Source Packages" (Paquetes fuente). Haz clic derecho en esta carpeta y selecciona "New" (Nuevo) y luego "Java Class" (Clase Java).

7. Ingresa "MVC" como nombre de clase y haz clic en "Finish".

8. Ahora, puedes copiar y pegar el código de la clase `MVC` en la nueva clase que has creado.

9. Una vez que hayas pegado el código, puedes ejecutar la aplicación haciendo clic derecho en la clase `MVC` en el panel de proyectos y seleccionando "Run File" (Ejecutar archivo).

Con estos pasos, habrás creado un proyecto Java utilizando Maven en Apache NetBeans y ejecutado la clase `MVC` como punto de entrada del programa MVC.
