/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corenlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

/**
 *
 * @author User
 */
public class SentimentAnalysis {
    public static void main(String[] args) {
        
        StanfordCoreNLP stanfordCoreNLP = PipeLine.getPipeLine();
        
        String text = "Hello this is John. I don't like this place.";
        
        CoreDocument coreDocument = new CoreDocument(text);
        
        stanfordCoreNLP.annotate(coreDocument);
        
        List<CoreSentence> sentences = coreDocument.sentences();
        
        for (CoreSentence sentence : sentences) {
            
            String sentiment = sentence.sentiment();
            
            System.out.println(sentiment + "\t" + sentence);
        }
    }
}
