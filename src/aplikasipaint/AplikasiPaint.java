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

public class AplikasiPaint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan nama : ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        InterfaceUIPaint param = new InterfaceUIPaint(nama);
    }

}
