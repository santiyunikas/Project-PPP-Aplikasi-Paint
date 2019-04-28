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
public class ColorMaker {
    
    public ColorCollection getColorStroke(String color) {
        if (color.equals("null")) {
            return null;
        }
        else if (color.equalsIgnoreCase("solid")) {
            return new ColorLibraryCollections.Solid();
        }
        else if (color.equalsIgnoreCase("gradient")) {
            return new ColorLibraryCollections.Gradient();
        }
        return null;
    }
    
    public ColorCollection getColorFill(String color) {
        if (color.equals("null")) {
            return null;
        }
        else if (color.equalsIgnoreCase("solid")) {
            return new ColorLibraryCollections.Solid();
        }
        else if (color.equalsIgnoreCase("gradient")) {
            return new ColorLibraryCollections.Gradient();
        }
        return null;
    }
    
    
}
