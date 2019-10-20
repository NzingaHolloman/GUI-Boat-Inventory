/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

/**
 *
 * @author nzing
 */
public abstract class Boat {
    private String power;
    private double length;
    private double breadth;
    private String serial;
    private int seats;
    private String type;
    
    public Boat(){
        power =null;
        length =0;
        breadth = 0;
        serial = null;
        seats = 0;
        type = null;
    }
    public Boat(String power, double length, double breadth, String serial, int seats, String type){
        setData(power, length, breadth, serial, seats, type);       
    }
    public void setData(String power, double length, double breadth, String serial, int seats, String type){
        this.power = power;
        this.length = length;
        this.breadth =breadth;
        this.serial = serial;
        this.seats =seats;
        this.type = type;  
    }
    public String toString(){
        return power+","+length+","+breadth+","+serial+","+seats+","+type;
    }
    
    /**
     * @return the power
     */
    public String getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(String power) {
        this.power = power;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the breadth
     */
    public double getBreadth() {
        return breadth;
    }

    /**
     * @param breadth the breadth to set
     */
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}
