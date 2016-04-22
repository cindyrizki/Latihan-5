/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutamu;

import java.util.Scanner;
public class BukuTamuMain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        BukuTamu book1 = new BukuTamu();
        while(book1.getId()==true){
            System.out.print("Nama      : ");
            String a = in.nextLine();
            System.out.print("Alamat    : ");
            String b = in.nextLine();
            System.out.print("No. Telp  : ");
            String c = in.nextLine();
            System.out.println();
            BukuTamu.Tampilan(a,b,c);
            System.out.println();
        }       
    }
}
