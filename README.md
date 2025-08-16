# 📘 Loops-Exercises

Este proyecto implementa una clase en Java para generar la **tabla de multiplicar** de un número dado. También incluye una suite de tests unitarios con **cobertura total** utilizando JaCoCo.

---

## 📌 Enunciado

Desarrollar una clase que, dado un número entero `n`, imprima su tabla de multiplicar del 1 al 10 con el formato:

```
n x i = resultado
```

🔹 Ejemplo para `n = 5`:

```
5 x 1 = 5
...
5 x 10 = 50
```

📎 La clase debía estar acompañada de pruebas unitarias y alcanzar al menos un **70% de cobertura**.

---

## ✅ Implementación

- Se creó la clase `TimesTable` con un método público que devuelve una lista con los resultados de la tabla.
- Se implementaron pruebas unitarias con **JUnit 5** para verificar:
  - Que se generan **exactamente 10 líneas**.
  - Que la **primera y última línea** son correctas.
- Se generó un reporte de cobertura con **JaCoCo**, alcanzando un **100% de cobertura**.

---

## 📚 Aprendizajes

- Uso de **Listas (`List` y `ArrayList`)** en Java.
- Implementación de **tests unitarios** con `assertEquals`.
- Ejecución de tests y generación de reportes con **Maven** y **JaCoCo**.
- Aplicación de buenas prácticas con Git: **commits en inglés**, uso de ramas y control de versiones por funcionalidad.

---