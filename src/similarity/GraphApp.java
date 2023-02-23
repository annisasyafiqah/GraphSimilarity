/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import corenlp.POSExample;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author User
 */
public class GraphApp {

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

        ToGraph nc = new ToGraph();
        nc.ToGraph(Doc1);
        nc.ToGraph(Doc2);
        nc.ToGraph(Doc3);
        nc.ToGraph(Doc4);
        nc.ToGraph(Doc5);
        nc.ToGraph(Doc6);
        nc.ToGraph(Doc7);
        nc.ToGraph(Doc8);
        nc.ToGraph(Doc9);
        nc.ToGraph(Doc10);
        //mengganti semua huruf kapital menjadi kecil/normalisation

        POSExample pos = new POSExample();
        for (int i = 0; i < pos.jenisKata(Doc1).size(); i++) {
        System.out.println(pos.jenisKata(Doc1).get(i));
        }
//        System.out.println(pos.jenisKata(Doc2));
//        System.out.println(pos.jenisKata(Doc3));
//        System.out.println(pos.jenisKata(Doc4));
//        System.out.println(pos.jenisKata(Doc5));
//        System.out.println(pos.jenisKata(Doc6));
//        System.out.println(pos.jenisKata(Doc7));
//        System.out.println(pos.jenisKata(Doc8));
//        System.out.println(pos.jenisKata(Doc9));
//        System.out.println(pos.jenisKata(Doc10));

        Map<String, Integer> dict1 = new HashMap<>();
        Map<String, Integer> dict2 = new HashMap<>();
    
        
        ArrayList<String> wordsList1 = new ArrayList<>();
        ArrayList<String> wordsList2 = new ArrayList<>();
        ArrayList<String> wordsList3 = new ArrayList<>();
        ArrayList<String> wordsList4 = new ArrayList<>();
        ArrayList<String> wordsList5 = new ArrayList<>();
        ArrayList<String> wordsList6 = new ArrayList<>();
        ArrayList<String> wordsList7 = new ArrayList<>();
        ArrayList<String> wordsList8 = new ArrayList<>();
        ArrayList<String> wordsList9 = new ArrayList<>();
        ArrayList<String> wordsList10 = new ArrayList<>();
        
        ArrayList<ArrayList<String>> wordsList = new ArrayList<>();
        
       
        Cleaning clean = new Cleaning();
        
        wordsList1 = clean.Cleaning(Doc1);
        wordsList2 = clean.Cleaning(Doc2);
        wordsList3 = clean.Cleaning(Doc3);
        wordsList4 = clean.Cleaning(Doc4);
        wordsList5 = clean.Cleaning(Doc5);
        wordsList6 = clean.Cleaning(Doc6);
        wordsList7 = clean.Cleaning(Doc7);
        wordsList8 = clean.Cleaning(Doc8);
        wordsList9 = clean.Cleaning(Doc9);
        wordsList10 = clean.Cleaning(Doc10);
        
        System.out.println(wordsList1);
        System.out.println(wordsList2);
        System.out.println(wordsList3);
        System.out.println(wordsList4);
        System.out.println(wordsList5);
        System.out.println(wordsList6);
        System.out.println(wordsList7);
        System.out.println(wordsList8);
        System.out.println(wordsList9);
        System.out.println(wordsList10);
        
        wordsList.add(wordsList1);
        wordsList.add(wordsList2);
        wordsList.add(wordsList3);
        wordsList.add(wordsList4);
        wordsList.add(wordsList5);
        wordsList.add(wordsList6);
        wordsList.add(wordsList7);
        wordsList.add(wordsList8);
        wordsList.add(wordsList9);
        wordsList.add(wordsList10);
        
//        freq f = new freq();
//        
//          f.hitung(wordsList1, wordsList);
//          f.hitung(wordsList2, wordsList);
//          f.hitung(wordsList3, wordsList);
//          f.hitung(wordsList4, wordsList);
//          f.hitung(wordsList5, wordsList);
//          f.hitung(wordsList6, wordsList);
//          f.hitung(wordsList7, wordsList);
//          f.hitung(wordsList8, wordsList);
//          f.hitung(wordsList9, wordsList);
//          f.hitung(wordsList10, wordsList);
//        
//        
//        for (String str : wordsList1) {
//            if (dict1.containsKey(str)) {
//                dict1.put(str, 1 + dict1.get(str));
//            } else {
//                dict1.put(str, 1);
//            }
//            if (!dict2.containsKey(str)) {
//                dict2.put(str, 0);
//            }
//        }
        for (String str2 : wordsList2) {
            if (dict2.containsKey(str2)) {
                dict2.put(str2, 1 + dict2.get(str2));
            } else {
                dict2.put(str2, 1);
            }
            if (!dict1.containsKey(str2)) {
                dict1.put(str2, 0);
            }
        }

        System.out.println(dict1);
        System.out.println(dict2);
    }
}
