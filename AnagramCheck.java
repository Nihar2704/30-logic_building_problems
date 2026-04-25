import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    static String checkAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.length() != str2.length()){
            return "Please provide strings of same length";
        }
        char [] str_first = str1.toCharArray();
        Arrays.sort(str_first);
        char [] str_second = str2.toCharArray();
        Arrays.sort(str_second);

        for (int i = 0; i < str_first.length; i++) {
            if(str_first[i] != str_second[i]){
                return "Both Strings are not Anagrams";
            }
        }
        return "Both Strings are Anagrams";

    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = var.next();
        System.out.println("Enter second string:");
        String str2 = var.next();
        String result = checkAnagram(str1,str2);
        System.out.println(result);
        }
    }

