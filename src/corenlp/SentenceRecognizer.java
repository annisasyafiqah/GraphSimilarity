/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corenlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.List;

/**
 *
 * @author User
 */
public class SentenceRecognizer {

    public static void main(String[] args) {

        StanfordCoreNLP stanfordCoreNLP = PipeLine.getPipeLine();

        String text = "Lorem Ipsum is simply dummy text. Lorem Ipsum of the printing and typesetting industry.";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence : sentences) {
            System.out.println(sentence.toString());
        }
    }
}
