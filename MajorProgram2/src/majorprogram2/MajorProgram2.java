/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author nzing
 */
public class MajorProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here\
        Dock testD2 = new Dock();
        String FN;
        FN = "inputFile.txt";
        File file = new File(FN);
        if(!file.exists()){
            JFileChooser j = new JFileChooser("C:"); 
            j.showSaveDialog(null); 
            FN=j.getSelectedFile().getName();
        }
               
        testD2.readBoatData(FN);
        
        ManPowered test1 = new ManPowered("four Handed");
        test1.setData("B", 44.0, 14.0, "ABC123", 4, "biger boat");
        testD2.addBoat(test1);
        
        //Testing MotorBoat
        Engine test2E;
        test2E= new Engine("KIA",2,200.0);
        Motor test2M = new Motor("MotorTest",2,"Foam",test2E);
        MotorBoat test2 = new MotorBoat(false,true,test2M);
        test2.setData("M", 20.0,2.0,"MIP191",2,"Yacht");
        testD2.addBoat(test2);
        
        //Testing SailBoat
        Engine test3E = new Engine("Honda",10,900.0);
        Motor test3M = new Motor("yank",8,"Foam",test3E);
        Sailboat test3 = new Sailboat(15.0,5.0,"Yellow",true, true,test3M);
        test3.setData("S",53.0,43.0,"NKH020",8,"OkayThen");
        testD2.addBoat(test3);
        
        testD2.saveBoatData(FN);
        
    }
}