
/*
编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 */

/*知识补充
a^=b等价于a = a^b，其中^是位异或运算，即将a与b的对应位进行异或运算，同为0或者同为1时，对应位结果为0；否则为1。
假设，a的值为二进制的1010，b的值为二进制的1100，那么a^b = 0110
 */
//Java有丰富的函数库但涉及关键点的建议自己编写要知道原理

public class 反转字符串力扣344字符串 {

    public static void main(String[] args){
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        char[] result = reverseString(ch);
        for (int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }

    public static char[] reverseString(char[] ch){
        int left = 0;
        int right = ch.length-1;
        while(left<right){
            ch[left]^=ch[right];
            ch[right]^=ch[left];
            ch[left]^=ch[right];
            left++;
            right--;
        }

        return ch;
    }
}
