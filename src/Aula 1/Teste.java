public class Teste {
    public static void main(String[] args) {
        System.out.print("Top\n");
        System.out.print("Major é um trouxa\n");
        System.out.print("Mais um\n");
        System.out.print("\"Dois\" \\\\");
        
        int n1 = 1;

        System.out.println(n1);

        //comentario top

        System.out.println("O numero 1 é : " + n1);

        int n2 = 2;
        
        int n3, n4;

        n3 = n1 + n2;

        n4 = n2 - n1 + (n3 * n2) + (n3+1/n2);


        System.out.println(n1 + "+" + n2 + " = " + n3 + " + 7 = " + n4);
        System.out.println(n1 + n2);
        System.out.println(n3 - n2);
        System.out.println(n4 * n2);
        System.out.println(n4 / n2);

        System.out.println("O resultado da soma é : " + (n1 + n2));
        System.out.println("O resultado da soma é : " + (n1 - n2));
        System.out.println("O resultado da soma é : " + (n4 * n2));    
        System.out.println("O resultado da soma é : " + (n4 / n2));
    
    }
}
