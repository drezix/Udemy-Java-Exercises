package application;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Digite o tamanho do vetor:");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("O tamanho do vetor deve ser até 10.");
            }
        } while (n > 10);

        int count = 0;
        long[] vect = new long[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o " + (i+1) + "° número:");
            vect[i] = sc.nextLong();
            if (vect[i] < 0) {
                count++;
            }
        }
        long[] negatives = new long[count];
        int index = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                negatives[index++] = vect[i];
            }
        }
        System.out.println("Negativos:");
        for (int i = 0; i < negatives.length; i++) {
            System.out.println(negatives[i] + "");
        }

        sc.close();
    }
}
