/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;
import java.io.*;
/**
 *
 * @author Student
 */
public class WriteClass {
    public static void main(String [] args){
        try{
//            FileOutputStream myOutputFile = new FileOutputStream("myFile.txt");
//            myOutputFile.write(1);
//            myOutputFile.write(2);
//            myOutputFile.write('T');
//            myOutputFile.close();
//            FileInputStream myInputFile = new FileInputStream("yoda.txt");
            
            FileInputStream myInputFile = new FileInputStream("Images/yoda.tif");              
                int value;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                while((value = myInputFile.read()) !=-1){
                    
                //System.out.println(value);//print DEC                
                System.out.print(Integer.toHexString(value));//print HEX
                
                }
                myInputFile.close();
                
        }catch(IOException ex){
            System.out.println("File outoput Error!");
        }
    }
}

