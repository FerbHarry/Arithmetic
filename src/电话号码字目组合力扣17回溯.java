import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母
 */


public class 电话号码字目组合力扣17回溯 {

    public String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public StringBuilder temp = new StringBuilder();
    public List<String> result = new ArrayList<>();

    public void backTracking(String str, int num){
        if(num == str.length()){
            result.add(temp.toString());
            return;
        }

        String ns = numString[str.charAt(num) - '0'];
        for (int i=0;i<ns.length();i++){
            temp.append(ns.charAt(i));
            backTracking(str,num+1);
            temp.deleteCharAt(temp.length()-1);
        }



    }

}
