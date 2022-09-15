package hu.petrik.javabevezeto;

import java.util.Scanner;

public class FeladatOt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("Kérek egy karaktert k-kerület, t-terület: ");
        String muvelet = sc.nextLine();
        if (muvelet.equals("k")){
            double kerulet = 2*(a+b);
            System.out.printf("A téglalap kerülete %f centiméter\n", kerulet);
        }
        else if(muvelet.equals("t")){
            double terulet = a*b ;
            System.out.printf("A téglalap területe %.2f négyzetcentiméter\n", terulet);
        }
        else {
            System.out.println("Hibás betűt adott meg.");
        }
        if(a==b){
            System.out.println("Ez egy négyzet.");
        }
    }
}
