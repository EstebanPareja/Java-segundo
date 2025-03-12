import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Guarderia {

    private String nombreGuarderia;
    private List<Estudiante> listaEstudiantes;
    private List<Estudiante> listaMayoresCinco;
    private List<String> listaPalindromos;


    // Constructor

    public Guarderia(String nombreGuarderia) {
        this.nombreGuarderia = nombreGuarderia;
        listaEstudiantes = new ArrayList<>();
        listaMayoresCinco = new ArrayList<>();
        listaPalindromos = new ArrayList<>();
    }

    // Getters y Setter

    public String getNombreGuarderia() {
        return nombreGuarderia;
    }
    public void setNombreGuarderia(String nombreGuarderia) {
        this.nombreGuarderia = nombreGuarderia;
    }
    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    public List<Estudiante> getListaMayoresCinco() {
        return listaMayoresCinco;
    }
    public List<String> getPalindromos() {
        return listaPalindromos;
    }

    //  CRUD

    public boolean estudianteExiste(Estudiante estudiante){
        boolean existe = false;
        for(Estudiante est : listaEstudiantes) {
            if (est.getId().equals(estudiante.getId())) {
                existe = true;
                break;
            }
        }return existe;
    }
    public void almacenarEstudiante(Estudiante estudiante){
        if(estudianteExiste(estudiante)){
            JOptionPane.showMessageDialog(null, "Estudiante ya existe");
        }
        else{
            listaEstudiantes.add(estudiante);
            JOptionPane.showMessageDialog(null, "Estudiante agregado");
        }
    }
    public Estudiante buscarEstudiante(String id){
        for(Estudiante est : listaEstudiantes) {
            if(est.getId().equals(id)){
                return est;
            }
        }return null;

    }
    public void actualizarEstudiante(String id, Estudiante estudiante) {
        boolean actualizar = false;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId().equals(id)) {
                listaEstudiantes.set(i, estudiante);
                actualizar = true;
            }
        }
        if (actualizar) {
            JOptionPane.showMessageDialog(null, "Estudiante actualizado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Estudiante no existe");
        }
    }
    public void eliminarEstudiante(String id){
        boolean eliminar = false;
        for(int i = 0; i < listaEstudiantes.size(); i ++){
            if(listaEstudiantes.get(i).getId().equals(id)){
                listaEstudiantes.remove(i);
                eliminar = true;
                break;
            }
        }if (eliminar) {
            JOptionPane.showMessageDialog(null, "Estudiante eliminado");
        }else {
            JOptionPane.showMessageDialog(null, "Estudiante no existe, ingresa correctamente el id.");
        }
    }

    // Funciones adicionales

    public boolean verificarEdad(int edad){
        int mayorCinco = 5;
        boolean verificar = false;
            if(edad> mayorCinco){
                verificar = true;
        }return verificar;
    }

    public void agregarMayoresCinco(Estudiante estudiante) {
        int edad = estudiante.getEdad();
        if (verificarEdad(edad)) {
            listaMayoresCinco.add(estudiante);
        }
    }
    public void eliminarMayoresCinco(String id) {
        boolean eliminar = false;
        for (int i = 0; i < listaMayoresCinco.size(); i++) {
            if(listaMayoresCinco.get(i).getId().equals(id)){
                listaMayoresCinco.remove(i);
                eliminar = true;
                break;
            }
        }if (eliminar) {
            JOptionPane.showMessageDialog(null, "Estudiante eliminado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Estudiante no existe");
        }
    }

    public String toString() {
        return "Los estudiantes mayores de cinco años son: "+"\n"+listaMayoresCinco.toString();
    }

    public boolean esPalindromo(String nombre){
        boolean esPalindromo = true;
        nombre = nombre.toLowerCase();
            for(int i = 0, j = nombre.length()-1; i<j; i++, j--) {
                if(nombre.charAt(i) != nombre.charAt(j)){
                    esPalindromo = false;
                    break;
                }

        }return esPalindromo;
    }

    public void agregarPalindromo(Estudiante estudiante){
        String nombre = estudiante.getNombre();
        if(esPalindromo(nombre)){
            listaPalindromos.add(nombre);
        }
    }

    public Estudiante estudianteMayorEdad(){
        int edad = 0;
        Estudiante estudianteMayorEdad = null;
        for(Estudiante est : listaEstudiantes) {
            if(est.getEdad() > edad){
                edad = est.getEdad();
                estudianteMayorEdad = est;
            }
        }return estudianteMayorEdad;
    }


}


