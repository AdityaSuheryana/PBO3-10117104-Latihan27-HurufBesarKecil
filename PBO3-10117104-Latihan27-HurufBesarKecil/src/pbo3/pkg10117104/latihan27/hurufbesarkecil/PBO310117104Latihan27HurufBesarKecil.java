/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama      : Aditya Suheryana
 * Nim       : 10117104
 * Kelas     : IF-3/PBO3
 * Deskripsi : Menampilkan Program yang awalnya 
 *             Huruf Besar dan kecil menjadi kecil semua dan besar semua. 
 */
public class PBO310117104Latihan27HurufBesarKecil {


    public static void main(String[] args) {
    String kalimat;    
    Scanner scn = new Scanner(System.in);
    System.out.printf("Masukkan Kalimat : ");
    kalimat = scn.nextLine();
    System.out.println(""); 
    System.out.println("=============Hasil Formatting==========");
    System.out.println("Huruf Besar : "+kalimat.toUpperCase());
    System.out.println("Huruf Kecil : "+kalimat.toLowerCase());
    }
    
}
