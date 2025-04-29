/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author Bisma
 * TGL, 29 April 2025
 */
public class mahasiswa {
    private String NIM, NAMA;
    
    public void datamhs(){
        System.out.println("Menampilkan Data Mahasiswa");
    }
    public void datamhs(String nNIM){
        this.NIM = nNIM;
        System.out.printf("Data Mahasiswa Dengan NIM %s\n",this.NIM);
    }
    public void datamhs(String nNIM, String nNAMA){
        this.NIM = nNIM;
        this.NAMA = nNAMA;
        System.out.printf("Data Mahasiswa Dengan NIM %s adalah %s\n", this.NIM, this.NAMA);
    }
}
