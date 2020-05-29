/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31192254;

/**
 *
 * @author Sendy
 */
public class Queue {

    String data[];
    int head = 0;
    int tail = -1;

    //Meminta nilai dari jumlah array Queue
    public Queue(int size) {
        data = new String[size];
    }

    //Method untuk mengecek apakah isi array Queue masih kosong atau belum penuh
    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        } else {
            return false;
        }
    }

    //Method untuk mengembalikan nilai boolean apabila isi array Queue sudah penuh
    public boolean isFull() {
        if (tail == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Method yang berfungsi untuk menambahkan data ke dalam array Queue
    Ada dua kondisi apabila data belum penuh maka akan menambahkan data tersubut kedalam array,
    apabila array penuh maka akan menampilkan "Isi Queue sudah penuh".
     */
    public void Enqueue(String dataBaru) {
        if (isEmpty()) {
            tail = head;
            data[tail] = dataBaru;
        } else if (!isFull()) {
            tail++;
            data[tail] = dataBaru;
        } else {
            System.out.println("Isi Queue sudah penuh");
        }
    }

    //Method yang berfungsi untuk menghapus data terlama atau data paling awal ditambahkan di dalam array Queue
    public int Dequeue() {
        int temp = 0;
        if (!isEmpty()) {
            System.out.println("Sukses menghapus data " + data[head]);
            for (int i = head; i <= tail - 1; i++) {
                data[i] = data[i + 1];
            }
            tail--;
        }
        return temp;
    }

    //Method untuk menmapilkan isi dari array Queue
    public void tampilkan() {
        if (!isEmpty()) {
            int index = head;
            while (index <= tail) {
                System.out.print("|" + data[index] + "| ");
                index++;
            }
            System.out.println("\n");
        } else {
            System.out.println("Isi Queue kosong \n");
        }
    }
}
