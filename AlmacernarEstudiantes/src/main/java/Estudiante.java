public class Estudiante {
    String nombre;
    String apellido;
    int edad;
    String identificacion;
    String correo;
    String telefono;

    public Estudiante(String name, String secondName, int age, String identification, String mail, String phone){
        nombre = name;
        apellido= secondName;
        edad= age;
        identificacion = identification;
        correo = mail;
        telefono = phone;
    }
    public String toString(){
        return "Nombre: "+ nombre + "\n"+
                "Apellido: " + apellido + "\n"+
                "Edad: "+ edad +"\n"+
                "Identificación: "+ identificacion+ "\n"+
                "Correo: "+ correo+"\n"+
                "Telefono: "+ telefono+"\n";
    }
}