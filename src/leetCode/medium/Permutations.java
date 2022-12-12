package leetCode.medium;

///question///////
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.


//        Example 1:
//
//        Input: nums = [1,2,3]
//        Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//        Example 2:
//
//        Input: nums = [0,1]
//        Output: [[0,1],[1,0]]
//        Example 3:
//
//        Input: nums = [1]
//        Output: [[1]]
//
//
//        Constraints:
//
//        1 <= nums.length <= 6
//        -10 <= nums[i] <= 10
//        All the integers of nums are unique.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[]arr ={0,-1,1};
        System.out.println(permute(arr));
    }

    //only works for positive input/////
//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> list = new ArrayList<List<Integer>>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < nums.length; i++) {
//            sb.append(nums[i]);
//        }
//        ArrayList<String> ans = new ArrayList<String>(permute_com("",sb.toString()));
//        System.out.println(ans);
//        for (int i = 0; i < ans.size(); i++) {
//            ArrayList<Integer> res = new ArrayList<>();
//            int size = ans.get(0).length();
//            for (int j = 0; j <size ; j++) {
//                int c = ans.get(i).charAt(j)-'0';
//                res.add(c);
//            }
//            list.add(res);
//        }
//        return list;
//
//    }
//    public static ArrayList<String> permute_com(String p,String un) {
//
//        if (un.isEmpty())
//        {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> ans = new ArrayList<>();
//        char c = un.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0,i);
//            String b  = p.substring(i,p.length());
//           ans.addAll(permute_com(f+c+b,un.substring(1)));
//        }
//        return ans;
//    }
//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res=new ArrayList<List<Integer>>();
//        permuteHelper(nums,0,res);
//        return res;
//    }
//    public static void permuteHelper(int[] nums,int level,List<List<Integer>>res){
//        if(level==nums.length){
//            List<Integer> add=new ArrayList<Integer>();
//            for(int i=0;i<nums.length;i++){
//                add.add(nums[i]);
//            }
//            res.add(add);
//        }
//        for(int i=level;i<nums.length;i++){
//            swap(nums,i,level);
//            permuteHelper(nums,level+1,res);
//            swap(nums,i,level);
//        }
//    }
//
//    public static void swap(int[]nums,int i,int j){
//        int temp=nums[i];
//        nums[i]=nums[j];
//        nums[j]=temp;
//    }
        public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermutation(nums,ds,ans,freq);
        return ans;

    }

    private static void recurPermutation(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size()== nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                recurPermutation(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }

        }

    }

}
