package itmo.java.basics.lab10;
import java.io.File;


public class Lab10 {
    public static void main(String[] args) {

//      1.	Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
        File file = new File("files/text.txt");
//        for (String str: FileMetod.fileToList(file)){
//            System.out.println(str);
//        };
//      2.	Написать метод, который записывает в файл строку, переданную параметром.
        String addString = "Добавляем строку";
        FileMetod.addStringToFile(file, addString);
        for (String str: FileMetod.fileToList(file)) {
            System.out.println(str);
        }
//      3.	Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.
        File file2 = new File("files/text2.txt");
        FileMetod.connectToFiles(file,file2);
//        4.	Написать метод который заменяет в файле все кроме букв и цифр на знак ‘$’
        FileMetod.replaceFile(file);
    }
}
