package itmo.java.basics.lab5;

public class Lab5 {
    public static void main(String[] args) {
        // 1.	Написать метод для поиска самого длинного слова в тексте
        String string1 = "Это исходная строка для определления слова с максимальной длиной";
        System.out.println("Самое длинное слово: " + StringCheck.maxWordInString(string1));

        //2.	Написать метод, который проверяет является ли слово палиндромом
       String string2 = "казак";
       System.out.println("Слово: " + string2);
       if (StringCheck.stringIsPalindrom(string2)) System.out.println("Является палиндромом");
       else System.out.println("Не является палиндромом");

        //3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
        String string3 = "Строка для замены слов бяка";
        String stringWhatChange ="бяка";
        String wordToChgange = "[вырезано цензурой]";
        System.out.println(StringCheck.stringCenzura(string3, stringWhatChange, wordToChgange));

        //4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
        String stringOne = "hellohellohello";
        String stringTwo = "hello";
        System.out.println(StringCheck.stringContain(stringOne,stringTwo));

        //5. 	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания,
        // и слова разделены пробелами.
        //Sample Output:
        //The given string is: This is a test string
        //The string reversed word by word is:
        //sihT si a tset gnirts
        String givenString = "This is a test string";
        System.out.println("The given string is: "+givenString);
        System.out.println("The string reversed word by word is: " + StringCheck.rotateWords(givenString));
    }
}
