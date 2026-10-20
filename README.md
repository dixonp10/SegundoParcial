# APE 4: Introducción a la POO en Java

**Universidad Técnica de Ambato**
Facultad de Ingeniería en Sistemas, Electrónica e Industrial
Carrera de Software · Ciclo académico: julio – diciembre 2026

- **Alumno:** Dixon Johao Prado Falcones
- **Docente:** Ing. Ruben Caiza, Mg.
- **Modalidad:** Individual

## Descripción

Desarrollo de cinco ejercicios en Java aplicando clases, objetos, atributos, referencias y estructuras de control.

| N.º | Ejercicio | Clases |
|-----|-----------|--------|
| 1 | Notas del curso | `Estudiante` |
| 2 | Inventario de una tienda | `Producto` |
| 3 | Veterinaria | `Mascota` |
| 4 | Cuenta de ahorro | `Cuenta` |
| 5 | Biblioteca | `Libro`, `Socio` |

## Estructura del proyecto

```
APE4_POO_Java/
├── src/
│   ├── ejercicio1/   Estudiante.java, Main.java
│   ├── ejercicio2/   Producto.java, Main.java
│   ├── ejercicio3/   Mascota.java, Main.java
│   ├── ejercicio4/   Cuenta.java, Main.java
│   └── ejercicio5/   Libro.java, Socio.java, Main.java
└── salidas/          salida_ejercicio1.txt ... salida_ejercicio5.txt
```

## Cómo ejecutar

Requisitos: JDK 17 o superior.

```bash
javac -d out $(find src -name "*.java")
java -cp out ejercicio1.Main
```

Cambiar `ejercicio1` por `ejercicio2`, `ejercicio3`, `ejercicio4` o `ejercicio5` para ejecutar los demás.

También se puede abrir la carpeta en NetBeans, IntelliJ IDEA o Eclipse y ejecutar la clase `Main` de cada paquete.

## Salidas

La salida de cada ejecución está en la carpeta [`salidas/`](salidas).
