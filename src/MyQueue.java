import java.util.Stack;

/**
 * 用栈实现队列
 */


public class MyQueue{
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue(){
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int i){
        input.push(i);
    }

    public int pop(){
        dumpStackIn();
        return output.pop();
    }

    public int peek(){
        dumpStackIn();
        return  output.peek();
    }

    public boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

    private void dumpStackIn(){
        if(!output.isEmpty()) return;
        while(!input.isEmpty()){
            output.push(input.pop());
        }
    }
}
