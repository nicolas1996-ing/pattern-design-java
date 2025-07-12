# Comandos para instalar Java en Mac

## Listado completo de comandos utilizados:

### 1. Verificación inicial:
```bash
java -version
```

### 2. Verificación de Homebrew:
```bash
brew --version
```

### 3. Instalación de Java:
```bash
brew install openjdk@17
```

### 4. Configuración del sistema (crear enlaces simbólicos):
```bash
sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
```

### 5. Configuración del PATH:
```bash
echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
```

### 6. Recargar configuración del shell:
```bash
source ~/.zshrc
```

### 7. Verificaciones de instalación:
```bash
java -version
javac -version
```

### 8. Creación del archivo de prueba:
```bash
# Se creó el archivo HolaMundo.java con el contenido:
# public class HolaMundo {
#     public static void main(String[] args) {
#         System.out.println("¡Hola Mundo desde Java!");
#         System.out.println("Java está funcionando correctamente en tu Mac.");
#     }
# }
```

### 9. Compilación y ejecución del programa de prueba:
```bash
javac HolaMundo.java
java HolaMundo
```

## Comandos principales para uso futuro:

- `java -version` - Verificar versión de Java
- `javac -version` - Verificar versión del compilador
- `javac Archivo.java` - Compilar archivo Java
- `java Clase` - Ejecutar programa Java

## Resultado:
✅ Java 17 (OpenJDK) instalado y configurado correctamente en macOS
