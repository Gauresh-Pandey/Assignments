package AnagramCheck;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_Check {
    public static boolean areAnagram(String Str1, String Str2){
        char[] arr1 = Str1.toLowerCase().toCharArray();
        char[] arr2 = Str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Str1.length() != Str2.length()) {
            return false;
        }
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first String");
        String Str1 = s.nextLine();
        System.out.println("Enter Second String");
        String Str2 = s.nextLine();
        System.out.println(areAnagram(Str1,Str2));
    }
}
