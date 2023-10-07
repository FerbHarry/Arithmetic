/*
给定一个字符串 s 和一个整数 k，从字符串开头算起, 每计数至 2k 个字符，就反转这 2k 个字符中的前 k 个字符。
如果剩余字符少于 k 个，则将剩余字符全部反转。
如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */
//没什么要点只是模拟

public class 字符串反转Ⅱ力扣541 {
    public static String reverseStr(String str, int k){
        char[] ch = str.toCharArray();
        for (int i = 0;i<ch.length;i+=2*k){//不用加多余的判断使得结果增加2k就可达到题目的要求
            int start = i;
            int end = Math.min(ch.length-1, start+k-1);
            while(start<end){
                ch[start] ^= ch[end];
                ch[end] ^= ch[start];
                ch[start] ^= ch[end];
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
