
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Guarderia {
    private String nombre;
    private List<Estudiante> ListaEstudiantes;
    private List<Estudiante> ListaMayores;


    //constructor
    public Guarderia(String nombre) {

        this.nombre = nombre;
        this.ListaEstudiantes = new ArrayList<>();
        this.ListaMayores = new ArrayList<>();
    }

//getters y setters

    public List<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public List<Estudiante> getListaMayores() {
        return ListaMayores;
    }

    public Estudiante buscarEstudiante(String id) {
        for (Estudiante estudiante : ListaEstudiantes) {
            if (estudiante.getId().equals(id)) {
                return estudiante;
            }
        }
        return null;
    }


        public void agregarEstudiante (Estudiante estudiante){
            /// est corresponde a los estudiates de la clase ///
            if (buscarEstudiante(estudiante.getId()) != null) {
                JOptionPane.showMessageDialog(null, "Estudiante ya existe");
            }
            else{
                ListaEstudiantes.add(estudiante);
                JOptionPane.showMessageDialog(null, "Estudiante agregado");
            }
        }

        public void eliminarEstudiante (String Id){
            boolean eliminado = false;
            for (int i = 0; i < ListaEstudiantes.size(); i++) {
                if (ListaEstudiantes.get(i).getId().equals(Id)) {
                    ListaEstudiantes.remove(i);
                    eliminado = true;
                    break;
                }
            }
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no eliminado");
            }
        }
        public void eliminarEstudiantesMayores (String Id){
            boolean eliminado = false;
            for (int i = 0; i < ListaMayores.size(); i++) {
                if (ListaMayores.get(i).getId().equals(Id)) {
                    ListaMayores.remove(i);
                    eliminado = true;
                    break;
                }
            }
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Estudiante eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no eliminado");
            }
        }
        public void actualizarEstudiante (String id, Estudiante estudiante){
            boolean estudianteEditado = false;
            for (int i = 0; i < ListaEstudiantes.size(); i++) {
                if (ListaEstudiantes.get(i).getId().equals(id)) {
                    ListaEstudiantes.set(i, estudiante);
                    estudianteEditado = true;
                }
            }
            if (estudianteEditado) {
                JOptionPane.showMessageDialog(null, "Estudiante actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante no actualizado");
            }

        }
        public void MayoresDeCinco (Estudiante estudiante){
            ListaMayores.clear();
            for (Estudiante est : ListaEstudiantes) {
                if (est.getEdad() > 5) {
                    ListaMayores.add(est);
                }
            }
        }

    public List<Estudiante> buscaPalindromos() {
        List<Estudiante> palindromos = new ArrayList<>();
        for (Estudiante est : ListaEstudiantes) {
            String nombre = est.getNombre().toLowerCase();
            boolean esPalindromo = true;
            for (int i = 0, j = nombre.length() - 1; i < j; i++, j--) {
                if (nombre.charAt(i) != nombre.charAt(j)) {
                    esPalindromo = false;
                    break;
                }
            }
            if (esPalindromo) {
                palindromos.add(est);
            }
        }
        return palindromos;
    }
public Estudiante estudianteMayor (){
        int edadMayor = 0;
        Estudiante estudianteMayor = null;
        for (Estudiante student: ListaEstudiantes){
            if(student.getEdad()> edadMayor){
                edadMayor = student.getEdad();
                estudianteMayor = student;
                break;
            }
        }
        return estudianteMayor;
}
    public String toString () {
            return "Los estudiantes son: " + "\t" + ListaEstudiantes.toString() + "\n"
                    + "Los estudiantes mayores de 5 años son: " + "\t" + ListaMayores.toString();
        }
    }