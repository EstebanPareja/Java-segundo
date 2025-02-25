import javax.swing.*;

public static void main(String[] args) {
    String pregunta = JOptionPane.showInputDialog("Quieres ser mi tilina? Sí o No: ");
    while (!pregunta.equals("Sí")){
        pregunta = JOptionPane.showInputDialog("Di que sí porfa");
    }
    JOptionPane.showMessageDialog(null, "Gracias tilina te amo por decir que sí");
}

