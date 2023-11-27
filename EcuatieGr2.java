import java.util.Scanner;

public class EcuatieGr2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valoare coeficient a: ");
        double a = input.nextDouble();

        System.out.println("Valoare coeficient b: ");
        double b = input.nextDouble();

        System.out.println("Valoare coeficient c: ");
        double c = input.nextDouble();

        if (a == 0) {
            System.out.println("Ecuatia nu este de gradul 2");
            return;
        }

        double delta = Math.pow(b, 2) - 4.0 * a * c;
        System.out.println("delta: " + delta);

        if (delta < 0) {
            System.out.println("Ecuatia nu are solutie numere reale");
        } else if (delta == 0) {
            double r = (-b + Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("Solutiile sunt " + r + " si " + r);
        } else {
            double r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
            System.out.println("Solutiile sunt " + r1 + " si " + r2);
        }
    }
}
