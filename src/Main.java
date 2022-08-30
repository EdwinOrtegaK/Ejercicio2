import java.util.ArrayList;
import java.util.Scanner;
/*
@author Edwin Ortega Kou
 */

public class Main {
    static boolean supmenu;
    static Scanner jopo = new Scanner(System.in);
    public static ArrayList<Perro> catalogo = new ArrayList();
    public static Familia familys[] = new Familia[3];

    public static void main(String[] args){
        System.out.println("===Ingrese Primera familia===");
        familys[0] = newFamilia();
        System.out.println("===Ingrese la segunda familia===");
        familys[1] = newFamilia();
        System.out.println("===Ingrese la tercera familia===");
        familys[2] = newFamilia();
        String hulu = "s";
        do{
            catalogo.add(newPerro());
            System.out.println("Desea ingresar otro perro (s-n): ");
            hulu = jopo.next();
        } while (hulu.equals("s"));
        sgnPerro(familys[0]);
        sgnPerro(familys[1]);
        sgnPerro(familys[2]);
        System.out.println("Los siguientes perros que han sido enviados a la perrera son: ");
        for (int i=0; i<catalogo.size(); i++){
            System.out.println("Nombre: "+catalogo.get(i).getName());
        }
    }
    /*
    @return Objeto de tipo familia
     */
    public static Familia newFamilia(){
        Familia familia = new Familia();
        System.out.println("Ingrese el apellido de la familia: ");
        familia.setApellido(jopo.next());
        System.out.println("Cuantos integrantes son en la familia: ");
        familia.setMiembros(jopo.nextInt());
        System.out.println("¿Tiene niños?\nIngrese la opcion que le corresponda \n1. Niños menores de 10 años.\n2. Niños mayores de 10 años\n3. No se tienen niños");
        familia.setNinos(jopo.nextInt());
        System.out.println("Ingrese la cantidad de mascotas con las que cuenta: ");
        familia.setMascotas(jopo.nextInt());
        return familia;
    }
    /*
    @return Objeto de tipo perro
     */
    public static Perro newPerro(){
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro: ");
        perro.setName(jopo.next());
        System.out.println("Ingrese el color del perro: ");
        perro.setColor(jopo.next());
        System.out.println("Ingrese la raza del perro: ");
        String raza = jopo.next();
        perro.setRaza(raza);
        System.out.println("Ingrese el tamaño del perro (pequeño, mediano o grande): ");
        String est = jopo.next();
        perro.setTamano(est);
        System.out.println("Ingrese la edad aproximada del perro: ");
        perro.setEdad(jopo.nextInt());
        System.out.println("Ingrese la salud del perro (0-100): ");
        perro.setSalud(jopo.nextInt());
        if ((raza.equals("Pit bull terrier"))||(raza.equals("American Staffordshire terrier"))||(raza.equals("Tosa Inu"))||(raza.equals("Dogo argentino"))||(raza.equals("Dogo Guatemalteco"))||(raza.equals("Fila brasileño"))||(raza.equals("Presa canario"))||(raza.equals("Dóberman"))||(raza.equals("Gran perro japonés"))||(raza.equals("Mastín napolitano"))||(raza.equals("Presa Mallorqui"))||(raza.equals("Dogo de burdeos"))||(raza.equals("Bullmastiff"))||(raza.equals("Bull terrier inglés"))||(raza.equals("Bulldog americano"))||(raza.equals("Rhodesiano"))||(raza.equals("Rottweiler"))) {
            perro.setSegurPe(3);
        } else if (est.equals("mediano")) {
            perro.setSegurPe(2);
        } else if (est.equals("pequeño")||(raza.equals("labrador"))) {
            perro.setSegurPe(1);
        }
        return perro;
    }
    /*
    @param Objeto de tipo familia
     */
    public static void sgnPerro(Familia familia){
        if(familia.getNinos() == 1){
            for(int i=0; i<catalogo.size(); i++ ){
                if(catalogo.get(i).getSegurPe() == 1){
                    if(familia.getMascotas()<=4){
                        System.out.println("El perro "+catalogo.get(i).getName()+" a sido asignado a la familia"+familia.getApellido());
                        catalogo.remove(i);
                        familia.setMascotas(familia.getMascotas()+1);
                    }
                }
            }
        }
        if(familia.getNinos() == 2){
            for(int i=0; i<catalogo.size(); i++ ){
                if(catalogo.get(i).getSegurPe() == 2){
                    if(familia.getMascotas() <= 4){
                        System.out.println("El perro "+catalogo.get(i).getName()+" a sido asignado a la familia"+familia.getApellido());
                        catalogo.remove(i);
                        familia.setMascotas(familia.getMascotas()+1);
                    }
                }
            }
        }
        if(familia.getNinos() == 3){
            for(int i=0; i<catalogo.size(); i++ ){
                if(catalogo.get(i).getSegurPe() == 3){
                    if(familia.getMascotas() <= 4){
                        System.out.println("El perro "+catalogo.get(i).getName()+" a sido asignado a la familia"+familia.getApellido());
                        catalogo.remove(i);
                        familia.setMascotas(familia.getMascotas()+1);
                    }
                }
            }
        }
    }
}