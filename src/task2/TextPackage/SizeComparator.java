/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.TextPackage;

import java.util.Comparator;

/**
 *
 * @author serg
 */
public class SizeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (((Sentance) o1).size() < ((Sentance) o2).size()) {
            return -1;
        }
        if (((Sentance) o1).size() > ((Sentance) o2).size()) {
            return 1;
        }
        return 0;
    }
}

