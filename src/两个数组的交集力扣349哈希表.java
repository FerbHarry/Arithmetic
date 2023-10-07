import java.util.HashSet;
import java.util.Set;

public class 两个数组的交集力扣349哈希表 {
    public static int[] intersection(int[] a, int[] b){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i<a.length; i++){
            set1.add(a[i]);
        }

        for (int i: b) {
            if(set1.contains(i)) set2.add(i);
        }

        return set2.stream().mapToInt(x -> x).toArray();
    }
}
//题意：给定两个数组，编写一个函数来计算它们的交集。