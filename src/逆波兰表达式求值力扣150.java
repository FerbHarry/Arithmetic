import java.util.Deque;
import java.util.LinkedList;

/**
 * 根据 逆波兰表示法，求表达式的值。
 * 有效的运算符包括 + ,  - ,  * ,  / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * 说明：
 * 整数除法只保留整数部分。 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 示例 1：
 * 输入: ["2", "1", "+", "3", " * "]
 * 输出: 9
 * 解释: 该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 */
//后缀表达式,注意减法和除法，equals最好，设定的标准在前

public class 逆波兰表达式求值力扣150 {
    public int evalRPN(String[] tokens){
        Deque<Integer> deque = new LinkedList<>();
        for (String s:tokens) {
            if("+".equals(s)){deque.push(deque.pop() + deque.pop());}
            else if ("-".equals(s)) {deque.push(-deque.pop() + deque.pop());}
            else if ("*".equals(s)) {deque.push(deque.pop() * deque.pop());}
            else if ("/".equals(s)) {
                int temp1 = deque.pop();
                int temp2 = deque.pop();
                deque.push(temp2/temp1);
            } else{
                deque.push(Integer.valueOf(s));
            }
        }
        return deque.pop();
    }
}
