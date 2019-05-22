/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColorLibraryCollections;
import aplikasipaint.ColorCollection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerwin Jo
 */
public class Solid implements ColorCollection {

    String[] staticColor = {"Black", "Red", "Magenta", "Pink", "Purple", ""
            + "Green", "Cyan", "Yellow", "Orange", "Blue", "Brown", "Cream", "Gray"};
    
    @Override
    public String color() {
        return "Ini adalah 1 jenis warna";
    }
    
    @Override
    public String pilihColor(int index) {
        if (index >= 0 && index <= staticColor.length) {
            return staticColor[index];
        }
        else {
            return "Warna tidak tersedia";
        }
    }
    
    public void infoColor() {
        for (int i = 0; i < staticColor.length; i++) {
            System.out.print(i + ". "+staticColor[i] + "|");
        }
    }
    
    public void favoriteColor(String color) {
        List<String> favColor = new ArrayList<>();
        favColor.add(color);
    }
    
}
