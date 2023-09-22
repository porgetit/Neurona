# Clase `Logic` en Java

## Descripción General

La clase `Logic` en Java es parte del patrón de diseño Modelo-Vista-Controlador (MVC). Esta clase se encarga de realizar cálculos matemáticos simples, en este caso, suma y resta. A continuación, se explicará en detalle el funcionamiento de esta clase, bloque por bloque, junto con un breve tutorial sobre cómo crear un paquete Models en el IDE Apache NetBeans para una mejor organización.

## Bloque 1: Declaración de Variables

```java
private double a, b;
```

- En este bloque, se declaran dos variables privadas, `a` y `b`, que se utilizarán para almacenar los números que se sumarán o restarán.

## Bloque 2: Constructor Predeterminado

```java
public Logic() {
}
```

- Este es el constructor predeterminado de la clase. No realiza ninguna acción específica al crear una instancia de `Logic`. 

## Bloque 3: Constructor con Parámetros

```java
public Logic(double a, double b) {
    this.a = a;
    this.b = b;
}
```

- Este constructor permite crear una instancia de `Logic` e inicializar las variables `a` y `b` con valores específicos. Se utiliza para establecer los valores iniciales de los números que se sumarán o restarán.

## Bloque 4: Métodos Getters y Setters

```java
public double getA() {
    return a;
}

public void setA(double a) {
    this.a = a;
}

public double getB() {
    return b;
}

public void setB(double b) {
    this.b = b;
}
```

- Estos métodos permiten acceder y modificar las variables `a` y `b` de manera controlada. Los métodos `get` se utilizan para obtener el valor de las variables, mientras que los métodos `set` se utilizan para establecer nuevos valores.

## Bloque 5: Método de Suma

```java
public double sum() {
    return this.a + this.b;
}
```

- Este método realiza una suma de los valores de `a` y `b` y devuelve el resultado como un valor de tipo `double`.

## Bloque 6: Método de Resta

```java
public double dif() {
    return this.a - this.b;
}
```

- Este método realiza una resta de los valores de `a` y `b` y devuelve el resultado como un valor de tipo `double`.

## Creación de un Paquete "Models" en Apache NetBeans

Para organizar tu proyecto MVC en Apache NetBeans, sigue estos pasos para crear un paquete "Models" que contenga la clase `Logic`:

1. Abre tu proyecto en Apache NetBeans.

2. Haz clic derecho en la carpeta del proyecto en el panel "Projects".

3. Selecciona "New" y luego "Java Package".

4. En el cuadro de diálogo emergente, ingresa el nombre "Models" para el nuevo paquete y haz clic en "Finish".

5. Ahora, puedes mover la clase `Logic` a este nuevo paquete. Para hacerlo, simplemente arrastra y suelta la clase desde su ubicación actual en el paquete principal a la carpeta "Models" que acabas de crear en el panel "Projects".

Con esto, has organizado tu proyecto de acuerdo con el patrón MVC, separando claramente la lógica de negocio en el paquete "Models". Esto facilita la mantenibilidad y comprensión de tu código.
