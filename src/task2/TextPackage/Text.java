/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.TextPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author serg
 */
public class Text {

    private ArrayList content = new ArrayList();

    public void addSentance(Sentance sentance) {
        content.add(sentance);
    }

    public void sort(Comparator c){
        quickSort(0,content.size()-1,c);
    }

    private void quickSort(int l,int r, Comparator c){
        int mid=(l+r)/2;
        int i=l;
        int j=r;
        Object temp;
        while(i<=j){
            while(c.compare(content.get(i), content.get(mid))<0)
                i++;
            while(c.compare(content.get(j), content.get(mid))>0)
                j--;
            if(i<=j){
                temp=content.get(i);
                content.set(i, content.get(j));
                content.set(j, temp);
                i++;
                j--;
            }  
        }
        if(j>l)
            quickSort(l,j,c);
        if(i<r)
            quickSort(i,r,c);
    }

    @Override
    public String toString(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<content.size();i++){
            s.append(content.get(i).toString());
            s.append("\n");
        }
        return s.toString();
    }

    public void writeToFile(String file) throws IOException{
        BufferedWriter br=new BufferedWriter(new FileWriter(file));
        br.write(this.toString());
        br.close();
    }
}
