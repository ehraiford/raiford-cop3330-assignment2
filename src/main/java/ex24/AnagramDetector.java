package ex24;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){

      int length = findLength(word1, word2);
      if(length == -1)
          return false;
      return areAnagrams (word1, word2, length);
    }

    public boolean areAnagrams (String word1, String word2, int length) {
        //char Arrays instead of string to easily deal with individual characters
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();

        for(int ticker = 0; ticker < length; ticker++) {
            boolean foundLetter = false;
            for(int ticker2 = 0; ticker2 < length; ticker2++) {
                if(arr1[ticker] == arr2[ticker2]){
                    arr2[ticker2] = ' ';
                    foundLetter = true;
                    break;
                }
            }
            if(foundLetter == false)
                return false;
        }
        return true;
    }

    public int findLength(String word1, String word2) {
        int length;
        //confirms strings are the same length. Returns -1 if they aren't.
        if(word1.length() == word2.length()) {
            length = word1.length();
        }else
            length = -1;
        return length;
    }
}
