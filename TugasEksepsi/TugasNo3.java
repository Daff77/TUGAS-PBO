/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEksepsi;

/**
 *
 * @author Daffa Danendra
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.SocketException;

public class TugasNo3 {
    public static void main(String[] args) {
        String fileName = "C:/Users/Daffa/Documents/config.txt"; // file lokal yang akan dikirim

        // try-with-resources otomatis menutup Socket, FileInputStream, dan OutputStream
        try (Socket socket = new Socket("localhost", 8080);
             FileInputStream fis = new FileInputStream(fileName);
             OutputStream out = socket.getOutputStream()) {

            System.out.println("Menghubungkan ke server...");
            byte[] buffer = new byte[4096];
            int bytesRead;

            // Membaca isi file dan mengirimkan ke server
            while ((bytesRead = fis.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            System.out.println("File berhasil dikirim ke server.");

        // Exception handling spesifik
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Host server tidak dikenali: " + e.getMessage());
        } catch (SocketException e) {
            System.out.println("Kesalahan koneksi socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan I/O saat membaca/menulis: " + e.getMessage());
        } finally {
            System.out.println("Proses selesai, resource ditutup.");
        }
    }
}

