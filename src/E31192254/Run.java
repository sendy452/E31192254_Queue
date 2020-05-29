/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31192254;

import java.util.Scanner;

/**
 *
 * @author Sendy
 */
public class Run {
    public static void main(String[] args) {
        String data, pilih;
        
        System.out.println("===================================");
        System.out.println("---------  QUEUE PROGRAM  ---------");
        System.out.println("===================================");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        //Memasukkan batasan data yang akan dimsaukkan ke dalam array Queue
        System.out.print("Masukkan jumlah data\t: ");
        int banyak = input.nextInt();
        Queue result = new Queue(banyak);
        //"Do" untuk melakukan perintah yang pertama kali dijalankan sebelum melanjutkan ke perulangan while
        do {
            System.out.println("~~~~~~~~~~~   MAIN MENU   ~~~~~~~~~~");
            System.out.println("1. Enqueue Data");
            System.out.println("2. Dequeue Data");
            System.out.println("3. Keluar Program");
            System.out.print("Masukkan pilihan menu\t: ");
            pilih = input.next();
            
            //Pilihan menu dalam Program Queue, dimana tiap menu mengambil dari Class Queue yang diberi nama objek baru disini sebagai result
            if ("1".equalsIgnoreCase(pilih)) { //Menu input/Enqueue
                System.out.print("Masukkan data yang akan ditambahkan : ");
                data = input.next();
                result.Enqueue(data);
            } else if ("2".equalsIgnoreCase(pilih)) { //Menu Dequeue/hapus data
                result.Dequeue();
            } else if ("3".equalsIgnoreCase(pilih)) { //Menu keluar dari program
                System.exit(0);
            } else {
                System.out.println("Pilihan tidak ada"); //Output yang keluar apabila salah memasukkan pilihan menu
            }
            result.tampilkan(); //Menampilkan isi dari array Queue
        } while (pilih != null); //Perulangan terjadi sampai inputan pilihan menu/pilih bernilai tidak kosong atau salah input              
    }
}
