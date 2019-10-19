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
public class Sailboat extends Boat{
    private double mastHeight;
    private double boomLength;
    private String sailColor;
    private boolean keef;
    private boolean hasMotor;
    private Motor motor;
    
    public Sailboat(){
        mastHeight = 0;
        boomLength = 0;
        sailColor = null;
        //keef;
        //hasMotor = hm;
        motor = null;
    }
    public Sailboat(double mh, double bl, String sc, boolean k, boolean hm,Motor m ){
        mastHeight = mh;
        boomLength = bl;
        sailColor = sc;
        keef = k;
        hasMotor = hm;
        motor = m;
    }
    @Override
    public String toString(){
        String print;
        if (getMotor()==null){
            print= getMastHeight()+", "+getBoomLength()+", "+getSailColor()+", "+isKeef()+", "+isHasMotor();
        }
        else print= getMastHeight()+", "+getBoomLength()+", "+getSailColor()+", "+isKeef()+", "+isHasMotor()+", "+getMotor();
        return super.toString()+","+print;
    }

    /**
     * @return the mastHeight
     */
    public double getMastHeight() {
        return mastHeight;
    }

    /**
     * @param mastHeight the mastHeight to set
     */
    public void setMastHeight(double mastHeight) {
        this.mastHeight = mastHeight;
    }

    /**
     * @return the boomLength
     */
    public double getBoomLength() {
        return boomLength;
    }

    /**
     * @param boomLength the boomLength to set
     */
    public void setBoomLength(double boomLength) {
        this.boomLength = boomLength;
    }

    /**
     * @return the sailColor
     */
    public String getSailColor() {
        return sailColor;
    }

    /**
     * @param sailColor the sailColor to set
     */
    public void setSailColor(String sailColor) {
        this.sailColor = sailColor;
    }

    /**
     * @return the keef
     */
    public boolean isKeef() {
        return keef;
    }

    /**
     * @param keef the keef to set
     */
    public void setKeef(boolean keef) {
        this.keef = keef;
    }

    /**
     * @return the hasMotor
     */
    public boolean isHasMotor() {
        return hasMotor;
    }

    /**
     * @param hasMotor the hasMotor to set
     */
    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
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
