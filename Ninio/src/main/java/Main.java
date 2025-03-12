
import javax.swing.JOptionPane;


public static void main(String[] args) {
    Guarderia guarderia = new Guarderia("Pequeños gigantes");
    boolean flag = true;
    while(flag) {
        String OpcionMenu = JOptionPane.showInputDialog("Qué deseas hacer?\n1.Agregar nuevo estudiante\n2.Buscar estudiante\n3.Eliminar estudiante\n" +
                "4.Actualizar estudiante\n5.Mostrar estudiantes\n6.Buscar palíndromos\n7.Mostrar estudiante con mayor edad\n8.Salir: ");
        switch (OpcionMenu) {
            case "1":
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del niño: "));
                String genero = JOptionPane.showInputDialog("Ingrese el género. F para femenino o M para masculino: ");
                while (!genero.equalsIgnoreCase("F") && !genero.equalsIgnoreCase("M")) {
                    genero = JOptionPane.showInputDialog("Ingrese el género como se solicita: ");
                }
                String id = JOptionPane.showInputDialog("Ingrese el id del niño: ");
                String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño en caso de tenerlas: ");
                String nombreAcudiente = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
                String numeroContacto = JOptionPane.showInputDialog("Ingrese el numero de contacto: ");

                Estudiante estudiante = new Estudiante(nombre, edad, genero, id, alergias, nombreAcudiente, numeroContacto);
                guarderia.agregarEstudiante(estudiante);
                guarderia.MayoresDeCinco(estudiante);
            case "2":
                String buscar = JOptionPane.showInputDialog("Ingrese el Id del estudiante a buscar: ");
                guarderia.buscarEstudiante(buscar);
                JOptionPane.showMessageDialog(null, guarderia.buscarEstudiante(buscar));
                break;
            case "3":
                String eliminar = JOptionPane.showInputDialog("Ingrese el id del estudiante que desea eliminar: ");
                guarderia.eliminarEstudiante(eliminar);
                guarderia.eliminarEstudiantesMayores(eliminar);
                break;
            case "4":
                String actualizar = JOptionPane.showInputDialog("Ingrese el id del estudiante que desea actualizar: ");
                String nombreNuevo = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                int edadNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del niño: "));
                String generoNuevo = JOptionPane.showInputDialog("Ingrese el género. F para femenino o M para masculino: ");
                while (!generoNuevo.equals("F") && !generoNuevo.equals("M")) {
                    generoNuevo = JOptionPane.showInputDialog("Ingrese el género como se solicita: ");
                }
                    String idNuevo = JOptionPane.showInputDialog("Ingrese el id del niño: ");
                    String alergiasNuevo = JOptionPane.showInputDialog("Ingrese las alergias del niño en caso de tenerlas: ");
                    String nombreAcudienteNuevo = JOptionPane.showInputDialog("Ingrese el nombre del acudiente: ");
                    String numeroContactoNuevo = JOptionPane.showInputDialog("Ingrese el numero de contacto: ");
                    Estudiante estudiantenuevo = new Estudiante(nombreNuevo, edadNuevo, generoNuevo, idNuevo, alergiasNuevo, nombreAcudienteNuevo, numeroContactoNuevo);

                    guarderia.actualizarEstudiante(actualizar, estudiantenuevo );
                    break;
                    case "5":
                        JOptionPane.showMessageDialog(null, guarderia);
                        break;
            case "6":
                List<Estudiante> palindromos = guarderia.buscaPalindromos();
                JOptionPane.showMessageDialog(null, palindromos);
                break;
            case "7":
                Estudiante estudianteMayor = guarderia.estudianteMayor();
                JOptionPane.showMessageDialog(null, "El estudiante con mayor edad es: "+ estudianteMayor);
                break;
            case "8":
                flag = false;

        }
    }
}