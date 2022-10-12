package Day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str="Java Java Phyton Phyton";
        int frequency=0;

        while (str. contains("Java")){
            str=str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);
        System.out.println("---------------------");

        String sentence="cat cat dog dog dog cat cat cat cat";
        int countCat=0;
        sentence=sentence.toLowerCase();

        while (sentence.contains("cat")){
            sentence=sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);

        System.out.println("-----------------------");

        String s="Java Java Java Phyton Phyton";
        int countJava=0;
        int countPhyton=0;

        while (s.contains("Java") || s.contains("Phyton")){

            if (s.contains("Java")) {
                s = s.replaceFirst("Java", "");
                countJava++;
            }
            if (s.contains("Phyton")){
                s=s.replaceFirst("Phyton", "");
                countPhyton++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);
    }
}
