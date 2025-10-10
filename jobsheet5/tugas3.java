//package jobsheeet5;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi
        String jenisPengguna;
        int SKS;

        System.out.println("Masukan jenis pengguna (dosen/mahasiswa/lainnya)");
        jenisPengguna = sc.nextLine();

        if (jenisPengguna.equals("dosen")){
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenisPengguna.equals("mahasiswa")){
            System.out.print("Masukan jumlah SKS yang diambil:");
            SKS = sc.nextInt();

        if (SKS >=12) {
            System.out.println("Akses WIFi diberikan (mahasiswa aktif).");
        } else {
            System.out.println("Akses WiFi ditolak,SKS kurang dari 12. ");
        }
        }else {
            System.out.println("Akses ditolak. ");
        }
    }
}