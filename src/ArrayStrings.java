// given two arrays of strings , find out  they are equal strings

public class ArrayStrings {

    public static void main(String a[]) {

        String [] word1 = {"ab", "c"};
        String []word2 = {"a", "bc"};
        boolean isea=arrayStringsAreEqual(word1,word2);
        System.out.println(isea);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arryOne="";
        String arrytwo="";
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for (String s : word1){
            sb=sb.append(s);
            arryOne=sb.toString();
        }
        for (String s2 : word2){
            sb2=sb2.append(s2);
            arrytwo=sb2.toString();
        }
        return arryOne.equals(arrytwo);
    }
}
