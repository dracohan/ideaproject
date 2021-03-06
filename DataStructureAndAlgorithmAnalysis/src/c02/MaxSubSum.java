package c02;

/**
 * @project: DataStructureAndAlgorithmAnalysis
 * @filename: MaxSubSum
 * @version: 0.10
 * @author: Jimmy Han
 * @date: 21:35 2015/7/7
 * @comment: 以每一个元素为起点计算往后的和，如果为负，则重新开始计算
 * @result: 10
 */
public class MaxSubSum {
    public static void main(String[] args){
        int[] arr = {-1, 3, 2, -3, -1, 4, 5};
        System.out.println(maxSubSum(arr));
    }

    public static int maxSubSum( int[] a){
        int maxSum = 0, thisSum = 0;

        for(int j = 0; j < a.length; j++){
            thisSum += a[j];

            if(thisSum > maxSum)
                maxSum = thisSum;
            else if(thisSum < 0)
                thisSum = 0;
        }

        return maxSum;
    }
}
