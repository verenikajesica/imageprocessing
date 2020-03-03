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
public class ReadFile {
    public static void main(String[] args){
        try{
            FileInputStream myInputFile = new FileInputStream("myFile.txt");
            System.out.println(myInputFile.read());
            System.out.println(myInputFile.read());
            myInputFile.close();
            
        }catch(IOException ex){
            System.out.println("File Error");
        }
    }
}
