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
public class ShapeMaker {

    public ShapeCollection getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("Circle") || shape.equalsIgnoreCase("Lingkaran")) {
            return new ShapeCollections.Circle();
        } else if (shape.equalsIgnoreCase("Parallelogram") || shape.equalsIgnoreCase("Jajar Genjang")) {
            return new ShapeCollections.Parallelogram();
        } else if (shape.equalsIgnoreCase("Rectangle") || shape.equalsIgnoreCase("Persegi Panjang")) {
            return new ShapeCollections.Rectangle();
        } else if (shape.equalsIgnoreCase("Square") || shape.equalsIgnoreCase("Kotak")) {
            return new ShapeCollections.Square();
        } else if (shape.equalsIgnoreCase("Triangle") || shape.equalsIgnoreCase("Segitiga")) {
            return new ShapeCollections.Triangle();
        }
        return null;
    }

}
