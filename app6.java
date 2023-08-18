import java.util.Scanner;// scanner permite a entrada de dados digitados via teclado

public class app6 {
    public static void main(String args[]){
        int idades[]= new int[5]; //criando um vetor com nome "idades", alocando 5 posições
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<=4; i++ ) {//estrutura de repetição for
            System.out.print("Digite o" + (i+1) + "o. valor: ");
            idades[i]= sc.nextInt();
        }
        for (int i=0; i<=4; i++ ){
            System.out.print(idades[i] +"\t"); // " +"\t" " é um comando TAB
        }
   }
}
