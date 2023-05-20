import javax.swing.JOptionPane;

public class exemplo3 {
    public static void main(String[] args) {
        String opt = JOptionPane.showInputDialog("Informe um curso: \n1-JAVA POO \n2-JAVASCRIPT PARA WEB");


        opt = opt.toUpperCase();
        if(opt.equals("1") || opt.equals("JAVA")){
            JOptionPane.showMessageDialog(null, "BACKEND");
        }else if(opt.equals("2") || opt.equals("JAVASCRIPT")){
            JOptionPane.showMessageDialog(null, "FRONTEND");
        }else{
            JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
        }
    }
}
