import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 */
//回溯的经典模板

public class 组合总和Ⅲ力扣216回溯 {
    public List<List<Integer>> result = new ArrayList<>();//存放可能的组合集——结果
    public LinkedList<Integer> path = new LinkedList<>();//存放可能的组合

    public void combinationSum3(int k, int sum, int target, int startIndex){
        if(sum>target) return;
        if(path.size() == k){
            if(sum == target) {
                result.add(path);
            }
            return;
        }

        for(int i=startIndex;i<=9;i++){
            path.add(i);
            combinationSum3(k,sum+i,target,i+1);
            path.removeLast();//回溯
        }

    }

}
