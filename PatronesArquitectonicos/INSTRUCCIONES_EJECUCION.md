# Instrucciones para ejecutar el proyecto PatronesArquitectonicos

## 📁 Estructura del proyecto
```
PatronesArquitectonicos/
├── src/                    # Código fuente
│   ├── mvc/               # Patrón Model-View-Controller
│   ├── businessdelegate/   # Patrón Business Delegate
│   ├── dataaccessobject/   # Patrón Data Access Object
│   ├── interceptingfilter/ # Patrón Intercepting Filter
│   ├── frontcontroller/    # Patrón Front Controller
│   ├── compositeentity/    # Patrón Composite Entity
│   ├── servicelocator/     # Patrón Service Locator
│   ├── microservices/      # Patrón Microservices
│   └── module-info.java    # Configuración del módulo
├── bin/                    # Archivos compilados
├── .project                # Configuración de Eclipse
├── .classpath              # Classpath de Eclipse
└── ejecutar_patrones.sh    # Script para ejecutar todos los patrones
```

## 🚀 Comandos para ejecutar el proyecto

### 1. Compilar el proyecto:
```bash
cd PatronesArquitectonicos
javac -d bin src/**/*.java
```

### 2. Ejecutar patrones individuales:

#### Patrón MVC:
```bash
java -cp bin mvc.Main
```

#### Patrón Business Delegate:
```bash
java -cp bin businessdelegate.Main
```

#### Patrón Data Access Object:
```bash
java -cp bin dataaccessobject.Main
```

#### Patrón Intercepting Filter:
```bash
java -cp bin interceptingfilter.Main
```

#### Patrón Front Controller:
```bash
java -cp bin frontcontroller.Main
```

#### Patrón Composite Entity:
```bash
java -cp bin compositeentity.Main
```

#### Patrón Service Locator:
```bash
java -cp bin servicelocator.Main
```

#### Patrón Microservices:
```bash
java -cp bin microservices.Main
```

### 3. Ejecutar todos los patrones de una vez:
```bash
./ejecutar_patrones.sh
```

## 📋 Patrones implementados

1. **MVC (Model-View-Controller)**: Separa la lógica de negocio, la presentación y el control
2. **Business Delegate**: Reduce el acoplamiento entre la capa de presentación y la capa de negocio
3. **Data Access Object**: Abstrae y encapsula el acceso a datos
4. **Intercepting Filter**: Procesa solicitudes y respuestas antes y después de su manejo
5. **Front Controller**: Centraliza el manejo de solicitudes
6. **Composite Entity**: Maneja entidades complejas como objetos simples
7. **Service Locator**: Localiza servicios JNDI y los cachea
8. **Microservices**: Demuestra la arquitectura de microservicios

## ✅ Resultado esperado

Al ejecutar todos los patrones deberías ver:
- Información de usuarios y estudiantes
- Procesamiento de solicitudes web
- Ejecución de servicios
- Manejo de entidades complejas
- Operaciones de microservicios

## 🔧 Requisitos

- Java 17 o superior
- Terminal con acceso a comandos Java
