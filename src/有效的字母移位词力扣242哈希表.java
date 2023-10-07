public class 有效的字母移位词力扣242哈希表 {
    public static boolean check(String s, String t){
        int[] road = new int[26];
        for (int i = 0;i<s.length();i++){
            road[s.charAt(i)-'a']++;
        }

        for (int i = 0;i<t.length();i++){
            road[t.charAt(i)-'a']--;
        }

        for (int a: road) {
            if(a!=0) return false;
        }

        return true;
    }
}
//    给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//        示例 1: 输入: s = "anagram", t = "nagaram" 输出: true
//        示例 2: 输入: s = "rat", t = "car" 输出: false