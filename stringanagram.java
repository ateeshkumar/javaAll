public class stringanagram {
    public static void main(String[] args) {
        String word = "KUMAR";
        String anagram = "aeetshku";
        System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingStringMethods(word, anagram));
 
    }
 
    public static boolean isAnagramUsingStringMethods(String word, String anagram) {
        if (word.length() != anagram.length())
            return false;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int index = anagram.indexOf(c);
                if (index != -1) {
                    anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
                } else
                    return false;
            }
            return anagram.isEmpty();
    }
    
}
