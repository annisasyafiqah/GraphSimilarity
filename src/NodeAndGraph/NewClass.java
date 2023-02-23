/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodeAndGraph;

/**
 *
 * @author User
 */
public class NewClass {

    static class Data {

        public int id;
        public String nama;

        Data(int id, String nama) {
            this.id = id;
            this.nama = nama;
        }
    }

    static class Node {

        Data data;
        Node next;
        Node prev;
        Node pointer;

        Node(int id, String nama) {
            data = new Data(id, nama);
        }

        public Data getData() {
            return data;
        }
        
        
    }
    
    public static void main(String[] args) {
        Node []nd = new Node[5];
        
        nd[0]= new Node(4, "AA");
        nd[1]= new Node(2, "BB");
        nd[2]= new Node(1, "CC");
        nd[3]= new Node(7, "DD");
        nd[4]= new Node(5, "EE");
        
        for (int i = 0; i < (nd.length-1); i++) 
            nd[i].next= nd[i+1];
        Node last = nd[nd.length-1];
        last.next = nd[0];
        
        for (int i = 0; i < (nd.length-1); i++)
            System.out.println(nd[i].getData().nama + nd[i].next.getData().nama);
        
    }
    
    
}
