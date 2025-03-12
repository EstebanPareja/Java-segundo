import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private String codigo;
    private List<Docente> listaDocente;
    private List<Estudiante> listaEstudiante;
    private List<Materia> listaMateria;
    private List<Nota> listaNota;

    public Escuela(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaDocente = new ArrayList<>();
        this.listaEstudiante = new ArrayList<>();
        this.listaMateria = new ArrayList<>();
        this.listaNota = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
