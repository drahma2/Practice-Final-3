/*
 * This source file was generated by the Gradle 'init' task
 */
package practicefinal3;

public class Practice {
   
    public int max_difference(int[] data){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : data){
            if (num < min){
                min = num;
            }

            if (num > max){
                max = num;
            }
        }
        return max - min;
    }
}
