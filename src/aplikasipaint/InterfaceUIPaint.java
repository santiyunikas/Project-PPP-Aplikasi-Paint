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
import shapedecorator.*;

public class InterfaceUIPaint {

    static String nama;
    ShapeMaker shaped = new ShapeMaker();
    LineMaker line = new LineMaker();
    int pilihan =0;

    public InterfaceUIPaint(String nama) {
        InterfaceUIPaint.nama = nama;
        System.out.println("Selamat datang, " + InterfaceUIPaint.nama + " di aplikasi PAINT JAVA");
        start();
    }

    final void start() {
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
                    pilihLine();
                    break;
                default:
                    System.out.println("Pilihan tidak ditemukan");
                    break;
            }

            if (pilihan == 3) {
                System.out.println("Terima kasih " + nama);
            }

        } while (pilihan >= 1 || pilihan < 3);

    }

    void pilihBangunDatar() {
        String output = "Lingkaran | Jajar Genjang | Persegi Panjang | Kotak | Segitiga";
        String pilihan=null;
        String didekor = null;
        do {
            System.out.println(output);
            System.out.println("0. Cancel");
            System.out.print("Masukkan pilihan : ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextLine();
            if (!pilihan.equalsIgnoreCase("0")) {
                System.out.println(shaped.getShape(pilihan).shape(pilihan));
                System.out.print("Apakah akan didekor? (Ya / Tidak) : ");
                didekor = input.nextLine();
                if (didekor.equalsIgnoreCase("Ya") || didekor.equalsIgnoreCase("Y")) {
                    pilihDecorator(pilihan);
                } else {
                    shaped.getShape(pilihan).infoShape();
                }
            }

        } while (!pilihan.equalsIgnoreCase("0"));
    }

    void pilihLine() {
        String output = "Line2D | Garis Gelombang | Transform";
        String pilihan = null;
        String didekor = null;
        do {
            System.out.println(output);
            System.out.println("0. Cancel");
            System.out.print("Masukkan pilihan : ");
            Scanner input = new Scanner(System.in);
            pilihan = input.nextLine();
            if (!pilihan.equalsIgnoreCase("0")) {
                System.out.println(line.getLine(pilihan).line());
                System.out.print("Apakah akan didekor? (Ya / Tidak) : ");
                didekor = input.nextLine();
                if (didekor.equalsIgnoreCase("Ya") || didekor.equalsIgnoreCase("Y")) {
                    pilihDecorator(pilihan);
                } else {
                    line.getLine(pilihan).infoLine();
                }
            }

        } while (!pilihan.equalsIgnoreCase("0"));

    }

    void pilihDecorator(String things) {
        String output = null;
        String pilihan = null;

        if (this.pilihan == 1) {
            output = "Stroke | Fill | Border";
            ShapeCollection shapeStroke = new StrokeDecorator(shaped.getShape(things));
            ShapeCollection shapeColor = new ColorDecorator(shaped.getShape(things));
            ShapeCollection shapeBorder = new BorderDecorator(shaped.getShape(things));
            do {
                System.out.println(output);
                System.out.println("0. Show the result");
                System.out.print("Masukkan pilihan : ");
                Scanner input = new Scanner(System.in);
                pilihan = input.nextLine();

                if (pilihan.equalsIgnoreCase("stroke")) {
                    shapeStroke.infoShape();
                } else if (pilihan.equalsIgnoreCase("fill")) {
                    shapeColor.infoShape();
                } else if (pilihan.equalsIgnoreCase("border")) {
                    shapeBorder.infoShape();
                }

            } while (!pilihan.equalsIgnoreCase("0"));
            shaped.getShape(things).infoShape();
            shapeStroke.getStroke();
            shapeColor.getColor();
            shapeBorder.getBorder();
        } else if (this.pilihan == 2) {
            output = "Stroke | Fill";
            LineCollection lineStroke = new StrokeDecorator(line.getLine(things));
            LineCollection lineColor = new ColorDecorator(line.getLine(things));
            
            do {
                System.out.println(output);
                System.out.println("0. Show the result");
                System.out.print("Masukkan pilihan : ");
                Scanner input = new Scanner(System.in);
                pilihan = input.nextLine();

                if (pilihan.equalsIgnoreCase("stroke")) {
                    lineStroke.infoLine();
                } else if (pilihan.equalsIgnoreCase("fill")) {
                    lineColor.infoLine();
                } 

            } while (!pilihan.equalsIgnoreCase("0"));
            line.getLine(things).infoLine();
            lineStroke.getStroke();
            lineColor.getColor();
            
        }

    }

}
