package promedio_vector;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Promedio_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0, t, prom;
        Scanner l = new Scanner(System.in);
        System.out.println("Digite el tamaño del vector:");
        t = l.nextInt();
        int v[] = new int[t];
        for (int p = 0; p < v.length; p++) {
            System.out.println("Digite un número:");
            v[p] = l.nextInt();            
        }
        for (int p = 0; p < v.length; p++) {
            sum += v[p];
        }
        prom = sum/v.length;
        System.out.println("El promedio es: " +prom);
    }
    
}
