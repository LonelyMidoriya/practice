import inside_entities.HuffManTree;

import java.io.IOException;

/**
 * Написать программу, осуществляющую сжатие английского текста.
 * Построить для каждого слова в тексте оптимальный префиксный код по
 * алгоритму Хаффмена. Использовать класс PriorityQueue.
 */
public class HuffManTextCompression {

    public static void main(String[] args) {
        /**
         * Прописан путь к файлу
         */
        HuffManTree huffManTree = new HuffManTree("E:\\Java Projects\\Collections_B1\\src\\resources\\textSmall.txt");

        try {
            huffManTree.createTree();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("Huffman code: %s",  huffManTree.getTextCode()));
        System.out.println();
        System.out.println(String.format("Huffman decode: %s", huffManTree.decode(huffManTree.getTextCode())));

    }
}
