import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String documento;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;


    // Constructor

    public Estudiante(String id, String nombre, int edad, String genero,
                      String documento, String alergias, String nombreAcudiente, String numeroContacto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;
    }

    //  Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGeneri(String genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }



    public String toString() {
        return "Id: "+id+"\n"+"Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Genero: "
                +genero+"\n"+"Documento: "+documento+"\n"+"Alergias: "
                +alergias+"\n"+"Nombre del acudiente: "+nombreAcudiente+"\n"+"Numero del contacto: "+
                numeroContacto;
    }
}
