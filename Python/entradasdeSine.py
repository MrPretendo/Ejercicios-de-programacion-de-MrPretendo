def main():
    seats = [
        [0, 0, 0, 1, 1, 1, 0, 0, 1, 1],
        [1, 1, 0, 1, 0, 1, 1, 0, 0, 0],
        [1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
        [0, 0, 0, 1, 1, 1, 1, 0, 0, 0],
        [0, 1, 1, 1, 0, 0, 0, 1, 1, 1]
    ]

    row = int(input("Ingresa la fila: "))
    col = int(input("Ingresa la columna: "))

    for i in range(len(seats)):
        for j in range(len(seats[i])):
            if i == row and j == col:
                print("Free" if seats[i][j] == 0 else "Sold")

if __name__ == "__main__":
    main()