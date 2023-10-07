/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
//先局部反转再整体反转
public class 左旋转字符串 {

    public static void main(String[] args){
        String s = "abcdefg";
        int n = 2;
        String result = reverseLeftWords(s,n);
        System.out.println(result);
    }

    public static String reverseLeftWords(String s, int n){
        char[] ch = s.toCharArray();
        reverse(ch,0,n-1);
        reverse(ch,n,ch.length-1);
        reverse(ch,0, ch.length-1);
        return new String(ch);
    }

    public static void reverse(char[] ch, int start, int end){
        while(start<end){
            ch[start] ^= ch[end];
            ch[end] ^= ch[start];
            ch[start] ^= ch[end];
            start++;
            end--;
        }
    }
}
