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
public interface LineCollection {

    String line();

    void infoLine();

    abstract void getColor();

    abstract void getStroke();
}
