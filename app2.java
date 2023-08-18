import java.util.Scanner; //viabilizar leitura via teclado no console

public class app2 {
    public static void main (String args[]){
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        b = sc.nextInt();
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
    }
}

