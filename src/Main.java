public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //nombre de variables y metodos en numenclatura camello
        /*
        Este es otro tipo de comentario
         */
        byte numerosHermanos =1;
        short cantidadCorta =350;
        int numeroClientes =1_234_234;
        long numeroLargo =1_234_456_123;
        System.out.println(numerosHermanos);
        System.out.println(cantidadCorta);
        System.out.println(numeroClientes);
        System.out.println(numeroLargo);
        //Numeros con decimales
        float numerosConDecimales =5.5F;
    double numeroConDecimalDoble =123_123_123.123;
        System.out.println(numerosConDecimales);
        System.out.println(numeroConDecimalDoble);
        boolean estaCasado =false;
        System.out.println(estaCasado);
        char lerta ='a';
        System.out.println(lerta);
        //Calcular el area de un caudrado cuyo lado mide 6
        byte lado =6;
        int areaCuadrado =lado*lado;
        System.out.println(areaCuadrado);
        //Calcular el area de un circulo cuyo radio es 3
        double radio=3;
        double areaCirculo =radio*radio*3.1416;
        System.out.println(areaCirculo);
        //Calcular el perimetro de un rectangulo cuya base es 4 y altura 3
        int base=4;
        int altura=3;
        int perimetroRectangulo =2*base+2*altura;
        System.out.println(perimetroRectangulo);
        /*
        Operadores aritmticos
         +, -, *, /, %
         */
        System.out.println(10%3);

        /*Operadores de comparacion
        >, <, >=, <=, ==, !=
         */
        int num1=5, num2=7;
        System.out.println(num1>num2);
        int num3=15, num4=7;
        System.out.println(num3>num4);
        int num5=20, num6=20;
        System.out.println(num5==num6);

        //Oferta -> si compras mas de 5 unidads se da el 10% de descuento
        //Decir si se compra 4 unudades si se obtiene el descuento
        //Definir una variable para las unidades
        //Hacer la comparacion
        int unidades =4;
        System.out.println(unidades>5);

        //Oferta -> si compras un importe de mas de 100€ se da el 5% de descuento
        //Se compraron 3 unidades de 15 €
        //¿Les corresponde el descuento?
        byte unidades2 =3;
        float precio =15F;
        System.out.println(unidades2*precio>100);

        int unidades3 =3;
        int precio1 =15;
        System.out.println(unidades3*precio1>100);



    }
}