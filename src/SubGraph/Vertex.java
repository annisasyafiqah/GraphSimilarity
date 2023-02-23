/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubGraph;

/**
 *
 * @author User
 */
public class Vertex {
    public String label;
    public boolean wasVisited;
    
    public Vertex(String label) {
        this.label = label;
        wasVisited = false;
    }
}
