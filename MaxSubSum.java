package maxsubsum;

import java.util.ArrayList;

public class MaxSubSum {

    public static ArrayList maxSubSum1(int[] a) {
        ArrayList<Integer> liste = new ArrayList<>();
        ArrayList<ArrayList> max = new ArrayList<>();
        
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;

                for (int k = i; k <= j; k++) {
                    liste.add(k);
                    thisSum += a[k];
                }
                liste.add(thisSum);
                
                if (thisSum > maxSum) {
                    if(max.isEmpty()) max.add(liste);
                    else {
                        max.remove(0);
                        max.add(liste);
                    }
                    maxSum = thisSum;
                }
            }
        }

        return max.get(0);
    }

    public static void main(String[] args) {
        int dizi[] = {1,2,3,4,5};
        for(Object i : maxSubSum1(dizi)) {
            System.out.println(i.toString());
        }
        
    }

}
