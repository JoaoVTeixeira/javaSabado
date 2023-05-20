import java.util.Scanner;

public class Tarefa {
    public static void main(String[] args) {
        //Ler numero e mostrar

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero");
        int n1 = sc.nextInt();
        if (n1==3) {
            System.out.printf("Voce acertou o numero secreto! Era %d ", n1);   
        }else{
            
            System.out.printf("Seu numero é %d mas você errou ", n1);
        }
        sc.close();
    }
}
