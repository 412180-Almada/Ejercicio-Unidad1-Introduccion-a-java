import java.util.Scanner;

//Hacer un programa que ingrese los datos de una factura en la cual haya tres
//artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
//Finalmente imprimir el total de la factura

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio unitario y abajo la cantidad x3: ");
        double precioU;
        int cantidad;
        double PrecioU2;
        int cantidad2;
        double PrecioU3;
        int cantidad3;

        if (sc.hasNextDouble())
        {
            precioU = sc.nextDouble();
        }
        else
        {
            precioU = 0;
        }
        if (sc.hasNextDouble())
        {
            cantidad = sc.nextInt();
        }
        else
        {
            cantidad = 0;
        }

        double Result1 = precioU*cantidad;

        if (sc.hasNextDouble())
        {
            PrecioU2 = sc.nextDouble();
        }
        else
        {
            PrecioU2 = 0;
        }
        if (sc.hasNextDouble())
        {
            cantidad2 = sc.nextInt();
        }
        else
        {
            cantidad2 = 0;
        }

        double Result2 = PrecioU2*cantidad2;


        if (sc.hasNextDouble())
        {
            PrecioU3 = sc.nextDouble();
        }
        else
        {
            PrecioU3 = 0;
        }
        if (sc.hasNextDouble())
        {
            cantidad3 = sc.nextInt();
        }
        else
        {
            cantidad3 = 0;
        }

        double Result3 = PrecioU3*cantidad3;

        System.out.println("Total producto 1: " + Result1);
        System.out.println("Total producto 2: " + Result2);
        System.out.println("Total producto 3: " + Result3);

        System.out.println("La suma total es :" + Total(Result1,Result2,Result3));
    }

    public static  double Total(double Result1, double Result2, double Result3)
    {
        double SumTotal;
        SumTotal = Result1+Result2+Result3;
        return SumTotal;
    }
}
