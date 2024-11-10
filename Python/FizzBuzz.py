"""
Instrucciones:
Implementación clásica de FizzBuzz:
- Imprime números del 1 al 100
- Para múltiplos de 3, imprime "Fizz"
- Para múltiplos de 5, imprime "Buzz"
- Para múltiplos de ambos, imprime "FizzBuzz"
- Para otros números, imprime el número mismo
"""

def main():
    for i in range(1, 101):
        if i % 3 == 0 and i % 5 == 0:
            print("FizzBuzz")
        elif i % 3 == 0:
            print("Fizz")
        elif i % 5 == 0:
            print("Buzz")
        else:
            print(i)

if __name__ == "__main__":
    main()