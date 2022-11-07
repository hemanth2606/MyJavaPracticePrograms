package basic;

public class recursion {
    public static void main(String[] args) {
        //message(4);
//        int ans = fibo(4);
//        System.out.println(ans);
//        int[] arr = {1,3,4,5,6,7,8,9,10};
//       int binaryAns =  binarySearch(arr,3,0,arr.length);
//        System.out.println(binaryAns);
//        HashMap<Integer,Integer> map = new HashMap<>();
//        map.put(1,2);
//        map.getOrDefault(3,4);
//        System.out.println(map.size());
        System.out.println(fibo(10));
            System.out.println(fibFormula(10));

    }

    private static int fibo(int size) {
        if(size<2){
            return size;
        }
        return fibo(size-1) + fibo(size-2);
    }

    private static void message(int size) {
        if(size==0)
        {
            return;
        }
        //tail basic.dataStructure.recursion
        //last func call
        message(size-1);
        System.out.println(size);
    }
    static int binarySearch(int[] arr,int target,int s ,int e)
    {
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if (target < arr[m]){
            return binarySearch(arr,target,s,m-1);
        }
        else{
            return binarySearch(arr,target,m+1,e);
        }
    }
    static long fibFormula(int n){
      return (long) ((Math.pow(((1+ Math.sqrt(5))/2),n)- Math.pow(((1- Math.sqrt(5))/2),n))/ Math.sqrt(5));
    }

}
