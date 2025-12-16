public class RansomNote {
    public static boolean ransomeNote(String ransom, String magazine){
        int[] array = new int[26];
        for(char ch : magazine.toCharArray()){
            array[ch - 'a']++;
        }
        for(char ch : ransom.toCharArray()){
           
            if(array[ch - 'a'] == 0){
                return false;
            }
            array[ch - 'a']--;
        }
        return true;

    }
    public static void main(String[] args){
        String ransom = "aassfg";
        String magazine = "aabcdssjifhg";
        System.out.println(ransomeNote(ransom, magazine));
    }
}
