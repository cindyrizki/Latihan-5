/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutamu;

/**
 *
 * @author Lenovo
 */
public class BukuTamu {
    public static String nama, almt, telp;
    private static int id = 1;
    public final int jmltamu = 10;
    
    public BukuTamu(){
        nama = "";
        almt = "";
        telp = "";
    }
    public boolean getId(){
        double  temp = id;
        if (temp <= jmltamu){
            id = id;
            return true;
        } else {
            return false;
        }
    }
    public static void Tampilan(String a, String b, String c){
        System.out.println("========================");
        System.out.println("        BUKU TAMU       ");
        System.out.println("========================");
        System.out.println("Nama        : "+a);
        System.out.println("Alamat      : "+b);
        System.out.println("No. Telp    : "+c);
        System.out.println("No. ID      : "+id++);
        System.out.println("========================");
    }
  
    
}
