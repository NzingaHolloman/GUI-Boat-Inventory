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
public class ManPowered extends Boat {
    private String typeOfPaddle;
    
    public ManPowered(){
        typeOfPaddle = "";
    }
    public ManPowered(String typeOfPaddle){
        this.typeOfPaddle = typeOfPaddle;
    }
    @Override
    public String toString(){
        return super.toString()+", "+typeOfPaddle;
    }

    /**
     * @return the typeOfPaddle
     */
    public String getTypeOfPaddle() {
        return typeOfPaddle;
    }

    /**
     * @param typeOfPaddle the typeOfPaddle to set
     */
    public void setTypeOfPaddle(String typeOfPaddle) {
        this.typeOfPaddle = typeOfPaddle;
    }
}
