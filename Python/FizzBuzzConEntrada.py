"""
Instrucciones:
Versión modificada de FizzBuzz que:
- Solicita al usuario un número n
- Imprime la secuencia FizzBuzz hasta ese número
- Sigue las mismas reglas que FizzBuzz tradicional
"""

def main():
    try:
        print("Introduce un número: ")
        n = int(input())
        
        for i in range(1, n + 1):
            if i % 3 == 0 and i % 5 == 0:
                print("FizzBuzz")
            elif i % 3 == 0:
                print("Fizz")
            elif i % 5 == 0:
                print("Buzz")
            else:
                print(i)
    except ValueError:
        print("Por favor, ingrese un número válido")

if __name__ == "__main__":
    main()