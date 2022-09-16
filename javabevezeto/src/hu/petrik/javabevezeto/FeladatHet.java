package hu.petrik.javabevezeto;
import java.util.Scanner;
public class FeladatHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem adja meg, hogy milyen hónapot írunk: ");
        int honap = sc.nextInt();

        if (2 < honap && honap < 6){
            System.out.println("Tavasz");
        }
        else if (5 < honap && honap < 9){
            System.out.println("Nyár");
        } else if (8 < honap && honap < 12){
            System.out.println("Ősz");
        }
        else {
            System.out.println("Tél");
        }
    }
}
