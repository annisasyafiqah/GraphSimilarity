/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Weight {

    public Integer Frequency(ArrayList<String> wordsList1, String term) {
        int result = 0;
        for (String word : wordsList1) {
            if (term.equals(word)) {
                result++;
            }
        }
//        System.out.println("frequency " + term + " = " + result / wordsList1.size());
        return result; /// wordsList1.size();
    }

    public double idf(ArrayList<ArrayList<String>> wordsList, String term) {
        double n = 0;
        for (List<String> doc : wordsList) {
            for (String word : doc) {
                if (term.equals(word)) {
                    n++;
                    break;
                }
            }
        }
        System.out.println("idf " + term + " = " +Math.log(wordsList.size() / n));
        return Math.log(wordsList.size() / n);
    }

    public double weight(ArrayList<String> wordsList1, ArrayList<ArrayList<String>> wordsList, String term) {
        System.out.println("weight " + term + " = " + Frequency(wordsList1, term) * idf(wordsList, term));
        return Frequency(wordsList1, term) * idf(wordsList, term);
    }
    
    
}
