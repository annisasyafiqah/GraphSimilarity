/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NodeAndGraph;


import java.util.ArrayList;
import similarity.Cleaning;

/**
 *
 * @author pialogue
 */
public class GM_D {

    

    public static void main(String[] args) {
        String Doc1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String Doc2 = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,";
        String Doc3 = "when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        String Doc4 = "It has survived not only five centuries, but also the leap into electronic typesetting,";
        String Doc5 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        String Doc6 = "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,";
        String Doc7 = "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        String Doc8 = "It has survived not only five centuries, but also the leap into electronic typesetting,";
        String Doc9 = "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s";
        String Doc10 = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.";

        NewestClass nc = new NewestClass();
        nc.NewClass(Doc1);
        nc.NewClass(Doc2);
        nc.NewClass(Doc3);
        nc.NewClass(Doc4);
        nc.NewClass(Doc5);
        nc.NewClass(Doc6);
        nc.NewClass(Doc7);
        nc.NewClass(Doc8);
        nc.NewClass(Doc9);
        nc.NewClass(Doc10);
    }
}

class NewestClass {

    public void NewClass(String Doc) {
        ArrayList<String> wordsList;
        Cleaning clean = new Cleaning();
        wordsList = clean.Cleaning(Doc);
        
        
        Node nd[] = new Node[wordsList.size()];
        GraphManager gm = new GraphManager();
        for (int i = 0; i < wordsList.size(); i++) {
            nd[i] = new Node(i, wordsList.get(i));
            gm.add(nd[i]);
        }
        for (int i = 0; i < (nd.length - 1); i++) {
            nd[i].next = nd[i + 1];
        }
        for (int i = 0; i < nd.length; i++) {
            System.out.println(nd[i]);
        }

    }
}
