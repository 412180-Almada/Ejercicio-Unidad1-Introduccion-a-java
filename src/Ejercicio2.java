import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Valor: ");
        double valor ;

        if (sc.hasNextDouble())
            valor = sc.nextDouble();
        else
            valor = 0;

        System.out.println("El valor con iva el producto es " + Iva(valor));
    }

    public  static  double Iva(double valor)
    {
        double resultado = valor * 0.21;
        double resultado2 = valor + resultado;
        return resultado2;
    }
}
