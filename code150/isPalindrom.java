package code150;

public class isPalindrom {
    public static void main(String[] args) {
        isPalindrom pp=new isPalindrom();

        System.out.println( pp.isPalindrome("ilyyli"));
    }
    public static Boolean checkPalindrom(String s){
        int left=0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                    return false;   
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)||Character.isDigit(ch)){
                sb.append(ch);
            }
        }
            String r=sb.toString();
            r=r.toLowerCase();
            if(checkPalindrom(r)){
                return true;
            }
            return false;
    }
}

