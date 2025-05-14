# Compiler
JAVAC = javac
JAVA = java

# Directories
SRC_DIR = .
COMPILED_DIR = compiled

# Packages
COMPLEX_PKG = complex
MAIN_PKG = main

# Source files
COMPLEX_SRC = $(SRC_DIR)/complex/Complex.java
MAIN_SRC = $(SRC_DIR)/main/Main.java

# Class files
COMPLEX_CLASS = $(COMPILED_DIR)/complex/Complex.class
MAIN_CLASS = $(COMPILED_DIR)/main/Main.class

# Default target
all: $(MAIN_CLASS)

# Compile Complex class
$(COMPLEX_CLASS): $(COMPLEX_SRC)
	mkdir -p $(COMPILED_DIR)
	$(JAVAC) -d $(COMPILED_DIR) $(COMPLEX_SRC)

# Compile Main class
$(MAIN_CLASS): $(COMPLEX_CLASS) $(MAIN_SRC)
	$(JAVAC) -d $(COMPILED_DIR) $(MAIN_SRC)

# Run the program
run: all
	$(JAVA) -cp $(COMPILED_DIR) main.Main

# Clean up compiled files
clean:
	rm -rf $(COMPILED_DIR)
