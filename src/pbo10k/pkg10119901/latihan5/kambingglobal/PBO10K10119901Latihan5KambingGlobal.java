/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan5.kambingglobal;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan Program Kambing Global
 *
 */
public class PBO10K10119901Latihan5KambingGlobal {
    
    int jumlahKambing = 0;
    
    public void getJumlahKambing()
    {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
        
    public void tambahKambing()
    {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO10K10119901Latihan5KambingGlobal kambingSusu = new PBO10K10119901Latihan5KambingGlobal();
        
        kambingSusu.getJumlahKambing();
        kambingSusu.tambahKambing();
        kambingSusu.getJumlahKambing();
    }
    
}
