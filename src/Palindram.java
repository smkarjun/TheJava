import java.util.Scanner;

public class Palindram {
    public static void main(String a[]) {
        int num = 233;
        int revNum = checkPalindram(num);

        if (num == revNum) {
            System.out.println("Number is a Palindram");
        } else {
            System.out.println("Number is not a Palindram");
        }

        // Palindram for a string
        String original="";
        //checkPalindramString(original);

        // Palindram for a string by removing specal chars
        String ori= "A man, a plan, a canal: Panama";
        checkPalWithSpecalString(ori);
    }

    private static void checkPalWithSpecalString(String ori) {
        StringBuffer sb=new StringBuffer();
        ori=ori.toLowerCase();
        for(int i=0; i<ori.length();i++){
            char ch=ori.charAt(i);
            if((ch <= 122 && ch >= 97) || (ch <= 90 && ch >= 65 || (ch <= 57 && ch >= 48))){
                sb=sb.append(ch);
            }
        }
        System.out.println("Reveqrse String after rem spl chars:"+ sb);

    }

    static int checkPalindram(int num) {
        int rev = 0, reminder;
       while(num>0){
            reminder = num % 10;
            rev = (rev * 10) + reminder;
            num = num / 10;
        }
        System.out.println(rev);
        return rev;

    }
    static void checkPalindramString(String original){
        String rev = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();

        for(int i=original.length()-1; i>=0; i--){
            rev= rev+ original.charAt(i);
        }
    }
}
