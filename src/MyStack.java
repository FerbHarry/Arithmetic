import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 */


public class MyStack {
    Queue<Integer> queue;

    public MyStack(){
        queue = new LinkedList<>();
    }

    public void push(int x){
        queue.offer(x);
        int s = queue.size();
        while(s-->0){
            queue.offer(queue.poll());
        }
    }

    public int pop(){
        return queue.poll();
    }

    public int top(){
            return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
