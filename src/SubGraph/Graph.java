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
public class Graph {

    private final int MAX_VERTS = 20;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Stack theStack;
    private Queue theQueue;
    private String[] sortedArray;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        theStack = new Stack(MAX_VERTS);
        theQueue = new Queue(MAX_VERTS);

        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
        sortedArray = new String[MAX_VERTS];
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
    }

    public void display() {
        System.out.println("Adjecency:");
        for (int row = 0; row < nVerts; row++) {
            for (int col = 0; col < nVerts; col++) {
                if (adjMat[row][col] == 1) {
                    System.out.println(vertexList[row].label + " --> "
                            + vertexList[col].label);
                }
            }
        }
        System.out.println("");
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label + " ");
    }

    private int noSuccessors() {
        boolean isEdge;
        for (int row = 0; row < nVerts; row++) {
            isEdge = false;
            for (int col = 0; col < nVerts; col++) {
                if (adjMat[row][col] > 0) {
                    isEdge = true;
                    break;
                }
            }
            if (!isEdge) {
                return row;
            }
        }
        return -1;
    }
    
    private void deleteVertex (int delVert){
        if (delVert != nVerts - 1) {
            for (int j = delVert; j < nVerts -1; j++) {
                vertexList[j] = vertexList[j+1];
            }
            for (int row = delVert; row < nVerts - 1; row++) {
                moveRowUp(row, nVerts);
            }
            for (int col = delVert; col < nVerts - 1; col++) {
                moveColLeft(col, nVerts);
            }
        }
        nVerts--;
    }
    
    private void moveRowUp(int row, int length) {
        for (int col = 0; col < length; col++) {
            adjMat[row][col] = adjMat[row + 1][col];
        }
    }
    
    private void moveColLeft(int col, int length) {
        for (int row = 0; row < length; row++) {
            adjMat[row][col] = adjMat[row][col + 1];
        }
    }
}    
