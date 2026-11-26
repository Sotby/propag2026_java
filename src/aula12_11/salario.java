package aula12_11;
import javax.swing.*;
public class salario {
    public static void main(){
        String nome, email;
        nome = JOptionPane.showInputDialog("Insira o nome");
        email = JOptionPane.showInputDialog("Insira o email");
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salario"));
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nEmail: "+email+"\nSalario: "+(salario*1.1));
    }
}
