"""
Instrucciones:
Este programa implementa una cuenta regresiva que:
- Comienza desde un número especificado por el usuario
- Imprime números en orden descendente
- Se detiene al llegar a 0
"""

def obtener_entrada():
    while True:
        try:
            inicio = int(input("Introduce el número de inicio de la cuenta regresiva: "))
            if inicio < 0:
                print("Error: Por favor, ingresa un número entero positivo o 0.")
            else:
                return inicio
        except ValueError:
            print("Error: Por favor ingresa un número entero válido.")

def main():
    inicio = obtener_entrada()
    while inicio >= 0:
        print(inicio)
        inicio -= 1

if __name__ == "__main__":
    main()
