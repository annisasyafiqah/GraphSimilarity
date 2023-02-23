/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corenlp;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class POSExample {
    
    public Map<Integer, Map<String,String>> jenisKata(String text) {
        
        StanfordCoreNLP stanfordCoreNLP = PipeLine.getPipeLine();
        
        CoreDocument coreDocument = new CoreDocument(text);
        
        stanfordCoreNLP.annotate(coreDocument);
        
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        Map<String, String> dict = new HashMap<>();
        Map<Integer, Map<String, String>> dict2 = new HashMap<>();
        
        for (CoreLabel coreLabel : coreLabelList) {
            String pos = coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);
            System.out.println(coreLabel.originalText() + " = " + pos);
            dict.put(coreLabel.originalText(), pos);
        }
        for (int i = 0; i < dict2.size(); i++) {
        dict2.put(i,dict2.get(i));
        }
        return dict2;
    }
}
