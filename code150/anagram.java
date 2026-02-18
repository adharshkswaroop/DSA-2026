package code150;
import java.util.*;
public class anagram {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    anagram ag=new anagram();
    System.out.println("Result: "+ag.isAnagram(s,t));

   }
   public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                count[ch-'A']++;
            }else{
                count[ch-'a']++;
            }
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(Character.isUpperCase(ch)){
                count[ch-'A']--;
            }else{
                count[ch-'a']--;
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0){
                return false;
            }
        }
        return true;
    }
}
