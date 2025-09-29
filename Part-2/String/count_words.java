package String;
// Test Automation Java Automation
// Count of Characters in a given string : {Java=1, Automation=2, Test=1} 

import java.util.HashMap;

public class count_words {
    public static void Word_count(String str){
        HashMap<String,Integer> word_freq=new HashMap<>();
        for(String i:str.split(" ")){
            if(word_freq.containsKey(i)){
                word_freq.put(i,word_freq.get(i)+1);
            }
            else{
                word_freq.put(i,1);
            }
        }
        System.out.println(word_freq);
    }
    public static void main(String[] args) {
        Word_count("Test Automation Java Automation");
    }
}