/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corenlp;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

/**
 *
 * @author User
 */
public class TokenizeEx {
    
    public static void main(String[] args) {
        
        StanfordCoreNLP stanfordCoreNLP = PipeLine.getPipeLine();
        
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        
        CoreDocument coreDocument = new CoreDocument(text);
        
        stanfordCoreNLP.annotate(coreDocument);
        
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        
        for (CoreLabel coreLabel : coreLabelList) {
            System.out.println(coreLabel.originalText());
        }
    }
}
