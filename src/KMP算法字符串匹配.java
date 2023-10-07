/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
 * 如果不存在，则返回  -1。
 */

public class KMP算法字符串匹配 {

    //计算前缀数组
    /*
    前缀数组指的是该长度的模式字符串最长相等前缀子串和后缀子串
    前缀字符串指除最后一个字符外以第一个字符开头的连续子串
    后缀字符串指除第一个字符以外以最后一个字符结尾的连续子串
     */
    public void getNext(int[] next, String s){
        int j = -1;
        next[0] = j;
        for (int i = 1;i<s.length();i++){
            while(j>=0 && s.charAt(i)!=s.charAt(j+1)){
                j = next[j];
            }
            if(s.charAt(i)==s.charAt(j+1)){
                j++;
            }
            next[i] = j;
        }
    }

    public int strStr(String haystack, String needle){
        int[] next = new int[needle.length()];
        getNext(next,needle);
        int j = -1;
        for (int i = 0;i < haystack.length();i++){
            while(j>=0 && haystack.charAt(i) != needle.charAt(j+1)){
                j = next[j];
            }
            if(haystack.charAt(i) == needle.charAt(j+1)){
                j++;
            }
            if(j==needle.length()-1){
                return i-needle.length()+1;
            }
        }
        return -1;
    }



}
/**
 * * 基于窗口滑动的算法
 *      * <p>
 *      * 时间复杂度：O(m*n)
 *      * 空间复杂度：O(1)
 *      * 注：n为haystack的长度，m为needle的长度
 *  public int strStr(String haystack, String needle) {
 *         int m = needle.length();
 *         // 当 needle 是空字符串时我们应当返回 0
 *         if (m == 0) {
 *             return 0;
 *         }
 *         int n = haystack.length();
 *         if (n < m) {
 *             return -1;
 *         }
 *         int i = 0;
 *         int j = 0;
 *         while (i < n - m + 1) {
 *             // 找到首字母相等
 *             while (i < n && haystack.charAt(i) != needle.charAt(j)) {
 *                 i++;
 *             }
 *             if (i == n) {// 没有首字母相等的
 *                 return -1;
 *             }
 *             // 遍历后续字符，判断是否相等
 *             i++;
 *             j++;
 *             while (i < n && j < m && haystack.charAt(i) == needle.charAt(j)) {
 *                 i++;
 *                 j++;
 *             }
 *             if (j == m) {// 找到
 *                 return i - j;
 *             } else {// 未找到
 *                 i -= j - 1;
 *                 j = 0;
 *             }
 *         }
 *         return -1;
 *     }
 * }
 */