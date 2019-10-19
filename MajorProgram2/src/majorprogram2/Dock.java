/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.util.ArrayList;

/**
 *
 * @author nzing
 */
public class Dock {
    private String dockName;
    private ArrayList<Boat> boats = new ArrayList<Boat>();
    
    public Dock(){
        dockName = null;
    }
    public void reaBoatData(String fileName){
        
    }
    public void saveBoatData(String fileName){
        
    }

    /**
     * @return the dockName
     */
    public String getDockName() {
        return dockName;
    }

    /**
     * @param dockName the dockName to set
     */
    public void setDockName(String dockName) {
        this.dockName = dockName;
    }
    
    /**
     * @return the boats
     */
    public ArrayList<Boat> getBoats() {
        return boats;
    }
    
    public int getNumBoat(){
        return getBoats().size();
    }
    public Boat getBoat(int index){
        return getBoats().get(index);
    }
    public void setBoat(int index, Boat item){
        getBoats().set(index, item);
    }
    public void addBoat(Boat item){
        getBoats().add(item);
    }
    public Boat removeBoat(int index){
        getBoats().remove(index);
        return getBoats().get(index);
    }
}
