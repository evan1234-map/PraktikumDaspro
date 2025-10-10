//package jobsheet5;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = sc.nextInt();
        System.out.print("Masukan angka:");
        
        if (angka % 2 == 0){
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
            sc.close();
        }
    }
}