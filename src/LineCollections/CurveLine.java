/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LineCollections;
import aplikasipaint.LineCollection;

/**
 *
 * @author Gerwin Jo
 */
public class CurveLine implements LineCollection {

    @Override
    public String line() {
        return "Garis Melengkung telah dibuat.";
    }

    @Override
    public void infoLine() {
        System.out.println("Line : Curve Line");
    }

    @Override
    public void getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getStroke() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
