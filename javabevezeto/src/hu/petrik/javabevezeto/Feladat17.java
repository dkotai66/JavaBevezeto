package hu.petrik.javabevezeto;

import java.util.Arrays;

public class Feladat17 {public static void main(String[] args) {
    int[] tombegy={5,19,37,4,0,85};
    int[] tombketto={19,37,5,0,85,};
    int[] tombharom=new int[6];
    for (int i = 0; i < tombharom.length; i++) {
        tombharom[i]=tombegy[i]+tombketto[i];
    }

    System.out.println(Arrays.toString(tombegy));
    System.out.println(Arrays.toString(tombketto));
    System.out.println(Arrays.toString(tombharom));
}
}
