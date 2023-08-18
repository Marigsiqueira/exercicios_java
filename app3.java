import java.util.Scanner;

public class app3 {
    public static void main (String args[]){
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        a = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        b = sc.nextDouble();
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
    }
}
