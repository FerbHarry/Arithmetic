/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * 示例 1:
 * 输入: "abab"
 * 输出: True
 * 解释: 可由子字符串 "ab" 重复两次构成。
 *
 * 示例 2:
 * 输入: "aba"
 * 输出: False
 *
 * 示例 3:
 * 输入: "abcabcabcabc"
 * 输出: True
 */

public class 重复的子字符串kmp {
    //求前缀表
    public void getNext(int[] next, String s){
        int j = -1;
        next[0] = j;
        for (int i = 0; i < s.length(); i++){
            while(j>=0 && s.charAt(i) != s.charAt(j+1)){
                j = next[j];
            }
            if(s.charAt(i) == s.charAt(j+1)){
                j++;
            }
            next[i] = j;
        }
    }

    public boolean repeatedSubstringPattern(String s){
        int[] next = new int[s.length()];
        getNext(next,s);
        int len = s.length();
        if (next[len - 1] != -1 && len % (len - (next[len - 1] + 1)) == 0) {
            return true;
        }
        return false;
    }
}
