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
public abstract class ShapeCollectionDecorator implements ShapeCollection, ColorCollection, LineCollection {
    
    protected ShapeCollection shape;
    protected ColorCollection color;
    protected LineCollection line;
    
    public ShapeCollectionDecorator (ShapeCollection shape, ColorCollection color, LineCollection line) {
        this.shape = shape;
        this.color = color;
        this.line = line;
    }

    public void infoShape() {
        shape.infoShape();
        color.color();
    }
    
}
