/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

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
    public void readBoatData(String fileName){
        try {
            Scanner scan = new Scanner(new File(fileName));
            dockName = scan.nextLine();
            String line;
            String[] parts;
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                char str = line.charAt(0);
                switch(str){
                    case 'B':
                        parts = line.split(",");
                        ManPowered MP = new ManPowered(parts[6]);
                        MP.setData("B", Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), parts[3],Integer.parseInt(parts[4]), parts[5]);
                        addBoat(MP);
                        System.out.println(MP.toString());
                        break;
                    case 'M':
                        parts = line.split(",");
                        boolean swimPlatform = false;
                        boolean hardTop = false;
                        if(parts[6].equals("1"))
                            swimPlatform = true;
                        if(parts[7].equals("1"))
                            hardTop = true;
                        //Engine MBE = new Engine("??????",3,300.0);
                        Motor MBM = new Motor();//scan.nextLine(),Integer.parseInt(scan.nextLine()),scan.nextLine(),MBE);
                        MBM.setSteering(scan.nextLine());
                        MBM.setPropellers(Integer.parseInt(scan.nextLine()));
                        MBM.setMaterial(scan.nextLine());
                        Engine MBE = new Engine();//"??????",3,300.0);
                        String[] Eparts = scan.nextLine().split(",");
                        MBE.setBrand(Eparts[0]);
                        MBE.setCylinders(Integer.parseInt(Eparts[1]));
                        MBE.setHorsePower(Double.parseDouble(Eparts[2]));
                        MBM.setEngine(MBE);
                        MotorBoat MB = new MotorBoat(swimPlatform,hardTop,MBM);
                        MB.setData("M", Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), parts[3],Integer.parseInt(parts[4]), parts[5]);
                        addBoat(MB);
                        System.out.println(MB.toString());
                        break; 
                    case 'S':
                        parts = line.split(",");
                        boolean keel = false;
                        boolean hasMotor = false;
                        Motor SM = new Motor();
                        if(parts[9].equals("1"))
                            keel = true;
                        if (parts[10].equals("1")){
                            hasMotor = true;
                            Engine SE = new Engine();//"??????",4,600.0);
                            SM.setSteering(scan.nextLine());
                            SM.setPropellers(Integer.parseInt(scan.nextLine()));
                            SM.setMaterial(scan.nextLine());
                            String[] Eparts2 = scan.nextLine().split(",");
                            SE.setBrand(Eparts2[0]);
                            SE.setCylinders(Integer.parseInt(Eparts2[1]));
                            SE.setHorsePower(Double.parseDouble(Eparts2[2]));
                            SM.setEngine(SE);//SM = new Motor("why no work",5,"Plastic",SE);
                        }
                        //Engine SE = new Engine("??????",4,600.0);
                        //Motor SM = new Motor("why no work",5,"Plastic",SE);
                        Sailboat S = new Sailboat(Double.parseDouble(parts[6]),Double.parseDouble(parts[7]),parts[8],keel, hasMotor,SM);
                        S.setData("S",Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), parts[3],Integer.parseInt(parts[4]), parts[5]);
                        System.out.println(S.toString());
                        addBoat(S);
                        break;
                    default:
                        ;
                    
                }
            }
            
        }catch (FileNotFoundException ex) {
            System.err.println("file not found");
        }
    }
    public void saveBoatData(String fileName)throws FileNotFoundException, IOException{
        FileOutputStream fileByteStream = null;
        PrintWriter outFS= null;
        
        fileByteStream = new FileOutputStream(fileName);
        outFS = new PrintWriter(fileByteStream);
        
        outFS.print(dockName);
        for(Boat printToFile: boats){
            outFS.print("\n"+printToFile.toString());
        }
        outFS.flush();
        fileByteStream.close();
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
