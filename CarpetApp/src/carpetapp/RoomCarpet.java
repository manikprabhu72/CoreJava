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
public class RoomCarpet {
    
    private RoomDimension roomDimension;
    private int costPerSqFt;

    public RoomCarpet(RoomDimension roomDimension, int costPerSqFt) {
        this.roomDimension = roomDimension;
        this.costPerSqFt = costPerSqFt;
    }
    

    public RoomDimension getRoomDimension() {
        return roomDimension;
    }

    public void setRoomDimension(RoomDimension roomDimension) {
        this.roomDimension = roomDimension;
    }

    public int getCostPerSqFt() {
        return costPerSqFt;
    }

    public void setCostPerSqFt(int costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }
    
    public int totalCost(){
        return this.roomDimension.area() * this.costPerSqFt;
    }
    
}
