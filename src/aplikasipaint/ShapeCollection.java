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
public interface ShapeCollection {
    String shape(String shape);
    int hitungShape();
    abstract void infoShape();
    abstract void getColor();
    abstract void getStroke();
    abstract void getBorder();
    
}
