/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpetapp;

/**
 *
 * @author Manik
 */
public class RoomDimension {
    
    private int length;
    private int width;

    public RoomDimension(int length, int width) {
        this.length = length;
        this.width = width;
    }
    

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int area(){
        return this.length * this.width;
    }
    
}
