package run;

import action.Task;
import create.ListCreator;
import java.util.LinkedList;

/*
    1. Ввести строки из файла, записать в список.
    Вывести строки в файл в обратном порядке.
 */

public class Main {
    public static final String path = "data\\file.txt";

    public static void main(String[] args) {
        LinkedList<String> originalList = ListCreator.create(path);
        Task.change(originalList);
    }
}
