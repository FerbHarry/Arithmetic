//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

public class 替换空格 {
    //开新空间
    public static String replaceSpace(String str){
        if(str == null) return null;
        StringBuilder s = new StringBuilder();
        for (int i = 0;i < str.length(); i++){
            if(str.charAt(i) == ' ') s.append("%20");
            else s.append(str.charAt(i));
        }
        return s.toString();
    }
    //双指针法
    /**
     * public String replaceSpace(String s) {
     *     if(s == null || s.length() == 0){
     *         return s;
     *     }
     *     //扩充空间，空格数量2倍
     *     StringBuilder str = new StringBuilder();
     *     for (int i = 0; i < s.length(); i++) {
     *         if(s.charAt(i) == ' '){
     *             str.append("  ");
     *         }
     *     }
     *     //若是没有空格直接返回
     *     if(str.length() == 0){
     *         return s;
     *     }
     *     //有空格情况 定义两个指针
     *     int left = s.length() - 1;//左指针：指向原始字符串最后一个位置
     *     s += str.toString();
     *     int right = s.length()-1;//右指针：指向扩展字符串的最后一个位置
     *     char[] chars = s.toCharArray();
     *     while(left>=0){
     *         if(chars[left] == ' '){
     *             chars[right--] = '0';
     *             chars[right--] = '2';
     *             chars[right] = '%';
     *         }else{
     *             chars[right] = chars[left];
     *         }
     *         left--;
     *         right--;
     *     }
     *     return new String(chars);
     * }
     */
}
