package itmo.java.basics.lab10;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileMetod {

    public static List<String> fileToList(File file) {

        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                list.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return list;
    }

    public static void addStringToFile (File file, String string){

      try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void connectToFiles (File file1, File file2) {
        if (file2.exists()) file2.delete();
        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2, true))) {
            String input;
            while ((input = reader.readLine()) != null) {
                writer.write(input);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void replaceFile (File file){
        File fileTemp = new File("files/textTemp.txt");
            try (BufferedReader reader = new BufferedReader(new FileReader(file));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileTemp))){
                 String input;

                while ((input = reader.readLine()) != null) {
                    writer.write(input.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]","\\$"));
                    writer.newLine();
                    fileTemp.renameTo(file);
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
    }
}