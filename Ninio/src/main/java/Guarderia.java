
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Guarderia {
    private String nombre;
    private List<Estudiante> ListaEstudiantes;
    private List<Estudiante> ListaMayores;

public Guarderia(String nombre){

    this.nombre = nombre;
    this.ListaEstudiantes = new ArrayList<>();
    this.ListaMayores = new ArrayList<>();
}
public void AgregarEstudiante(Estudiante estudiante){
    /// est corresponde a los estudiates de la clase ///
    for (Estudiante est : ListaEstudiantes) {
        if (estudiante.getId().equals(est.getId())) {
            JOptionPane.showMessageDialog(null, "Código de estudiante ya existente");
            return;
        }
    }
        ListaEstudiantes.add(estudiante);
        JOptionPane.showMessageDialog(null, "Estudiante agregado");

}
public void MayoresDeCinco(Estudiante estudiante){
    ListaMayores.clear();
    for (Estudiante est : ListaEstudiantes){
        if (est.getEdad()>5){
            ListaMayores.add(est);
        }
    }
}
public List<Estudiante> getListaEstudiantes() {
    return ListaEstudiantes;
}
public List<Estudiante> getListaMayores() {
    return ListaMayores;
}
public String toString(){
    return "Los estudiantes son: "+ "\t" + ListaEstudiantes.toString() +"\n"
            +"Los estudiantes mayores de 5 años son: "+ "\t" + ListaMayores.toString();
}
}

