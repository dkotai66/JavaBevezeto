package hu.petrik.javabevezeto;


import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem írjon be egy szót");
        String szoveg = sc.nextLine();
        String valasz;
        do {
            System.out.println("Kérem írjon be egy betűt.\n a-nagybetű,\n b-kisbetű,\n c-hossz,\n d-összehasonlítás,\n e-egy rész kiiratása,\n f-kilépés");
            valasz = sc.nextLine();
            if (valasz.equals("a")){
                String nagybetus = szoveg.toUpperCase();
                System.out.println(nagybetus);
            }
            else if(valasz.equals("b")){
                System.out.println(szoveg.toLowerCase());
            }
            else if(valasz.equals("c")){
                System.out.println(szoveg.length());
            }
            else if(valasz.equals("d")){
                System.out.println("Kérem adjon meg egy szót");
                String szoveg2 = sc.nextLine();
                if (szoveg.equals(szoveg2)){
                    System.out.println("A két szöveg megegyezik");
                }
                else{
                    System.out.println("A két szöveg nem egyezik");
                }
            }
            else if(valasz.equals("e")){
                System.out.println("írja be az első intervallumot: ");
                int a = sc.nextInt();
                System.out.println("írja be a második intervallumot: ");
                int b = sc.nextInt();

            }
            else {
                System.out.println("Hibás betű.");
            }

        }while (!valasz.equals("f"));
        System.out.println("A program kilép");
    }

}
