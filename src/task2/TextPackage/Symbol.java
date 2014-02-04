/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.TextPackage;

/**
 *
 * @author serg
 */
public class Symbol {

    private String character;

    public Symbol(String s) {
        character = s;
    }

    public String get() {
        return character;
    }

    @Override
    public String toString(){
        return character;
    }
}
