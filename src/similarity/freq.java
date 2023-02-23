/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class freq {

    public void hitung(ArrayList<String> wordsList1, ArrayList<ArrayList<String>> wordsList) {
        Weight w = new Weight();
        Map<String, Integer> dict = new HashMap<>();
        for (int k = 0; k < wordsList1.size(); k++) {
            System.out.println("Frequency " + wordsList1.get(k));
            for (int i = 0; i < wordsList.size(); i++) {
                    dict.put(wordsList1.get(k), w.Frequency(wordsList.get(i), wordsList1.get(k)));
                    
                    System.out.println("Doc" + i + " " + dict.get(wordsList1.get(k)));
            }
            
        }
        Map<String, Double> dict1 = new HashMap<>();
        for (int k = 0; k < wordsList1.size(); k++) {
            System.out.println("Frequency " + wordsList1.get(k));
            for (int i = 0; i < wordsList1.size(); i++) {
                    dict1.put(wordsList1.get(k), w.idf(wordsList, wordsList1.get(k)));
                    
                    System.out.println("Doc" + i + " " + dict1.get(wordsList1.get(k)));
            }
            
        }
        Map<String, Double> dict2 = new HashMap<>();
        for (int k = 0; k < wordsList1.size(); k++) {
//            System.out.println("Frequency " + wordsList1.get(k));
            for (int i = 0; i < wordsList1.size(); i++) {
                    dict2.put(wordsList1.get(k), w.weight(wordsList1, wordsList, wordsList1.get(i)));
                    
                    System.out.println("Doc" + i + " " + dict2.get(wordsList1.get(k)));
            }
            
        }
        
    }
}
