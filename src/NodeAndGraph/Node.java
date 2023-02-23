/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodeAndGraph;

/**
 *
 * @author pialogue
 */
public class Node {
    Data data;
    Node Child;
    Node Parent;
    Node next;

    public Node(int id, String nama) {
        this.data = new Data(id, nama);
        this.Child = null;
        this.Parent = null;
    }
    
    public Data getData(){
        return data;
    }
    
    public void setData(Data data){
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
    
    
    
}
