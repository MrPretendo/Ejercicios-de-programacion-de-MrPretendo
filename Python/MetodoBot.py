"""
Instrucciones:
Bot simple que responde a números específicos:
- Muestra un menú con opciones (1 o 2)
- Si el usuario ingresa 1: responde "Order confirmed"
- Si el usuario ingresa 2: responde "info@sololearn.com"
- Para cualquier otra entrada: responde "Try again"
"""

def bot():
    print("Ingresar palabra clave:")
    print("1 = Order confirmed:\n2 = info@sololean")
    try:
        x = int(input())
        respuestas = {
            1: "Order confirmed",
            2: "info@sololearn.com"
        }
        print(respuestas.get(x, "Try again"))
    except ValueError:
        print("Try again")

def main():
    bot()

if __name__ == "__main__":
    main()