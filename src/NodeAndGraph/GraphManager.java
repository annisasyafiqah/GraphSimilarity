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
public class GraphManager {

    Node root;
    Node pointer;

    public GraphManager() {
        this.root = null;
    }

    public void add(Node newNode) {
        if (root == null) {
            root = newNode;
            System.out.println("isi root " + newNode);
        } else {
            pointer = root;
            boolean inserted = false;
            while (!inserted) {

                if (pointer.Child == null) {
                    pointer.Child = newNode;
                    newNode.Parent = pointer;
                    inserted = true;
                } else {
                    pointer = pointer.Child;
                }

            }
        }
    }
}
