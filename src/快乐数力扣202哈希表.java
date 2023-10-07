import java.util.HashSet;
import java.util.Set;

public class 快乐数力扣202哈希表 {
    public static void main(String[] args){
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n){
        Set<Integer> s = new HashSet<>();
        while(n!=1){
            n = getNextNumber(n);
            if(s.contains(n)) return false;
            s.add(n);
        }
        return true;
    }

    //计算个位数平方和
    public static int getNextNumber(int n){
        int result = 0;
        while(n>0){
            int temp = n % 10;
            result += temp * temp;
            n /= 10;
        }
        return result;
    }
}

//    编写一个算法来判断一个数 n 是不是快乐数。
//
//        「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
//        然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
//
//        如果 n 是快乐数就返回 True ；不是，则返回 False 。