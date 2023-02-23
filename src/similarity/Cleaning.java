/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Cleaning {

    String[] stopWords = {"a", "able", "about",
        "across", "after", "all", "almost", "also", "am", "among", "an",
        "and", "any", "are", "as", "at", "b", "be", "because", "been",
        "but", "by", "c", "can", "cannot", "could", "d", "dear", "did",
        "do", "does", "e", "either", "else", "ever", "every", "f", "for",
        "from", "g", "get", "got", "h", "had", "has", "have", "he", "her",
        "hers", "him", "his", "how", "however", "i", "if", "in", "into",
        "is", "it", "its", "j", "just", "k", "l", "least", "let", "like",
        "likely", "m", "may", "me", "might", "most", "must", "my",
        "neither", "n", "no", "nor", "not", "o", "of", "off", "often",
        "on", "only", "or", "other", "our", "own", "p", "q", "r", "rather",
        "s", "said", "say", "says", "she", "should", "since", "so", "some",
        "t", "than", "that", "the", "their", "them", "then", "there",
        "these", "they", "this", "tis", "to", "too", "twas", "u", "us",
        "v", "w", "wants", "was", "we", "were", "what", "when", "where",
        "which", "while", "who", "whom", "why", "will", "with", "would",
        "x", "y", "yet", "you", "your", "z"};

    public ArrayList<String> Cleaning(String Text) {
        ArrayList<String> wordsList = new ArrayList<>();

        //menghilangkan semua simbol yang ada
        String text = Text.replaceAll("[^a-zA-Z0-9]", " ");
        //memotong String kalimat menjadi kata
        String[] Words = text.split("\\s+");
        //Stemming    
        for (int i = 0; i < Words.length; i++) {

            if (Words[i].startsWith("re")) {
                Words[i] = Words[i].substring(2, Words[i].length());
            }
            if (Words[i].endsWith("ed")) {
                Words[i] = Words[i].substring(0, Words[i].length() - 2);
            }
            if (Words[i].endsWith("ing")) {
                Words[i] = Words[i].substring(0, Words[i].length() - 3);
            }
            if (Words[i].endsWith("ly")) {
                Words[i] = Words[i].substring(0, Words[i].length() - 2);
            }
            if (Words[i].endsWith("less")) {
                Words[i] = Words[i].substring(0, Words[i].length() - 4);
            }
            if (Words[i].endsWith("ness")) {
                Words[i] = Words[i].substring(0, Words[i].length() - 4);
            }
        }

        for (String words : Words) {
            wordsList.add(words);
        }

        //menghilangkan kata yang kurang penting
        for (int i = 0; i < stopWords.length; i++) {
            for (int j = 0; j < wordsList.size(); j++) {
                if (stopWords[i].contains(wordsList.get(j))) {
                    wordsList.remove(j);
                }
            }
        }

        return wordsList;
    }

}
//
//
//class run {
//
//    public static void main(String[] args) {
//
//        ArrayList<String> wordsList1 = new ArrayList<>();
//        ArrayList<String> wordsList2 = new ArrayList<>();
//
//        String kata1 = "what is actually important? is it our task or what ended before hopeless";
//        String kata2 = "what is nicely important? is that my study or what ended After forgiveness";
//
//        Tokenisasi tk = new Tokenisasi();
//        wordsList1 = tk.tahap(kata1);
//        wordsList2 = tk.tahap(kata2);
//
//        System.out.println(wordsList1);
//        System.out.println(wordsList2);
//
//    }
//}
