"""
Instrucciones:
Programa para una máquina expendedora de bebidas que:
- Muestra un menú de bebidas disponibles
- Acepta la selección del usuario como número
- Muestra la bebida seleccionada
- Valida que la selección sea válida
- Muestra "Invalido" si la selección está fuera de rango o si hay una entrada errónea
"""

def mostrar_menu():
    print("Seleccionar una bebida: ")
    print("1. Tea")
    print("2. Espresso")
    print("3. Americano")
    print("4. Water")
    print("5. Hot Chocolate")

def main():
    menu = ["Tea", "Espresso", "Americano", "Water", "Hot Chocolate"]
    
    while True:
        mostrar_menu()
        try:
            seleccion = int(input("Introduce el número de tu selección (1-5): "))
            if 1 <= seleccion <= 5:
                print(f"Has seleccionado: {menu[seleccion - 1]}")
                break  # Sale del bucle si la selección es válida
            else:
                print("Invalido: Por favor elige un número entre 1 y 5.")
        except ValueError:
            print("Invalido: Por favor introduce un número entero.")

if __name__ == "__main__":
    main()
