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
public class Gradient implements ColorCollection {

    String[] staticColor = {"Black", "Red", "Magenta", "Pink", "Purple", ""
        + "Green", "Cyan", "Yellow", "Orange", "Blue", "Brown", "Cream", "Gray"};

    @Override
    public String color() {
        return "Ini adalah warna gradien.";
    }

    @Override
    public String pilihColor(int index) {
        List<String> gradientColor = new ArrayList<>();
        gradientColor.add(index, staticColor[index]);
        if (gradientColor.size() >= 2) {
            return gradientColor.toString();
        }
        return null;
    }
    
    public String pilihPola(int index) {
        String pola = null;
        switch(index) {
            case 1: 
                pola = "Linear";
                break;
            case 2: 
                pola = "Radial";
                break;
            default:
                pola = "Tidak ada pola dipilih";
        }
        return pola;
    }

}
