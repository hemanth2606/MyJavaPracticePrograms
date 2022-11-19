package dataStructure;

import java.util.*;

public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 3;
        String s ="abcabbbbcefghijkefgh";
        System.out.println(SumOfSubArray(arr,k));
        System.out.println(lengthOfLongestSubstring(s));
        HashSet<Integer> m = new HashSet<>();
        m.add(34);
        m.add(34);
        m.add(44);
        System.out.println(m);
        HashMap<String,Integer> m1 = new HashMap<>();
        m1.put("1",1);
        m1.put("2",2);
        m1.put("2",3);
        m1.put("3",m1.getOrDefault("3",2)+1);
        System.out.println(m1);
    }

    private static ArrayList<Integer> SumOfSubArray(int[] arr,int key) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = arr.length;
        int start = 0;
        int sum = 0;
        int maxSum = 0;
        for (int end = 0; end < size; end++) {
            sum = sum+arr[end];
            if (end>=key-1)
            {
                arrayList.add(sum);
                maxSum = Math.max(sum,maxSum);
                sum -=arr[start];
                start++;
            }
        }
        System.out.printf("the max length of the %d\n",maxSum);
        return arrayList;
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            }
            else if(map.size() < j - i + 1){
                while(map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }

}
