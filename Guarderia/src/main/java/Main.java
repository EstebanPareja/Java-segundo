import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Pequeños Gigantes");
        boolean flag = true;
        while(flag) {
            String opcionMenu = JOptionPane.showInputDialog("Ingresa la acción que desees realizar:\n" +
                    "1.Agregar estudiante nuevo\n2.Buscar estudiante\n3.Mostrar la lista de estudiantes\n" +
                    "4.Actualizar los datos de un estudiante\n5.Eliminar estudiante\n" +
                    "6.Mostrar a los estudiantes mayores de cinco años\n7.Mostrar al estudiante con mayor edad\n" +
                    "8.Mostrar a los estudiantes con nombres palíndromos\n9.Salir");
            switch (opcionMenu){
                case "1":
                    String Id = JOptionPane.showInputDialog("Ingresa el id del estudiante");
                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el edad del estudiante"));
                    String genero = JOptionPane.showInputDialog("Ingresa el género del estudiante, F para femenino y M para masculino: ");
                        while (!genero.equalsIgnoreCase("F")&&!genero.equalsIgnoreCase("M")){
                             genero = JOptionPane.showInputDialog("Ingresa el género de la manera que se solicita: ");
                        }
                    String documento = JOptionPane.showInputDialog("Ingresa el documento del estudiante: ");
                    String alergias =  JOptionPane.showInputDialog("Ingresa las alergias del estudiante: ");
                    String nombreAcudiente = JOptionPane.showInputDialog("Ingresa el nombre del acudiente: ");
                    String numeroContacto = JOptionPane.showInputDialog("Ingresa el número de contacto: ");
                    Estudiante estudiante = new Estudiante(Id, nombre, edad, genero, documento, alergias, nombreAcudiente, numeroContacto);
                    guarderia.almacenarEstudiante(estudiante);
                    break;
                case "2":
                    String buscar = JOptionPane.showInputDialog("Ingresa el id del estudiante a buscar: ");
                    guarderia.buscarEstudiante(buscar);
                    JOptionPane.showMessageDialog(null, guarderia.buscarEstudiante(buscar));
                    break;
                case "3":

                    JOptionPane.showMessageDialog(null, guarderia);
                    break;
                case "4":
                    String actualizar = JOptionPane.showInputDialog("Ingresa el Id del estudiante que deseas editar: ");

                    String IdNew = JOptionPane.showInputDialog("Ingresa el id del estudiante");
                    String nombreNew = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
                    int edadNew = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el edad del estudiante"));
                    String generoNew = JOptionPane.showInputDialog("Ingresa el género del estudiante, F para femenino y M para masculino: ");
                    while (!generoNew.equalsIgnoreCase("F")&&!generoNew.equalsIgnoreCase("M")){
                        generoNew = JOptionPane.showInputDialog("Ingresa el género de la manera que se solicita: ");
                    }
                    String documentoNew = JOptionPane.showInputDialog("Ingresa el documento del estudiante: ");
                    String alergiasNew =  JOptionPane.showInputDialog("Ingresa las alergias del estudiante: ");
                    String nombreAcudienteNew = JOptionPane.showInputDialog("Ingresa el nombre del acudiente: ");
                    String numeroContactoNew = JOptionPane.showInputDialog("Ingresa el número de contacto: ");
                    Estudiante nuevoEstudiante = new Estudiante(IdNew, nombreNew, edadNew, generoNew, documentoNew, alergiasNew, nombreAcudienteNew, numeroContactoNew);

                    guarderia.actualizarEstudiante(actualizar, nuevoEstudiante);
                    break;
                case "5":
                    String eliminar = JOptionPane.showInputDialog("Ingresa el id del estudiante a eliminar: ");
                    guarderia.eliminarEstudiante(eliminar);
                    break;
                case "6":
                    List<Estudiante> listaMayoresCinco = guarderia.getListaMayoresCinco();
                    JOptionPane.showMessageDialog(null, listaMayoresCinco);
                    break;
                case "7":
                    Estudiante estudianteMayor = guarderia.estudianteMayorEdad();
                    JOptionPane.showMessageDialog(null, estudianteMayor);
                    break;
                case "8":
                    List<String> palindromos = guarderia.getPalindromos();
                    JOptionPane.showMessageDialog(null, palindromos);
                    break;
                case "9":
                    flag = false;
                }
            }
        }
    }

