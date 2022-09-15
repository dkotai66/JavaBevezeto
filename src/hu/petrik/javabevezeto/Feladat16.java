package hu.petrik.javabevezeto;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class Feladat16 {
    public static void main(String[] args) {
        int[] szamok = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<szamok.length; i++){
            System.out.println("Adjon meg egy számot: ");
            int szam = sc.nextInt();
            szamok[i]=szam;
        }
        System.out.println("Első feladat: ");
            System.out.println(Arrays.toString(szamok));

        System.out.println("\nMásodik feladat: ");
        for (int i=szamok.length-1; i>-1; i--){
            System.out.println(szamok[i]);
        }

        System.out.println("\nHarmadik feladat: ");
        for (int i=0; i<szamok.length; i=i+2){
            System.out.println(szamok[i]);
        }

        System.out.println("\nÍrja be hanyadik számra kíváncsi");
        int hanyadik = sc.nextInt();
            System.out.println(szamok[hanyadik-1]);


    }
}
