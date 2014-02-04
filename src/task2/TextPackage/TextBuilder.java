/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.TextPackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/*
 * @author serg
 */

public class TextBuilder {

    private Text text;

    public TextBuilder(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(file));
        Sentance sent = new Sentance();
        StringBuilder s = new StringBuilder();
        text = new Text();
        while (sc.hasNext()) {
            s.append(sc.next());
            if (s.toString().equals("//") || s.toString().equals("/*") || s.toString().equals("*/")
                    || s.toString().equals("&&") || s.toString().equals("||") || s.toString().equals("(")
                    || s.toString().equals(")") || s.toString().equals(";") || s.toString().equals("=")
                    || s.toString().equals("==") || s.toString().equals("*=") || s.toString().equals("-=")
                    || s.toString().equals("+=") || s.toString().equals("*") || s.toString().equals("+")
                    || s.toString().equals("-") || s.toString().equals("/") || s.toString().equals("++")
                    || s.toString().equals("--") || s.toString().equals("\"") || s.toString().equals("'")) {
                sent.put(new Symbol(s.toString()));
            } else {
                if (s.toString().equals(".")) {
                    sent.put(new Symbol(s.toString()));
                    text.addSentance(sent);
                    sent=new Sentance();
                } else {
                    if (s.toString().substring(s.toString().length() - 1).equals(".")) {
                        sent.put(new Word(s.toString().substring(0, s.toString().length() - 1)));
                        sent.put(new Symbol(s.toString().substring(s.toString().length() - 1)));
                        text.addSentance(sent);
                        sent=new Sentance();
                    } else {
                        sent.put(new Word(s.toString()));
                    }
                }

            }
        s.delete(0, s.length());
        }
     sc.close();
    }

    public Text getText() {
        return text;
    }
}
