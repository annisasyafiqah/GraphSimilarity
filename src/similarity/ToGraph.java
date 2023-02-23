/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import SubGraph.Graph;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ToGraph {
    public void ToGraph(String Doc){
        ArrayList<String> wordsList;
        Cleaning clean = new Cleaning();
        wordsList = clean.Cleaning(Doc);
        
        Graph gm = new Graph();
        for (int i = 0; i < wordsList.size(); i++) {
        gm.addVertex(wordsList.get(i));
        gm.addEdge(i,i+1);
        }
        gm.display();
    }
}
