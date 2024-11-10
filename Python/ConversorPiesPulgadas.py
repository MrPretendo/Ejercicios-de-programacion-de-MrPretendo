"""
Necesitas hacer un método que convierta un valor de pies a pulgadas.
1 pie tiene 12 pulgadas.
Define un método convert() que tome el valor foot como su argumento y de como 
resultado el valor de las pulgadas. El resultado debe ser un double.
"""

def convert(foot):
    inch = 12
    num = foot * inch
    print(f"El valor de pies a pulgadas es: {num}")

def main():
    num = float(input("Valor de pies: "))
    convert(num)

if __name__ == "__main__":
    main()