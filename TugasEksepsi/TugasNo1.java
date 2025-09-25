/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEksepsi;

/**
 *
 * @author Daffa Danendra
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TugasNo1 {
    public static void main(String[] args) {
        try {
            File file = new File("D://file.txt");
            FileReader fr = new FileReader(file);
            System.out.println("File Berhasil DibacaD " + fr);
        } catch (FileNotFoundException ex) {
            System.out.println("Terjadi kesalahan: File tidak ditemukan");
        }
    }
}

