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
        String StartString ="";
        String EndString ="";
        StringBuilder TempString = new StringBuilder();
        StartString = string.substring(0, string.length() / 2);
        if (string.length()%2==0){
            EndString = string.substring(string.length() / 2, string.length());
        }
        else EndString = string.substring((string.length() / 2)+1, string.length());
        TempString.append(EndString);
        TempString.reverse();
        EndString = TempString.toString();
        if (StartString.equals(EndString)) return true;
        else return false;
    }
    public static String stringCenzura (String string, String changeWord){
        String newString ="";
        newString = string.replaceAll("бяка",changeWord);
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
