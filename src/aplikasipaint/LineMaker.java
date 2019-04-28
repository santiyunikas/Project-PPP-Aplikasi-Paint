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
public class LineMaker {

    public LineCollection getLine(String line) {
        if (line == null) {
            return null;
        } else if (line.equalsIgnoreCase("Line2D")) {
            return new LineCollections.Line2D();
        } else if (line.equalsIgnoreCase("Curve")) {
            return new LineCollections.CurveLine();
        } else if (line.equalsIgnoreCase("Transform")) {
            return new LineCollections.TransformLine();
        }
        return null;
    }

}
