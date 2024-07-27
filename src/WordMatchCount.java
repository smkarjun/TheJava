import java.util.HashMap;

public class WordMatchCount {

    public static void main(String ar[]) {

        String words[]= {"cat","bt","hat","tree"};

        String chars="atach";

       int count= countCharacters(words,chars);
       System.out.println(count);
    }

    public static int getCharFrequency(String word, String ch) {
        int chFreq = 0;
        for (int n = 0; n < word.length(); n++) {
            if (String.valueOf(word.charAt(n)).equals(ch)) {
                chFreq++;
            }
        }
        return chFreq;
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            int ch = (int) (chars.charAt(i));
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int chFreq = getCharFrequency(words[i], String.valueOf(words[i].charAt(j)));
                int ch = (int) (words[i].charAt(j));
                if (!map.containsKey(ch)) {
                    break;
                } else if (map.get(ch) < chFreq) {
                    break;
                } else if (j == words[i].length() - 1) {
                    count += words[i].length();
                }
            }
        }

        return count;
    }
}
