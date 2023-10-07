import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
//分析：括号匹配一般用栈，Deque类 继承了Stack 和Queue类可以实现队列和栈，需要用栈的情况就可以用Deque代替
//该问题总共有三种错误情况
    //1.左括号和右括号不配套
    //2.字符串还有但是栈已经空了
    //3.字符串已经遍历完璧，但是栈并未空

public class 有效的括号力扣20栈 {
    public boolean isValid(String s){
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            //如果是左括号就推入相应右括号
            if(ch == '(') {deque.push(')');}
            else if (ch == '[') {deque.push(']');}
            else if (ch == '{') {deque.push('}');}
            //如果是右括号就判断栈顶有没有相应右括号有就弹出没有就返回false
            else if (ch != deque.peek() || deque.isEmpty()) {return false;}//没有
            else {deque.pop();}//有
        }
        //第三种情况返回栈是不是还是空
        return deque.isEmpty();
    }
}
