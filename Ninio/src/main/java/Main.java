
import javax.swing.JOptionPane;


public static void main(String[] args) {

    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño: ");
    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del niño: "));
    String genero = JOptionPane.showInputDialog("Ingrese el género. F para femenino o M para masculino: ");
            while (!genero.equals("F") && !genero.equals("M")){
                genero = JOptionPane.showInputDialog("Ingrese el genero como se solicita: ");
    }
    String id = JOptionPane.showInputDialog("Ingrese el id del niño: ");
    String alergias = JOptionPane.showInputDialog("Ingrese las alérgias del niño en caso de tenerlas: ");
    String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
    String numeroContacto = JOptionPane.showInputDialog("Ingrese el numero de contacto: ");

    Estudiante estudiante = new Estudiante( nombre, edad, genero, id, alergias, nombreAcudiente, numeroContacto);
    JOptionPane.showMessageDialog(null, estudiante);


}
