# SelemiunTest🚀

Este repositorio contiene pruebas automatizadas utilizando **Selenium** para validar la funcionalidad de la plataforma **Demoblaze**. Las pruebas están diseñadas para cubrir casos de uso relacionados con el registro de usuarios, inicio de sesión, gestión del carrito de compras y realización de transacciones.

## Descripción del Proyecto

El proyecto está enfocado en garantizar la calidad del software mediante la automatización de pruebas funcionales. Se han implementado casos de prueba para validar:

- **Registro de usuarios**: Validación de registro exitoso, manejo de errores con usuarios existentes y campos vacíos.
- **Inicio de sesión**: Pruebas de autenticación con credenciales válidas, incorrectas y ausentes.
- **Gestión del carrito de compras**: Adición, eliminación y cálculo del total de productos en el carrito.
- **Realización de compras**: Validación del proceso de compra, incluyendo casos con carrito vacío y campos incompletos.

Además, se incluyen pruebas de integración para validar el endpoint de login utilizando **Postman**, las cuales se encuentran en el archivo `Test de Endpoint del login de Demoblaze.postman_collection.json`.

## 📂 Estructura del Proyecto

SelemiunTest/

│── .idea/                               # Configuración del entorno (IDE)

│── src/main/                            # Código fuente de las pruebas

│── Plantilla Casos de Prueba.xlsx   # Plantilla para la documentación de casos de prueba

│── Test de Endpoint del login de Demoblaze.postman_collection.json  # Colección de pruebas API en Postman

│── .gitignore                   # Archivos ignorados por Git

│── pom.xml                      # Archivo de configuración de Maven


## 🛠️ Tecnologías Utilizadas

Para ejecutar las pruebas, asegúrate de tener instalado:

- **Java JDK 8 o superior:** Lenguaje de programación para las pruebas automatizadas. 
- **Maven** (para la gestión de dependencias)
- **Selenium WebDriver:** Framework de automatización de pruebas en navegadores.
- **ChromeDriver** o el driver correspondiente a tu navegador.
- **Postman** (opcional, para ejecutar las pruebas de API).

## 🚀 Instalación y Uso

1. **Clonar el repositorio**  
   ```sh
   git clone https://github.com/JuanMartinezCG/SelemiunTest.git
   ```
   ```sh
   cd SelemiunTest```

2. **Configurar dependencias**  
   Asegúrate de tener **Java** y **Maven** instalados. Luego, ejecuta:
   ```sh
   mvn clean install```

3. **Ejecutar pruebas Selenium**  
   ```sh
   mvn test
   ```

4. **Importar colección Postman**  
   - Abre Postman y selecciona **Importar**.
   - Carga el archivo `Test de Endpoint del login de Demoblaze.postman_collection.json`.
   - Ejecuta los casos de prueba en la colección.
