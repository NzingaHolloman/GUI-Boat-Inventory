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
public class Motor{
    private String steering;
    private int propellers;
    private String material;
    private Engine engine;
    
    public Motor(){
        steering =null;
        propellers = 0;
        material = null;
        engine = null;
    }
    public Motor(String steer, int pro, String mat, Engine eng){
        steering =steer;
        propellers = pro;
        material = mat;
        engine = eng;
    }
    @Override
    public String toString(){
        String r;
        if (propellers==0)
            r = "";
        else 
            r = "\n"+getSteering()+System.lineSeparator()+getPropellers()+System.lineSeparator()+getMaterial()+System.lineSeparator()+getEngine();
        return r;
    }

    /**
     * @return the steering
     */
    public String getSteering() {
        return steering;
    }

    /**
     * @param steering the steering to set
     */
    public void setSteering(String steering) {
        this.steering = steering;
    }

    /**
     * @return the propellers
     */
    public int getPropellers() {
        return propellers;
    }

    /**
     * @param propellers the propellers to set
     */
    public void setPropellers(int propellers) {
        this.propellers = propellers;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
}
