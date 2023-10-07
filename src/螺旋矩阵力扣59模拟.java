public class 螺旋矩阵力扣59模拟 {
    public static void main(String[] args){
        int[][] arr = new int[3][3];
        arr = generateMatrix(3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n){
        int loop = 0;//定义循环层数
        int start = 0;//定义开始位置
        int[][] result = new int[n][n];//结果数组
        int i,j;
        int count = 1;//定义填充数字
        while(loop++ < n / 2){
            for (j=start;j<n-loop;j++){
                result[start][j] = count++;
            }

            for(i=start;i<n-loop;i++){
                result[i][j] = count++;
            }

            for(;j>=loop;j--){
                result[i][j] = count++;
            }

            for(;i>=loop;i--){
                result[i][j] = count++;
            }
            start++;
        }
        if(n%2==1){
            result[start][start] = count;
        }

        return result;
    }
}
//    给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
//
//        示例:
//
//        输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]