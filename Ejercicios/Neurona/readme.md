# Proyecto Neurona

El proyecto Neurona tiene como objetivo demostrar la utilidad de las neuronas de McCulloch-Pitts mediante la implementación de un modelo computacional que representa una neurona. Este modelo se ha construido en Java, siguiendo estrictamente el paradigma de programación orientada a objetos.

## Clase Neuron

La clase `Neuron` es la piedra angular del proyecto. Representa una neurona de McCulloch-Pitts y se caracteriza por tener pesos y un umbral. Los pesos y las entradas se multiplican y suman, y si el resultado supera el umbral, la neurona se activa devolviendo 1, de lo contrario, devuelve 0.

### Constructor
```java
public Neuron(List<Double> pesos, double umbral)
```

### Método de Activación
```java
public int activar(List<Double> entradas)
```

### Ejemplo de Uso
```java
Neuron compuerta = new Neuron(Arrays.asList(1.0, 1.0), 1.5);
int resultado = compuerta.activar(Arrays.asList(0.0, 1.0));
```

## Clase de Ejecución (Main)

La clase principal `Neurona` contiene una serie de pruebas que demuestran la capacidad del modelo construido para representar compuertas lógicas básicas y un comparador de magnitudes.

### Ejecutar Pruebas
```java
public static void main(String[] args)
{
    runTests();
}
```

### Pruebas Implementadas
1. **NOT**
    ```java
    private static void test1()
    ```

2. **OR**
    ```java
    private static void test2()
    ```

3. **AND**
    ```java
    private static void test3()
    ```

4. **XOR**
    ```java
    private static void test4()
    ```

5. **Comparador de magnitud**
    ```java
    private static void test5()
    ```

### Ejemplo de Uso (NOT)
```java
int resultado = Not(1);
```

### Ejemplo de Uso (OR)
```java
int resultado = Or(0, 1);
```

### Ejemplo de Uso (AND)
```java
int resultado = And(1, 1);
```

### Ejemplo de Uso (XOR)
```java
int resultado = Xor(0, 1);
```

### Ejemplo de Uso (Comparador de magnitud)
```java
ComparadorMagnitud(0, 1);
```

## Conclusiones

El proyecto Neurona no solo demuestra la capacidad de las neuronas de McCulloch-Pitts para representar compuertas lógicas, sino que también proporciona una clase que permite a los programadores construir redes de estas neuronas con configuraciones personalizables.

¡Experimenta y juega con las configuraciones para adaptarlas a tus necesidades de implementación!
