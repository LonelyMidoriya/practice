package create;

import read.InfoReader;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListCreator {
    //public static final String REGEX_SENTENCE = "(?:[^!?.]|\\.(?=\\d))+[!?.]";

    public static LinkedList<String> create(String path) {
        LinkedList<String> strings = InfoReader.read(path);
//        StringBuilder text = new StringBuilder();
//        for (String string: strings) {
//            text.append(string);
//        }
//
//        LinkedList<String> list = new LinkedList<>();
//
//        Pattern p = Pattern.compile(REGEX_SENTENCE);
//        Matcher m = p.matcher(text);
//
//        while (m.find()) {
//            list.add(m.group().replaceAll("\\s+", " ").trim());
//        }

        //return list;
        return strings;
    }
}
