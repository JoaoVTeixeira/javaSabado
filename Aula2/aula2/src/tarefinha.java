import javax.swing.JOptionPane;


public class tarefinha {
    public static void main(String[] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade")); 
    

        if(salario<1320 && salario > 0){
            JOptionPane.showMessageDialog(null, "SALARIO ABAIXO DO MINIMO");
        }else if(salario>=1320){
            JOptionPane.showMessageDialog(null, "SALARIO ACIMA DO MINIMO");
        }else if(salario<0){
            JOptionPane.showMessageDialog(null, "TRABALHO ESCRAVO DISK 100");
        }
    }
}
