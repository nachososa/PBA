# Compilar y Correr

```bash
# Ubicacion
cd U3_Interfaces

# Ejemplo 1
javac -d bin PBA_1_ejemplo1/*.java
java -cp bin PBA_1_ejemplo1.Main

# Ejemplo 2 
javac -d bin PBA_2_vehiculos/*.java
java -cp bin PBA_2_vehiculos.Main


# Ejemplo 3 
# personas/
javac -d bin PBA_3_relaciones/personas/*.java PBA_3_relaciones/relaciones/*.java
java -cp bin personas.Main

# numeros/
javac -d bin PBA_3_relaciones/numeros/*.java PBA_3_relaciones/relaciones/*.java
java -cp bin numeros.Main

# Ejemplo 
cd PBA_3_relaciones2_menu/
javac -d bin PBA_3_relaciones2_menu/ui/*.java
java -cp bin PBA_3_relaciones2_menu.ui.Main


# PBA_4_interfaces1
cd U3_Interfaces/PBA_4_interfaces1/
javac -d bin *.java
java -cp bin PBA_4_interfaces1.Main

```
