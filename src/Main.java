import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
       // Declarar dos variables enteras y cargar sus valores por teclado. Informar su suma,diferencia, producto y cociente.//
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int Numero1;
        System.out.println("ingrese el segundo numero: ");
        int Numero2;

        if (sc.hasNextInt())
            Numero1 = sc.nextInt();
        else
            Numero1 = 0;

        if (sc.hasNextInt())
            Numero2 = sc.nextInt();
        else
            Numero2 = 0;

        System.out.println("La suma es : " + Suma(Numero1, Numero2));
        System.out.println("La resta es : " + Resta(Numero1, Numero2));
        System.out.println("La Multiplicacion es : " + Multipli(Numero1, Numero2));
        System.out.println("La Division es : " + division(Numero1, Numero2));
    }
    public static int Suma(int Numero1, int Numero2)
    {
        int Resultado = Numero1 + Numero2;
        return Resultado;
    }
    public static int Resta(int Numero1, int Numero2)
    {
        int Resultado2 = Numero1 - Numero2;
        return Resultado2;
    }
    public static double Multipli(int Numero1, int Numero2)
    {
        double Resultado3 = Numero1 * Numero2;
        return Resultado3;
    }
    public static double division(int Numero1, int Numero2)
    {
        double Resultado4 = Numero1 / Numero2;
        return Resultado4;
    }






}
