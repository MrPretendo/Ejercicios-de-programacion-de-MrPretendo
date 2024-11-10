def main():
    primo = True
    
    n = int(input("Ingresa primer número: "))
    
    for i in range(2, n):
        if n % i == 0:
            primo = False
            break
    
    if primo:
        print(f"El número {n} SÍ es primo")
    else:
        print(f"El número {n} no es primo")

if __name__ == "__main__":
    main()