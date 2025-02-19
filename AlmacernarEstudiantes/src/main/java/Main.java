import java.util.Scanner;


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el nombre del estudiante: ");
    String nombre = scanner.nextLine();
    System.out.println("Ingrese la apellido del estudiante: ");
    String apellido = scanner.nextLine();
    System.out.println("Ingrese la edad del estudiante: ");
    int edad = Integer.parseInt(scanner.nextLine());
    System.out.println("Ingresa la identificación del estudiante: ");
    String identificacion = scanner.nextLine();
    System.out.println("Ingresa el correo del estudiante: ");
    String correo = scanner.nextLine();
    System.out.println("ingresa el número de telefono del estudiante: ");
    String telefono = scanner.nextLine();

    Estudiante estudiante = new Estudiante(nombre, apellido, edad, identificacion, correo, telefono);
    System.out.println("Estudiante: "+"\n"+ estudiante);


}


