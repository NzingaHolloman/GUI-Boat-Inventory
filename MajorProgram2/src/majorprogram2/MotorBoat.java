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
public class MotorBoat extends Boat {
    private boolean swimPlatform;
    private boolean hardTop;
    private Motor motor;
    
    public MotorBoat(){
        
    }
    public MotorBoat(boolean swimPlatforms, boolean hardTop,Motor m){
        this.swimPlatform = swimPlatforms;
        this.hardTop = hardTop;
        motor = m;        
    }
    @Override
    public String toString(){
        String sp = "0";
        if(swimPlatform==true)
            sp = "1";
        String ht = "0";
        if(hardTop == true)
            ht = "1";
        return super.toString()+","+sp+","+ht+motor;
    }

    /**
     * @return the swimPlatform
     */
    public boolean isSwimPlatform() {
        return swimPlatform;
    }

    /**
     * @param swimPlatform the swimPlatform to set
     */
    public void setSwimPlatform(boolean swimPlatform) {
        this.swimPlatform = swimPlatform;
    }

    /**
     * @return the hardTop
     */
    public boolean isHardTop() {
        return hardTop;
    }

    /**
     * @param hardTop the hardTop to set
     */
    public void setHardTop(boolean hardTop) {
        this.hardTop = hardTop;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
