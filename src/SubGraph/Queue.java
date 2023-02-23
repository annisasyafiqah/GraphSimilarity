package SubGraph;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pialogue
 */
public class Queue {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

//method untuk menampilkan isi queue
    public void display() {
        int temp = this.front;
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[(front++)] + ",");
            if (front == maxSize) {
                front = 0;
            }
        }
        System.out.println("\n");
        front = temp;
    }

//method untuk memasukkan value ke array atau queue    
    public void insert(int nama) {
        if (rear == maxSize - 1) { // if (isFull()){
//            System.out.println("Maaf " + nama + ", antrian masih penuh");

        } else {
            queArray[++rear] = nama;
//            System.out.println(nama + " inserted");
            nItems++;

        }
    }
//method untuk menghapus value
    public int remove() {
        int temp = queArray[front];
        queArray[front] = 0;
        front++;

        if (front == maxSize) {
            front = 0;
        }

        nItems--;
//        System.out.println(temp + " removed");

        return temp;
    }

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {

        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

}
