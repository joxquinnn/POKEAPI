# --- Etapa 1: Construcción (Builder) ---
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /build

# Copiar configuración y descargar dependencias (optimiza la caché de Docker)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código fuente y compilar
COPY src ./src
RUN mvn clean package -DskipTests

# --- Etapa 2: Ejecución ---
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Requerimientos de la evaluación
ENV APP_ENV=production
EXPOSE 3001

# Copiar el JAR generado en la etapa anterior (usamos *.jar para evitar errores de versión)
COPY --from=builder /build/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]