/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corenlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import java.util.Properties;

/**
 *
 * @author User
 */
public class PipeLine {

    private static Properties properties;
    private static String propertiesName = "tokenize, ssplit, pos, lemma, depparse";
    private static StanfordCoreNLP stanfordCoreNLP;

    private PipeLine() {

    }

    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
    }

    public static StanfordCoreNLP getPipeLine() {
        if (stanfordCoreNLP == null) {
            stanfordCoreNLP = new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}
