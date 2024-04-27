//ANGEL GABRIEL FLORES CASTILLO, 2024-1357U
import java.util.Scanner;
public class App {

    public static int num1;
    public static int num2;
    public static int num3;

    //Suma de los numeros menores con el uso de Math
    public static int sumpeque (int num1, int num2, int num3){
        int menor= Math.min(num1, num2);
        int menordos= Math.min(Math.max(num1, num2), num3);
        return menordos+menor;
    }
    //Resta de los numeros menores con Math
    public static int restarmayores (int num1, int num2, int num3){
       int mayor1= Math.max(num1, num2);
       int mayor2= Math.max(Math.min(num1, num2), num3);
       if (mayor2>mayor1) {
        return mayor2-mayor1;
        
       } else {
        return mayor1-mayor2;    
       }
    }
    //Encontrar numero mayor entre tres numeros
    public static int nummayordelostres (int num1, int num2, int num3){
        int mayor2= Math.max(Math.max(num1, num2),num3);
        return mayor2;
    }
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner (System.in);

        //Atrapar excepciones
        do {
            try{

                System.out.println("Ingrese tres numeros diferentes");
                num1=leer.nextInt();
                num2=leer.nextInt();
                num3=leer.nextInt();
            } catch(Exception e) {
                System.out.println(e);
                System.out.println("Ingrese valores correctos");
                leer.nextLine();
            }
            
        } while (num1 == num2 || num1 == num3 || num2 == num3);

        //Impresion de metodos
        System.out.println("La suma de los números más pequeños es "+sumpeque(num1, num2, num3));
        System.out.println("La resta de los números más grandes es  "+restarmayores(num1, num2, num3));
        System.out.println("El número mayor es "+nummayordelostres(num1, num2, num3)); 
        leer.close();
    }
}