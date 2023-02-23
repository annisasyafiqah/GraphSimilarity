/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubGraph;

import similarity.ToGraph;

/**
 *
 * @author User
 */
public class GraphApp {
    public static void main(String[] args) {
        String Doc1= "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String Doc2 ="Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,";
        String Doc3 ="when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        String Doc4 ="It has survived not only five centuries, but also the leap into electronic typesetting,";
        String Doc5 ="Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String Doc6 ="It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,";
        String Doc7 ="and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String Doc8 ="It has survived not only five centuries, but also the leap into electronic typesetting,";
        String Doc9 ="Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
        String Doc10 ="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.";

        ToGraph graph = new ToGraph();
        graph.ToGraph(Doc1);
        graph.ToGraph(Doc2);
        graph.ToGraph(Doc3);
        graph.ToGraph(Doc4);
        graph.ToGraph(Doc5);
        graph.ToGraph(Doc6);
        graph.ToGraph(Doc7);
        graph.ToGraph(Doc8);
        graph.ToGraph(Doc9);
        graph.ToGraph(Doc10);
    }
}
