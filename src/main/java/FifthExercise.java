import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 Created by Oleg Sokolovsky
 */

public class FifthExercise {

    public static void main(String[] args) throws FileNotFoundException {

        File newFile = new File("file.txt");

        Scanner sc = new Scanner(newFile);

        String line = sc.nextLine();

        String[] words = line.split(" ");

        List<String> arrays = new ArrayList<>();

        for (String s : words
        ) {
            arrays.add(s);
        }

        Collections.sort(arrays);

        System.out.println("Сортировка по алфавиту: ");
        System.out.println(arrays);

        HashMap<String, Integer> wordsCount = new HashMap<>();
        System.out.println("Количество повторений для каждого слова: ");

        for (String word: arrays
             ) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 0);
            }
            wordsCount.put(word, wordsCount.get(word) + 1);
        }
        for (String word: wordsCount.keySet()
             ) {
            System.out.println(word + " встречаетс раз'а: " + wordsCount.get(word));
        }



        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry: wordsCount.entrySet()
             ) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        System.out.println("Больше всего повторений: " + maxEntry);

         sc.close();
        }
    }

