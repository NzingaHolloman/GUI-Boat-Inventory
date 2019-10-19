/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import javax.swing.JOptionPane;

/**
 *
 * @author nzing
 */
public class MajorProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        //Testing man powered boat
        ManPowered testMP = new ManPowered("Two Handed");
        testMP.setData("B", 30.0, 13.0, "FAJ3190A", 3, "Canoe");
        //System.out.println(testMP.toString()+"\n");
        
        //Testing MotorBoat
        Engine MBE = new Engine("Honda",3,300.0);
        Motor MBM = new Motor("Rudder",3,"Iron",MBE);
        MotorBoat testMB = new MotorBoat(true,true,MBM);
        testMB.setData("M", 20.0,2.0,"MIP191",2,"Yacht");
        //System.out.println(testMB.toString()+"\n");
        
        //Testing SailBoat
        Engine SE = new Engine("Honda",4,600.0);
        Motor SM = new Motor("Rudder",5,"Plastic",SE);
        Sailboat testS = new Sailboat(15.0,4.0,"Green",true, true,SM);
        testS.setData("S",53.0,43.0,"AJ831FA",8,"VRAM");
        //System.out.println(testS.toString());
        
        //adding concrete class to the ArrayList in Dock
        Dock testD = new Dock();
        testD.addBoat(testMP);  //adding ManPoweredBoat
        testD.addBoat(testMB);  //adding MotorBoat
        testD.addBoat(testS);   //adding Sailboat
        
        String print = "";
        for(int index =0;index<testD.getNumBoat(); index++){
            print +=testD.getBoat(index).toString()+"\n";
        }
        JOptionPane.showMessageDialog(null, print);
        System.exit(0);
    }
}
