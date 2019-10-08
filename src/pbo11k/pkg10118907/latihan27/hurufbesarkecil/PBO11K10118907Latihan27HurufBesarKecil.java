/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan huruf besar kecil
 * 
 */
public class PBO11K10118907Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        /**
         * Taken and inspired from
         * https://stackoverflow.com/questions/19509647/scanner-doesnt-see-after-space
         * Question from igeer12 - https://stackoverflow.com/users/2905685/igeer12 and Jason C - https://stackoverflow.com/users/616460/jason-c
         * Solution from Prabhakaran - https://stackoverflow.com/users/940428/prabhakaran and Sailesh Kotha - https://stackoverflow.com/users/3889006/sailesh-kotha
         */
        String nilai = scanner.nextLine();
        
        format(nilai);
    }
    
    public static void format(String nilai) {
        System.out.println("Huruf besar : "+nilai.toUpperCase());
        System.out.println("Huruf kecil : "+nilai.toLowerCase());
        
    }
    
}
