import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {
        String[] rows = new String[] {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> wordsInSameRow = new ArrayList<>();

        word:
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            String firstLetter = lowerCaseWord.substring(0, 1);
            int row = rows[0].contains(firstLetter) ? 0 :
                    rows[1].contains(firstLetter) ? 1 : 2;

            for (int i = 1; i < word.length(); i++) {
                String letter = lowerCaseWord.substring(i, i+1);
                if (!rows[row].contains(letter)) continue word;
            }
            wordsInSameRow.add(word);

        }
        return wordsInSameRow.toArray(new String[0]);
    }
}