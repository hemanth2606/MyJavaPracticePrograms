package dataStructure.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        pathGame("",3,3);
        System.out.println(pathGameArray("",2,5));
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        System.out.println(pathGameDiagonalArray("",3,3));
        System.out.println(pathGameObstraclesArray("",0,0,board));
        System.out.println(pathGameAllPathArray("",0,0,board));
        System.out.println(pathGameAllPathArrayPrint("",0,0,board,path,1));

    }
    static int count(int r, int c){
        if(r==1||c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left + right;
    }
    static void pathGame(String p ,int r,int c)
    {
        if (r==1&&c==1)
        {
            System.out.println(p);
            return;
        }
        if (r>1)
        {
            pathGame(p+'D',r-1,c);

        }
        if (c>1)
        {
            pathGame(p+'R',r,c-1);
        }

    }
    static ArrayList<String> pathGameArray(String p , int r, int c)
    {

        if (r==1&&c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1)
        {
            list.addAll(pathGameArray(p+'D',r-1,c));

        }
        if (c>1)
        {
            list.addAll(pathGameArray(p+'R',r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathGameDiagonalArray(String p , int r, int c)
    {

        if (r==1&&c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r>1)
        {
            list.addAll(pathGameDiagonalArray(p+'V',r-1,c));

        }
        if (r>1&&c>1)
        {
            list.addAll(pathGameDiagonalArray(p+"D",r-1,c-1));
        }
        if (c>1)
        {
            list.addAll(pathGameDiagonalArray(p+'H',r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathGameObstraclesArray(String p , int r, int c,boolean[][] maze)
    {

        if (r==maze.length-1&&c==maze[0].length-1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c])
        {
            return list;
        }
        if (r<maze.length-1)
        {
            list.addAll(pathGameObstraclesArray(p+'V',r+1,c,maze));

        }
        if (c<maze[0].length-1)
        {
            list.addAll(pathGameObstraclesArray(p+'H',r,c+1,maze));
        }


        return list;
    }
    static ArrayList<String> pathGameAllPathArray(String p , int r, int c,boolean[][] maze)
    {

         if (r==maze.length-1&&c==maze[0].length-1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
         ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c])
        {
            return list;
        }
        // i am considering this block in my path
        maze[r][c]=false;
        if (r<maze.length-1)
        {
            list.addAll(pathGameAllPathArray(p+'V',r+1,c,maze));
        }
        if (c<maze[0].length-1)
        {
            list.addAll(pathGameAllPathArray(p+'H',r,c+1,maze));
        }
        if (r>0)
        {
            list.addAll(pathGameAllPathArray(p+'U',r-1,c,maze));
        }
        if (c>0)
        {
            list.addAll(pathGameAllPathArray(p+'L',r,c-1,maze));
        }
        //this line where the function will be over
        // so before the function gets removed , also remove the changes that where made my that function
        maze[r][c] = true;
        return list;
    }
    static ArrayList<String> pathGameAllPathArrayPrint(String p , int r, int c,boolean[][] maze,int[][] path,int step)
    {

        if (r==maze.length-1&&c==maze[0].length-1)
        {
            path[r][c] =step;
            ArrayList<String> list = new ArrayList<>();
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            System.out.println();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!maze[r][c])
        {
            return list;
        }
        // i am considering this block in my path
        maze[r][c]=false;
        path[r][c] =step;
        if (r<maze.length-1)
        {
            list.addAll(pathGameAllPathArrayPrint(p+'V',r+1,c,maze,path,step+1));
        }
        if (c<maze[0].length-1)
        {
            list.addAll(pathGameAllPathArrayPrint(p+'H',r,c+1,maze,path,step+1));
        }
        if (r>0)
        {
            list.addAll(pathGameAllPathArrayPrint(p+'U',r-1,c,maze,path,step+1));
        }
        if (c>0)
        {
            list.addAll(pathGameAllPathArrayPrint(p+'L',r,c-1,maze,path,step+1));
        }
        //this line where the function will be over
        // so before the function gets removed , also remove the changes that where made my that function
        maze[r][c] = true;
        path[r][c] = 0;
        return list;
    }

}
