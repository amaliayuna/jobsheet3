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
public class matematika extends guru{
    public String mapel;
    public int alokasi;
    
    public void setMapel (String mapel){
        this.mapel = mapel;
    }
    public void setAlokasi (int alokasi){
        this.alokasi = alokasi;
    }
    
    public void tampilkan(){
        System.out.println("======================");
        System.out.println(" Data Pekerja Sekolah ");
        System.out.println("======================");
        System.out.println("Mapel yang diajar :"+mapel);
        System.out.println("Alokasi waktu :"+alokasi+" jam");
        System.out.println("Nama Guru :"+nama);
        System.out.println("Nip Guru :"+nip);
    }
    
    
}
