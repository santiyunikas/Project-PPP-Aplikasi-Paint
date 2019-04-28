/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipaint;

/**
 *
 * @author Gerwin Jo
 */
import java.util.Scanner;

public class InterfaceUIPaint {

    static String nama;

    public InterfaceUIPaint(String nama) {
        InterfaceUIPaint.nama = nama;
        System.out.println("Selamat datang, " + InterfaceUIPaint.nama + " di aplikasi PAINT JAVA");
        start();
    }

    final void start() {
        int pilihan = 0;
        do {
            System.out.println("Masukkan kategori :");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Line");
            System.out.println("3. Keluar");

            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    pilihBangunDatar();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
                    break;
            }

            if (pilihan == 3) {
                System.out.println("Terima kasih " + nama);
            }

        } while (pilihan < 1 || pilihan > 3);

    }

    void pilihBangunDatar() {
        String output = "Lingkaran | Jajar Genjang | Persegi Panjang | Kotak | Segitiga";
        String pilihan = null;
        String didekor = null;
        do {
            System.out.println(output);
            System.out.print("Masukkan pilihan : ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextLine();
            ShapeMaker shaped = new ShapeMaker();
            System.out.println(shaped.getShape(pilihan).shape(pilihan));
            System.out.print("Apakah akan didekor? (Ya / Tidak) : ");
            didekor = input.nextLine();
            if (didekor.equalsIgnoreCase("Ya") || didekor.equalsIgnoreCase("Y")) {
                pilihDecorator();
            }
            else {
                shaped.getShape(pilihan).infoShape();
            }
            
        } while (!pilihan.contains(output));
    }

    void pilihLine() {
        String output = "Line2D | Garis Gelombang | Transform";
        String pilihan = null;
        String didekor = null;
        do {
            System.out.println(output);
            System.out.print("Masukkan pilihan : ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextLine();
            LineMaker lined = new LineMaker();
            lined.getLine(pilihan);
            System.out.println("Apakah akan didekor? (Ya / Tidak) : ");
            didekor = input.nextLine();
            if (didekor.equalsIgnoreCase("Ya") || didekor.equalsIgnoreCase("Y")) {
                pilihDecorator();
            }
            else {
                lined.getLine(pilihan).infoLine();
            }
        } while (!pilihan.contains(output));
    }
    
    void pilihDecorator() {
        String output = "Stroke | Fill | Border";
        String pilihan = null;
        do {
            System.out.println(output);
            System.out.print("Masukkan pilihan : ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextLine();
            
            
        } while (!pilihan.contains(output));
    }

}
