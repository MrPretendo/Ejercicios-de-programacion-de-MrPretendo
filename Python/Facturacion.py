"""
Instrucciones:
Este programa calcula el precio final de un producto considerando:
- Precio base del producto
- Número de unidades
- Zona de venta (que determina el descuento)
Los descuentos son:
- Zonas A, B: 10%
- Zonas C, D, E: 5%
- Zonas F, G, H, I: 10%
- Otras zonas: 0%
"""

def main():
    try:
        # Solicita el precio y valida que sea positivo
        precio = float(input("Introduce precio del producto: "))
        if precio <= 0:
            print("Error: El precio debe ser un número positivo.")
            return

        # Solicita el número de unidades y valida que sea positivo
        unidades = int(input("Introduce las unidades del producto: "))
        if unidades <= 0:
            print("Error: El número de unidades debe ser un número entero positivo.")
            return

        # Solicita la zona
        zona = input("Introduce zona: ").strip().upper()
        
        # Diccionario de descuentos por zona
        descuentos = {
            'A': 10, 'B': 10,
            'C': 5, 'D': 5, 'E': 5,
            'F': 10, 'G': 10, 'H': 10, 'I': 10
        }

        # Verifica si la zona es válida
        if not zona.isalpha() or len(zona) > 1:
            print("Error: La zona debe ser una letra.")
            return

        # Obtiene el descuento o asigna 0 si no está en el diccionario
        descuento = descuentos.get(zona, 0)
        
        # Calcula el precio final
        precio_final = precio * unidades * (100 - descuento) / 100
        print(f"Precio final: {precio_final:.2f}")
    
    except ValueError:
        print("Error: Ingrese valores numéricos válidos para el precio y las unidades.")

if __name__ == "__main__":
    main()