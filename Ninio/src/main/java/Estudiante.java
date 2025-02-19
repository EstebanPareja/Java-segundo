public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String id;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

    public Estudiante(String nombre, int edad, String genero, String id, String alergias, String nombreAcudiente, String numeroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;
    }
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"
                +"Género: "+genero+"\n"+"id: "+ id + "\n"
                +"Alérgias: "+ alergias +"\n"+"Nombre del acudiente: "+nombreAcudiente+"\n"
                + "Número de contacto: "+ numeroContacto;


    }

}
