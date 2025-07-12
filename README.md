## ✈️ Filtrador de Vuelos en Java

Este proyecto es una aplicación Java que permite gestionar y filtrar una lista de vuelos según distintos criterios de fechas. Está construido utilizando **Streams**, **Optionals** y clases **utilitarias**.

---

## 📦 Estructura del proyecto
- Crear un package llamado entities para que crees tu entidad Vuelo.
- Crear un package llamado utils para que crees tu clase utilitaria para la función de filtro.

---

## 📌 Requisitos
- JDK 17 o superior
- IDE como IntelliJ, Eclipse, VSCode (o compilador por consola)

---

## 🛫 Lógica del filtrado

La función `filtrarVuelos(...)` de `ControladorVuelos` se comporta así:

- ✅ Si se proporcionan `fechaDesde` y `fechaHasta` → devuelve vuelos entre esas fechas
- 📆 Solo `fechaDesde` → devuelve vuelos desde esa fecha en adelante
- 🕒 Solo `fechaHasta` → devuelve vuelos hasta esa fecha
- ✳️ Ninguna fecha → devuelve todos los vuelos


---

##  Cómo ejecutar
1. Clona o descarga el proyecto
2. Abrir en tu IDE 
3. Asegurarse de tener instalado JDK 17 o superior
4. Ejecutá el archivo `Main.java` dentro de la carpeta `src/`



