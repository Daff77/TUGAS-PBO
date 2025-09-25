/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEksepsi;

/**
 *
 * @author Daffa Danendra
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Berikut Perbaikan Kode
public class TugasNo2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();
            if (line == null) {
                System.out.println("File kosong");
                return;
            }
            int angka = Integer.parseInt(line);
            if (angka == 0) {
                System.out.println("Tidak bisa membagi dengan nol.");
                return;
            }
            System.out.println("Hasil: " + (10 / angka));
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Isi file bukan angka: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O: " + e.getMessage());
        }
    }
}

