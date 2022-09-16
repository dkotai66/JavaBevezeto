package hu.petrik.javabevezeto;

import java.util.Scanner;

public class FeladatTiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paros = 0;
        int paratlan = 0;
        int osszeg = 0;
        while (osszeg<=100){
            int szam = sc.nextInt();
            osszeg +=szam;
            if (szam%2==0){
                paros++;
            }
            else{
                paratlan++;
            }
        }
        System.out.printf("A megadott számot közül %d volt páros és %d volt páratlan.", paros, paratlan);

    }
}
