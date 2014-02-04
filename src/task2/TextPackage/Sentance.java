/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.TextPackage;

import java.util.ArrayList;

/**
 *
 * @author serg
 */
public class Sentance {

    private ArrayList content = new ArrayList();
    private int size;

    public void put(Object o) {
        if (o instanceof Word) {
            size++;
        }
        content.add(o);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < content.size(); i++) {
            s.append(content.get(i).toString());
            s.append(" ");
        }
        return s.toString();
    }

    public int size() {
        return size;
    }

    public void clear() {
        content.clear();
    }
}
