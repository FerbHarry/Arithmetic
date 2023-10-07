import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 */

class WindowMyQueue{

    Deque<Integer> deque = new LinkedList<>();

    public void poll(int val){
        if(!deque.isEmpty() && val == deque.peek()){
            deque.poll();
        }
    }

    public void add(int val){
        while(!deque.isEmpty() && val > deque.getLast()){
            deque.removeLast();
        }
        deque.add(val);
    }

    public int peek(){
        return deque.peek();
    }

}

public class 滑动窗口最大值力扣239栈 {
    public int[] maxSlidingWindow(int[] nums, int k){
        if(nums.length == 1) return nums;
        WindowMyQueue windowMyQueue = new WindowMyQueue();
        int len = nums.length - k + 1;
        int[] result = new int[len];
        for (int i = 0;i<k;i++){
            windowMyQueue.add(nums[i]);
        }
        int num = 0;
        result[num++] = windowMyQueue.peek();
        for (int i = k;i< nums.length;i++){
            windowMyQueue.poll(nums[i-k]);//每次都要弹出，因为取得的是长度为k的滑动窗口中的最大值
            windowMyQueue.add(nums[i]);
            result[num++] = windowMyQueue.peek();
        }
        return result;
    }
}
