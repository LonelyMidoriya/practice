package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Task {
    public static LinkedList<String> change(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            newList.add(list.get(i));
        }

        StringBuilder result = new StringBuilder();
        for (String string: newList) {
            result.append(string + '\n');
        }

        String path = ".\\data\\new_file.txt";

        try (PrintWriter printWriter = new PrintWriter(path)) {
            printWriter.println(result);
            System.out.println("Data was written into file " + path);
        } catch (IOException e) {
            throw new RuntimeException("Data wasn't written");
        }

        return newList;
    }
}
