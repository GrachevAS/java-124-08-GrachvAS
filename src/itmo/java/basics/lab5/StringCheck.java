package itmo.java.basics.lab5;

import java.io.StringReader;

public class StringCheck {
    public static String maxWordInString (String string){
        String [] word = string.split(" ");
        String maxWord = "";
        for(int i = 0; i < word.length; i++){
            if(word[i].length() >= maxWord.length()){
                maxWord = word[i];
            }
        }
        return maxWord;
    }
    public static boolean stringIsPalindrom (String string){
        StringBuilder tempString = new StringBuilder();
        tempString.append(string);
        tempString.reverse();

        if (string.equals(tempString.toString())) return true;
        else return false;
    }
    public static String stringCenzura (String string, String whatChange, String changeWord){
        String newString ="";
        newString = string.replaceAll(whatChange,changeWord);
        return newString;
    }
    public static int stringContain (String string1, String string2){
        int lengthString = string1.length();
        string1 = string1.replaceAll(string2,"");
        return (lengthString - string1.length())/string2.length();
    }
    public static String rotateWords (String string){
        String finishStrig = "";
        StringBuilder finishStringBilder = new StringBuilder();
        StringBuilder tempString = new StringBuilder();
        String [] stringArray = string.split(" ");
        for (String str: stringArray){
            tempString.append(str);
            tempString.reverse();
            finishStringBilder.append(tempString + " ");
            tempString.delete(0, string.length());
        }
        return finishStringBilder.toString();
    }
}
