"""
Instrucciones:
Este programa verifica si un usuario es elegible basado en su país y edad.
- Solicita al usuario ingresar un país (abreviatura de dos letras, por ejemplo, "US" o "GB")
- Solicita al usuario ingresar una edad (número entre 0 y 100)
- Si el país es "US" o "GB" y la edad está entre 0 y 100 (exclusivo), muestra "Allowed"
- Maneja las excepciones si la edad no es un número válido
- Muestra mensajes de error si la entrada es inválida
"""

def main():
    try:
        # Solicita la entrada del país
        country = input("Ingresa el país (abreviatura de dos letras, ej.: 'US', 'GB'): ").strip().upper()
        
        # Verifica si el país es válido
        if country not in ["US", "GB"]:
            print("País no permitido. Debes ingresar 'US' o 'GB'.")
            return

        # Solicita la edad
        age_input = input("Ingresa tu edad: ")
        
        # Convierte la edad a entero y verifica el rango
        age = int(age_input)
        if 0 < age < 100:
            print("Allowed")
        else:
            print("Edad fuera de rango permitido (debe estar entre 0 y 100).")
            
    except ValueError:
        print("Edad no válida. Por favor, ingresa un número.")

if __name__ == "__main__":
    main()
