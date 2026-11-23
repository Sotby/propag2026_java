import javax.swing.*;
public class ExemploEntrada {
    public static void main(){
        String num[];
        num = new String[2];
        num[0] = JOptionPane.showInputDialog("Digite o primeiro número: ");
        num[1] = JOptionPane.showInputDialog("Digite o segundo número: ");
        double media = Double.parseDouble(num[0]);
        media += Double.parseDouble(num[1]);
        JOptionPane.showMessageDialog(null,media/2);
    }
}
