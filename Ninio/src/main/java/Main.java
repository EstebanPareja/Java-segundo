
import javax.swing.JOptionPane;


public static void main(String[] args) {
    Guarderia guarderia = new Guarderia("Pequeños gigantes");
    boolean flag = true;
    while(flag) {
        String agregar = JOptionPane.showInputDialog("Desea agregar un nuevo estudiante?\n1.Si\n 2.No ");
        switch (agregar) {
            case "1":
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del niño: "));
            String genero = JOptionPane.showInputDialog("Ingrese el género. F para femenino o M para masculino: ");
            while (!genero.equals("F") && !genero.equals("M")) {
                genero = JOptionPane.showInputDialog("Ingrese el género como se solicita: ");
            }
            String id = JOptionPane.showInputDialog("Ingrese el id del niño: ");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño en caso de tenerlas: ");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
            String numeroContacto = JOptionPane.showInputDialog("Ingrese el numero de contacto: ");

            Estudiante estudiante = new Estudiante(nombre, edad, genero, id, alergias, nombreAcudiente, numeroContacto);
            guarderia.AgregarEstudiante(estudiante);
            guarderia.MayoresDeCinco(estudiante);
            break;
            case "2":
                flag = false;
                break;
        }
    }
    JOptionPane.showMessageDialog(null, guarderia);


}
