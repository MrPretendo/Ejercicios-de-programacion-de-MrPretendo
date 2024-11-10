def main():
    media = 0.0
    datos = [4, 8, 2, 11, 8, 9, 23, 7, 11, 14]
    
    max_num = datos[0]
    for n in datos:
        media += n
        if n > max_num:
            max_num = n
    
    media = media / len(datos)
    print(f"La media es: {media}")
    print(f"El mayor es: {max_num}")

if __name__ == "__main__":
    main()