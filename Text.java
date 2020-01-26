/*
 1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
  - Найти список слов, из которых состоит текст (дубликаты не считать);
  - Посчитать сколько раз встречается каждое слово (использовать HashMap);
*/

import java.util.*;

public class Text {
    private static String t = "ночью ночью лил дождь дождь дождь Небо, Словно словно под тяжестью воды, надавило на промокший город. ночью Дома, точно раскрашенный акварелью неумелой рукой школьника, имели унылый, больной вид. Сквозь желтенькие дождь и серенькие стены проступала стены сырость";
    private static int count = 0;
    private static int c = 0;

    public static void main(String[] args) {
        textToArr(t);
        wordList(t);
        numberOfWord(t);
    }

    public static void textToArr(String t) {
        t = t.replaceAll("[,.]", "");
        String[] arr = t.split(" ");
        ArrayList<String> textArray = new ArrayList<>(Arrays.asList(arr));
        int size = textArray.size();
        System.out.println(size + " " + textArray);
    }

    public static void wordList(String t) {
        String lowerT = t.toLowerCase();
        lowerT = lowerT.replaceAll("[,.]", "");
        String[] arr = lowerT.split(" ");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        String[] result = set.toArray(new String[set.size()]);
        int s = set.size();
        set.equals(2);
        System.out.println(s + " " + set);
    }

    public static void numberOfWord(String t) {
        String lowerT = t.toLowerCase();
        lowerT = lowerT.replaceAll("[,.]", "");
        String[] arr = lowerT.split(" ");
        ArrayList<String> Array = new ArrayList<>(Arrays.asList(arr));
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], count);
        }
        for (int i = 0; i < Array.size(); i++) {
            String tempWord = Array.get(i);

            if (!hm.containsKey(tempWord)) {
                hm.put(tempWord, 1);
            } else {
                hm.put(tempWord, hm.get(tempWord) + 1);
            }
        }
        for (Map.Entry<String, Integer> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
}
