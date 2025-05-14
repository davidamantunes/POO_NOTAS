Este documento explica como compilar, criar um Manifest e correr código e jar files.

1. Compilar:
```bash
javac hello/HelloWorld.java
```

2. Run:
```bash
java HelloWorld
```

3. Criar manifest.txt (add \n at the end):
```bash
Main-Class: hello.HelloWorld

```

4. Package the .jar File
```bash
jar cfm HelloWorld.jar manifest.txt hello/*.class
```

5. Package the .jar File
```bash
java -jar HelloWorld.jar
```
