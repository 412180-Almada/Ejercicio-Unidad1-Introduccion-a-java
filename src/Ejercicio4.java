import java.util.Scanner;

//Ingresar nombre y altura de dos personas, informar el nombre de la más alta.

public class Ejercicio4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String nombre1 = sc.nextLine();

        double Altura1 = sc.nextDouble();
        sc.nextLine();
        String nombre2 = sc.nextLine();

        double Altura2 = sc.nextDouble();



        if (Altura1 > Altura2)
        {
            System.out.println("El nombre del mas alto es : " + nombre1);
        }
        else
        {
            System.out.println("El nombre del mas alto es : " + nombre2);
        }

    }
}
