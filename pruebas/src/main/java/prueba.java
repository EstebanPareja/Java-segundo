import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class prueba {
    public String obtenerNombreEntrenadorMasLargo() {
        String entrenadorNombreMasLargo = "";
        int cantidadLetrasAnterior =0;
        for (int i =0; i<listaEntrenadores.size(); i++){
            String nombre = listaEntrenadores.get(i).getNombre();
            if (nombre.length() > cantidadLetrasAnterior){
                 entrenadorNombreMasLargo = nombre;
                 cantidadLetrasAnterior = nombre.length();
            }
        } return entrenadorNombreMasLargo;
    }
    /////////////////////////////////////////////////////////

    public LinkedList<Miembro> agregarMiembroConSumaTelefono() {
        listaMiembroConSumaTelefono() = new LinkedList<>();
        for (Miembro member : listaMiembros){
            int numeroTelefonoSumar = member.getNumeroTelefonico();
            int suma = 0;
            while (numeroTelefonoSumar > 0) {
                suma += numeroTelefonoSumar % 10;
                numeroTelefonoSumar /= 10;
            }
            if (suma == 30){
                listaMiembroConSumaTelefono.add(member);
            }
        } return listaMiembroConSumaTelefono;
    }
    ////////////////////////////////////////////////////////

    public int contarMiembrosMembresiaAnualMayoresEdad() {
        int miembrosMembresiaAnualMayoresEdad = 0;
        for (Miembro member : listaMiembros){
            Membresia membresia = member.getTipoMembresia();
            int edad = member.getEdad();
            if (membresia == TipoMembresia.ANUAL  && edad >= 18){
                miembrosMembresiaAnualMayoresEdad += 1;
            }
        } return miembrosMembresiaAnualMayoresEdad;
    }

    ////////////////////////////////////////////////////////

    public void invertirNombresMenoresEdad() {
        List <Miembros> listaMiembrosMenoresEdad = new ArrayList<>();
        for (Miembro member : listaMiembros){
            int edad = member.getEdad();
            if (edad < 18){
                listaMiembrosMenoresEdad.add(member);
            }
        } for (Miembro member1 : listaMiembrosMenoresEdad){
            String nombre = member1.getNombre();
            String nuevoNombre = "";
            for ( int i = nombre.length()-1; i >= 0 ;i--){
                nuevoNombre += nombre.charAt(i);
            }
            member1.setNombre(nuevoNombre);
        }
    }

//////////////////////////////////////////////////////////


    public LinkedList<Miembro> agregarMiembrosPalindromos() {
        LinkedList<Miembro> listaMiembrosPalindromos = new LinkedList<>();
        for (Miembro member : listaMiembros){
            String nombre = member.getNombre();
            boolean esPalindromo = true;
            for (int i =0, j = nombre.length() -1; j>i; i++, j--){
                if (nombre.charAt(i)!= nombre.charAt(j)){
                    esPalindromo = false;
                    break;
                }
            } if (esPalindromo){
                listaMiembrosPalindromos.add(member);
            }
        }return listaMiembrosPalindromos;
    }

    ///////////////////////////////////////////////////////

    public void numerosNaturales(){
        String listaNaturales = "";
        for (int i=0; i<= 10; i++){
            listaNaturales = listaNaturales + i + "\n";
        }
        JOptionPane.showMessageDialog(null, listaNaturales);
    }
    ////////////////////////////////////////////////////////

    public void sumarNaturales(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero hasta el que deseas sumar:"));
        int inicio = 0;
        int numero2 = 1;
        int suma = 0;
        while (numero2 <= numero){
            suma = inicio + numero2;
            inicio = suma;
            numero2++;
        }
        System.out.println(suma);
    }

    ////////////////////////////////////////////////////////

    public void contarDigitos(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número del que deseas contar los digitos:"));
        while (numero < 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("El número debe ser positivo y entero, ingrésalo de nuevo: " ));
        }
        int contador = 0;
        while (numero > 0){
            numero /= 10;
            contador++;
        }
        System.out.println(contador);
    }

    ////////////////////////////////////////////////////////

    public void imprimirImpares(){
        String impares = "";
        for (int i=1; i<= 50; i++){
            if ( i % 2 != 0){
                impares = impares + i + "\n";
            }
        }
        System.out.println(impares);
    }

    ////////////////////////////////////////////////////////

    public void sumarDigitos(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número del cual deseas sumar dígitos: "));
        int suma = 0;
        while (numero > 0){
            suma = suma + numero%10;
            numero /= 10;
        }  System.out.println(suma);
    }

}
