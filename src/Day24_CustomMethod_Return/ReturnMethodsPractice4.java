package Day24_CustomMethod_Return;

public class ReturnMethodsPractice4 {
    public static void main(String[] args) {
      String str="dddeeebbbaaac";
     str= removeDuplicate(str);
        System.out.println(str);
    }
    //1. create a method that can remove duplicated characters from a string and returns the new value
    public static String removeDuplicate(String str){
        String result="";
        for (int i = 0; i < str.length() ; i++) {
            char each=str.charAt(i);
            if (!result.contains(""+each)){
                result +=each;
            }
        }
        return result;
    }
}
