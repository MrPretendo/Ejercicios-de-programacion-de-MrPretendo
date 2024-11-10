"""
Instrucciones:
Este programa calcula los ingresos medios mensuales de una empresa:
- Utiliza una lista de ingresos mensuales durante un año
- Suma todos los ingresos
- Divide la suma entre el número de meses
- Muestra el resultado (promedio mensual)
"""

def main():
    revenue = [88750, 125430, 99700, 14500, 158000, 65000, 
                99000, 189000, 210000, 42000, 165800, 258900]
    sum_revenue = sum(revenue)  # Usando la función sum() de Python
    res = sum_revenue / len(revenue)
    print(res)

if __name__ == "__main__":
    main()