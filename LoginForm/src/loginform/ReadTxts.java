/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

/**
 *
 * @author PC
 */
public class ReadTxts {
       public static void main(String[] args) throws Exception{
        /*readfile r = new readfile();
        r.openFile();
        r.readFile();
        r.closeFile();
*/
        Runtime rt=Runtime.getRuntime();
        String file="C:\\Users\\PC\\Desktop\\PregnancyPeriod.java";
        Process p =rt.exec("notepad " + file);
    }

}
    
