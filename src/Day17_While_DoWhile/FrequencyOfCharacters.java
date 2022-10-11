package Day17_While_DoWhile;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="AAABBBC";
        char ch='A';
        int frequency=0;
        for (int i = 0; i <str.length(); i++) {// index of str
            char eachChar=str.charAt(i);

            if (ch == eachChar){//if given char is matching with the eachChar, than char is appeared in the string
               frequency++;
            }
        }
        System.out.println(frequency);
    }
}
