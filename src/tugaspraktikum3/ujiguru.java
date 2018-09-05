/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum3;

/**
 *
 * @author Amalia Yuna
 */
import java.util.Scanner;
public class ujiguru {
    public static void main(String []args){
        matematika m = new matematika();
        Scanner sc = new Scanner(System.in);
        //inputan
        System.out.print ("Masukkan nama guru :");
        String nama = sc.next();
        System.out.print ("Masukkan nip guru :");
        int nip = sc.nextInt();
        System.out.print ("Masukkan mapel yang diajar :");
        String mapel = sc.next();
        System.out.print ("Masukkan alokasi waktu :");
        int alokasi = sc.nextInt();
        
        
        m.setNama(nama);
        m.setNip(nip);
        m.setMapel(mapel);
        m.setAlokasi(alokasi);
        m.tampilkan();
    } 
    
}
