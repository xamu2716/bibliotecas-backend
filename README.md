# bibliotecas-backend

Backend del sistema de bibliotecas y libros. Spring Boot 4.1.1, Java 21 o superior, JPA/Hibernate y H2 en memoria.

## Requisitos

- Java 21 o superior
- Maven 3.9 o superior (opcional si se usa el wrapper `mvnw`)

No necesita instalar ninguna base de datos: usa H2 en memoria y los libros de prueba se cargan al iniciar.

## Ejecutar

Con Maven:

```bash
mvn spring-boot:run
```

Con el wrapper incluido:

```bash
./mvnw spring-boot:run
```

En Windows:

```bash
mvnw.cmd spring-boot:run
```

El backend queda en http://localhost:8080.

## Endpoints

| Método | Ruta | Acción |
| --- | --- | --- |
| POST | /bibliotecas | Registrar biblioteca |
| GET | /bibliotecas | Consultar bibliotecas con sus libros |

Body de `POST /bibliotecas`:

```json
{
  "nombre": "Biblioteca Sur",
  "direccion": "Carrera 30 # 5-10",
  "ciudad": "Bogotá"
}
```
