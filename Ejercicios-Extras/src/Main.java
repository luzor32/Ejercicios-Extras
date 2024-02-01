import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int numero = sc.nextInt();
        if (esPrimos(numero,2)){
            System.out.println(numero + " Es un numero primo");
        }else {
            System.out.println(numero + " No es un numero primo");
        }
    }
    public static boolean esPrimos(int nro,int divisor){

        if (nro == divisor){
            return true;
        } else if (nro % divisor ==0 || nro < 2) {
            return false;
        }
        return esPrimos(nro,divisor + 1);
    }
}