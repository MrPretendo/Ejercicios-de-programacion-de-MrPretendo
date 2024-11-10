def fahr(c):
    temp = 1.8 * c + 32
    return temp

def main():
    c = float(input("Ingresa grados celsius: "))
    print("Los grados Fahrenheit son:")
    print(fahr(c))

if __name__ == "__main__":
    main()