# Clase `Controller` en Java

## Descripción General

La clase `Controller` en Java es una parte crucial del patrón de diseño Modelo-Vista-Controlador (MVC). Esta clase actúa como intermediario entre la Vista y el Modelo, gestionando las interacciones del usuario y las operaciones relacionadas con los datos. A continuación, se explicará en detalle el funcionamiento de esta clase, bloque por bloque, junto con un breve tutorial sobre cómo crear un paquete "Controllers" en el IDE Apache NetBeans para una mejor organización.

## Bloque 1: Declaración de Variables

```java
View view;
Logic logic;
```

- En este bloque, se declaran dos variables privadas: `view` y `logic`. Estas variables se utilizarán para representar la Vista y el Modelo relacionados con esta clase.

## Bloque 2: Constructor

```java
public Controller(View view, Logic logic) {
    this.view = view;
    this.logic = logic;

    this.view.Num1.addActionListener(this);
    this.view.Num2.addActionListener(this);
    this.view.Result.addActionListener(this);
    this.view.Sum.addActionListener(this);
    this.view.Dif.addActionListener(this);
    this.logic.sum();
    this.logic.dif();
}
```

- El constructor recibe dos argumentos: una instancia de la Vista (`View`) y una instancia del Modelo (`Logic`). Estas instancias se utilizan para establecer las conexiones entre el Controlador, la Vista y el Modelo.

- A través de este bloque, se realizan las siguientes acciones:
  - Se asocian varios componentes de la Vista (`view.Num1`, `view.Num2`, `view.Result`, `view.Sum` y `view.Dif`) con el Controlador, permitiendo que el Controlador responda a eventos generados por estos componentes.

  - Se llama a los métodos `sum()` y `dif()` del Modelo (`logic`) para realizar operaciones de suma y resta. Aunque estos resultados no se muestran de inmediato en la Vista, se calculan previamente.

## Bloque 3: Método `actionPerformed`

```java
@Override
public void actionPerformed(ActionEvent e) {
    logic.setA(Double.parseDouble(view.Num1.getText()));
    logic.setB(Double.parseDouble(view.Num2.getText()));

    if (e.getSource() == view.Sum) {
        view.Result.setText(String.valueOf(logic.sum()));
    } else if (e.getSource() == view.Dif) {
        view.Result.setText(String.valueOf(logic.dif()));
    }
}
```

- Este método se implementa debido a que la clase `Controller` implementa la interfaz `ActionListener`, lo que la habilita para responder a eventos generados por componentes de la Vista.

- En este bloque:
  - Se obtienen los valores ingresados por el usuario desde los campos de texto de la Vista (`view.Num1` y `view.Num2`).

  - Se verifica cuál botón se presionó (`view.Sum` o `view.Dif`) y se realiza la operación de suma o resta apropiada utilizando el Modelo (`logic`).

  - El resultado se muestra en el campo de texto de la Vista (`view.Result`) como una cadena de texto.

## Bloque 4: Método `init()`

```java
public void init() {
    view.setTitle("wenas pah!");
    view.setLocationRelativeTo(null);
    view.setVisible(true);
}
```

- El método `init()` es una parte esencial de la clase `Controller`. Este método se utiliza para inicializar y mostrar la interfaz gráfica de usuario (UI) al usuario cuando se ejecuta el programa.

- En este bloque:
  - Se establece el título de la ventana de la Vista utilizando el método `setTitle()`. En este caso, se establece como "wenas pah!", pero puedes personalizarlo según tus necesidades.

  - Se utiliza el método `setLocationRelativeTo(null)` para centrar la ventana de la Vista en la pantalla del usuario. Esto garantiza que la ventana aparezca en el centro de la pantalla.

  - Finalmente, se hace visible la ventana de la Vista utilizando el método `setVisible(true)`. Esto permite que el usuario interactúe con la interfaz gráfica y realice las operaciones de suma y resta.

El método `init()` es llamado después de la configuración inicial en el constructor de la clase `Controller`, y es responsable de iniciar la aplicación y mostrar la interfaz gráfica al usuario.

## Creación de un Paquete "Controllers" en Apache NetBeans

Para organizar tu proyecto MVC en Apache NetBeans y crear un paquete "Controllers" que contenga la clase `Controller`, sigue estos pasos:

1. Abre tu proyecto en Apache NetBeans.

2. Haz clic derecho en la carpeta del proyecto en el panel "Projects".

3. Selecciona "New" y luego "Java Package".

4. En el cuadro de diálogo emergente, ingresa el nombre "Controllers" para el nuevo paquete y haz clic en "Finish".

5. Ahora, puedes mover la clase `Controller` a este nuevo paquete. Para hacerlo, simplemente arrastra y suelta la clase desde su ubicación actual en el paquete principal a la carpeta "Controllers" que acabas de crear en el panel "Projects".

Con esto, has organizado tu proyecto de acuerdo con el patrón MVC, separando claramente la lógica del controlador en el paquete "Controllers". Esto facilita la mantenibilidad y comprensión de tu código.
