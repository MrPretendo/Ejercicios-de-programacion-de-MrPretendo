/*El código dado declara una matriz que contiene los ingresos mensuales de una empresa durante un año.
Necesitas calcular los ingresos medios mensuales para el año.
Para ello, calcula la suma de los ingresos de todos los meses y divídela por el número de artículos de la matriz. */



public class IngresosAnuales {
        public static void main(String[] args) {
            double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
            double sum = 0;
            double res;

            for (double x : revenue){
                sum += x;
            }
        res = sum / revenue.length;
        System.out.println(res);
    }//End main
}//End class
