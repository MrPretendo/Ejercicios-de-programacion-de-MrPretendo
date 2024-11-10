"""
Instrucciones:
Programa que ordena números ingresados por el usuario:
- Solicita 10 números positivos
- Valida que los números sean positivos
- Ordena los números de mayor a menor
- Muestra la lista ordenada
"""

def solicitar_numeros():
    numeros = []
    for i in range(10):
        while True:
            try:
                num = int(input(f"Ingrese el número {i + 1} (positivo): "))
                if num >= 0:
                    numeros.append(num)
                    break
                else:
                    print("Por favor, introduzca un número positivo.")
            except ValueError:
                print("Error: Introduzca un número entero válido.")
    return numeros

def main():
    numeros = solicitar_numeros()
    
    # Ordenar los números de mayor a menor usando sort()
    numeros.sort(reverse=True)
    
    # Mostrar el resultado
    print("Los números ordenados de mayor a menor son:")
    print(*numeros, sep=", ")

if __name__ == "__main__":
    main()