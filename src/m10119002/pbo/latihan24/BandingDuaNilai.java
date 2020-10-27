/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan24;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program perbandingan dua buah nilai
 * 
 * 
 */
public class BandingDuaNilai {
    private final Scanner scanner;
    public BandingDuaNilai() {scanner = new Scanner(System.in);}
    
    private String getInput() {return scanner.nextLine();}
    
    private Integer getInteger(String test) {
        Integer temp;
        try {
            temp = Integer.parseInt(test);
        } catch (NumberFormatException ex) {
            System.err.println("Gagal proses, pastikan tidak ada titik, koma"
                    + ", apalagi huruf atau simbol!");
            return null;
        } catch (Exception ex) {
            System.err.println("Gagal proses!");
            return null;
        }
        return temp;
    }
    
    // variables
    int nilaiPertama, nilaiKedua;
    
    private boolean inputNilaiBanding() {
        String input;
        
        System.out.print("Masukkan nilai pertama : ");
        input = getInput();
        if(getInteger(input)!=null) nilaiPertama = getInteger(input);
        else return false;
        
        System.out.print("Masukkan nilai kedua : ");
        input = getInput();
        if(getInteger(input)!=null) nilaiKedua = getInteger(input);
        else return false;
        return true;
    }
    
    private boolean tampilHasil() {
        String hasil = " ";
        if(nilaiPertama > nilaiKedua) hasil = " Lebih besar dari ";
        else if(nilaiPertama < nilaiKedua) hasil = " Lebih kecil dari ";
        else if(nilaiPertama == nilaiKedua) hasil = " Sama dengan ";
        System.out.println("Hasil : ".concat(Integer.toString(nilaiPertama)).
                concat(hasil).concat(Integer.toString(nilaiKedua)));
        return true;
    }
    
    private Boolean programLoop() {
        String input;
        inputNilaiBanding();
        tampilHasil();
        System.out.println("");
        System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
        input = getInput();
        System.out.println("");
        if(input.equalsIgnoreCase("ya")) return true;
        else if(input.equalsIgnoreCase("tidak")) return false;
        else return null;
    }
    
    private int start() {
        Boolean statusLoop;
        System.out.println("========Program Perbandingan Nilai========");
        do {
            statusLoop = programLoop();
            if (statusLoop==null) {
                System.err.println("Gagal proses, Masukkan tidak dikenal!");
                statusLoop = false;
            }
        } while(statusLoop);
        return 0;
    }
    
    public static void main(String[] args) {
        BandingDuaNilai program = new BandingDuaNilai();
        program.start();
    }
}
