package read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class InfoReader {
    public static LinkedList<String> read(String path){
        if (path == null) {
            throw new RuntimeException("File name can't be null");
        }

        File file = new File(path);
        LinkedList<String> strings = new LinkedList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                strings.add(scanner.nextLine());
            }
            return strings;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        }
    }
}
