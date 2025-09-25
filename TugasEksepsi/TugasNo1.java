/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasEksepsi;

/**
 *
 * @author Daffa Danendra
 */
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class TugasNo1 {
    public static void main(String[] args) {
        try {
            // Membuat koneksi ke server localhost port 8080
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Koneksi berhasil dibuat.");

            // Menutup koneksi
            socket.close();
            System.out.println("Socket sudah ditutup.");

            // Mencoba menggunakan socket setelah ditutup
            OutputStream out = socket.getOutputStream();
            out.write(1); // ini akan memicu SocketException

        } catch (SocketException e) {
            System.out.println("SocketException terjadi: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Kesalahan lain: " + e.getMessage());
        }
    }
}

