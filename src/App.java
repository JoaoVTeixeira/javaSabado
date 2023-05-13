import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        String texto = "Java";
        int Numero = 36;
        double valor = 399.99;

        System.out.printf(" O curso de %s , tem carga horaria de %d horas", texto,Numero);


        System.out.printf("\n O valor do curso é %.2f", valor);

        //leitura de dados no terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInforme seu nome");
        String nome = sc.nextLine();   
        System.out.println("Informe sua idade");
        int idade = sc.nextInt();
        System.out.println("Seu nome é "+nome + " sua idade é " + idade);     
        
        sc.close();
    }
}
