
/*
给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
判断第一个字符串 ransom 能不能由第二个字符串 magazines 里面的字符构成。如果可以构成，返回 true ；否则返回 false。
(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。
杂志字符串中的每个字符只能在赎金信字符串中使用一次。)
 */
//不能用map来存储因为浪费空间并且map需要创建哈希函数和维护红黑数数据量大就能看出差别
//能用int[]还是使用int
public class 赎金信力扣383哈希表 {
    public static boolean canConstruct(String ransom, String magazine){
        if(magazine.length()<ransom.length()) return false;//检查合理
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()){
            arr[c-'a']++;
        }

        for (char c : ransom.toCharArray()){
            arr[c-'a']--;
            if(arr[c-'a']<0) return false;
        }
        return true;
    }
}
