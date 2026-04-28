# Reto 3 - API REST de Inscripción de Materias (Omnicode)

Este repositorio corresponde a una **prueba técnica del aplicativo "Omnicode"**.

El objetivo es mostrar una implementación **básica y educativa** de una API REST en Spring Boot para la inscripción de materias en una universidad, siguiendo el enfoque solicitado en clase.

## Objetivo de la prueba

- Construir un CRUD con arquitectura simple (`controller`, `service`, `entity`).
- Implementar operaciones REST: `GET`, `POST`, `PUT`, `DELETE`.
- Exponer documentación con Swagger/OpenAPI para facilitar las pruebas.

## Nota importante

Esta solución está preparada para fines de aprendizaje y demostración.

- La persistencia es **en memoria** (no usa base de datos).
- Está diseñada para ver la ejecución rápida del flujo CRUD.
- Para la entrega/evaluación, **sigue los pasos indicados en las diapositivas** del curso.

## Tecnologías usadas

- Java 21
- Spring Boot 3
- Spring Web
- Springdoc OpenAPI (Swagger UI)
- Maven

## Estructura del proyecto

- `src/main/java/omnicode/prueba/reto3/Reto3Application.java`
- `src/main/java/omnicode/prueba/reto3/entity/Inscripcion.java`
- `src/main/java/omnicode/prueba/reto3/service/InscripcionService.java`
- `src/main/java/omnicode/prueba/reto3/controller/InscripcionController.java`
- `src/main/java/omnicode/prueba/reto3/config/OpenApiConfig.java`

## Cómo ejecutar el proyecto

1. Clona o descarga este repositorio.
2. Abre una terminal en la raíz del proyecto.
3. Ejecuta:

```bash
./mvnw spring-boot:run
```

En Windows (PowerShell) también puedes usar:

```powershell
./mvnw.cmd spring-boot:run
```

La aplicación iniciará en:

- `http://localhost:8080`

## Documentación Swagger

Cuando la app esté corriendo, abre:

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/api-docs`

## Endpoints del CRUD

- `GET /api/inscripciones` -> Listar todas las inscripciones.
- `GET /api/inscripciones/{id}` -> Consultar una inscripción por ID.
- `POST /api/inscripciones` -> Crear una inscripción.
- `PUT /api/inscripciones/{id}` -> Actualizar una inscripción.
- `DELETE /api/inscripciones/{id}` -> Eliminar una inscripción.

## Ejemplo de body para POST/PUT

```json
{
  "codigoEstudiante": "2026001",
  "nombreEstudiante": "Ana Gomez",
  "codigoMateria": "MAT101",
  "nombreMateria": "Calculo I",
  "semestre": "2026-1"
}
```

## Recomendación para la presentación

Para la sustentación de la prueba de Omnicode:

1. Levanta el proyecto.
2. Entra a Swagger.
3. Ejecuta `POST`, luego `GET`, después `PUT` y finalmente `DELETE`.
4. Verifica cada respuesta HTTP.
5. Asegúrate de seguir el orden y lineamientos de las **diapositivas**.


## Authors

@Omnicode
