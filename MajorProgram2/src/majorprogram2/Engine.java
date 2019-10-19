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
public class Engine{
    private String brand;
    private int cylinders;
    private double horsePower;
    
    public Engine(){
        
    }
    public Engine(String b, int c,double hp){
        brand = b;
        cylinders = c;
        horsePower = hp;
    }
    @Override
    public String toString(){
        return getBrand()+","+getCylinders()+","+getHorsePower();
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the cylinders
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * @param cylinders the cylinders to set
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    /**
     * @return the horsePower
     */
    public double getHorsePower() {
        return horsePower;
    }

    /**
     * @param horsePower the horsePower to set
     */
    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
    
}
