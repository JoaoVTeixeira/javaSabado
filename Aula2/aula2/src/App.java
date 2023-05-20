import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //janela swing
        JOptionPane.showMessageDialog(null, "OLA MUNDO");
        //janela de input
        String nome = JOptionPane.showInputDialog("BOTA O NOME");
        
        JOptionPane.showMessageDialog(null, "BOM DIA " + nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")); 
    
        JOptionPane.showMessageDialog(null, "TU TEM ISSO DE IDADE: " + idade);

        if(idade<18){
            JOptionPane.showMessageDialog(null, "CHOP SAI MAIS CARO");
        }else{
            JOptionPane.showMessageDialog(null, "CHOP SAI NO PRECINHO");
        }


    }
}
