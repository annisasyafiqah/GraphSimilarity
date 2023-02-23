/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package similarity;

import corenlp.POSExample;

/**
 *
 * @author User
 */
public class next {
    public void nextCount(String Doc){
        ToGraph nc = new ToGraph();
        nc.ToGraph(Doc);
        
        POSExample pos = new POSExample();
        pos.jenisKata(Doc);
        
        
    }
}
