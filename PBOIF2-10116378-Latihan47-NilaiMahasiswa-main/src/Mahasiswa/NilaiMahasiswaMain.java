/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 *@author Sri Utami Ningsih
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116378
 * Deskripsi Program : Nilai Mahasiswa
 */
public class NilaiMahasiswaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         NilaiMahasiswa mahasiswa = new NilaiMahasiswa(75, 45, 34);
        
        System.out.printf("QUIZ       : %.1f\n",mahasiswa.getNilaiQuiz());
        System.out.printf("UTS        : %.1f\n",mahasiswa.getNilaiUTS());
        System.out.printf("UAS        : %.1f\n\n",mahasiswa.getNilaiUAS());
        
        mahasiswa.setNilaiAkhir(mahasiswa.getNilaiQuiz(),mahasiswa.getNilaiUTS(),mahasiswa.getNilaiUAS());
        System.out.printf("Nilai Akhir   : %.1f\n\n",mahasiswa.getNilaiAkhir());
        
        mahasiswa.setIndex(mahasiswa.getNilaiAkhir());
        System.out.printf("Index   : %s\n",mahasiswa.getIndex());
        
        mahasiswa.setKeterangan(mahasiswa.getIndex());
        System.out.printf("Keterangan   : %s\n",mahasiswa.getKeterangan());
        
    }
    
}
