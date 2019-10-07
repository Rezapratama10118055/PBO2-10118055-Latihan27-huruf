/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan27HurufBesarKecil {
     public static String input;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Kalimat:");
        input = userInput.nextLine();
        
        System.out.println("========Hasil Formatting=======");
           System.out.println("Huruf Besar:"+input.toUpperCase());
           System.out.println("Huruf Kecil:"+input.toLowerCase());
    }
    
}
