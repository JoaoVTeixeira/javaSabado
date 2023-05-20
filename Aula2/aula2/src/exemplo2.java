import javax.swing.JOptionPane;

public class exemplo2 {
    public static void main(String[] args) {
        //ler o valor de um produto
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O VALOR DO PRODUTO:"));
        JOptionPane.showMessageDialog(null, "O VALOR DO PRODUTO É : " + valor);

        if(valor < 0){
            JOptionPane.showMessageDialog(null,"Valor inválido");
        }else if(valor>500){
            JOptionPane.showMessageDialog(null, "MUITO CARO");
        }else {
            JOptionPane.showMessageDialog(null, "ATÉ QUE DÁ");
        }

        int num = 0;
        int acumulador=0;
        int cont = 0;
        double media;

        while(num != -1){
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor" ));
            cont++;    
            acumulador += num;
            



        }



    }
}
