import java.util.Scanner;
public class prueba1 {
	
    public static void main(String[] args) {


        System.out.println("introduzca su a�o de nacimiento por favor");
        Scanner sc = new Scanner(System.in);
        short edad1 = sc.nextShort();
        System.out.println("introduzca el a�o actual");
        short edad2 = sc.nextShort();
        System.out.println(edad2-edad1);
        

    }
}

