package basic;

public class pattern {
    public static void main(String[] args) {
        trianglePattern(4,false);
        doubleTrianglePattern(4);
        doubleSquareNoPattern1(4);
        doubleSquareNoPattern(4);
        doubleSquarePattern(4);
        pattern1(4);
    }

    private static void pattern1(int size) {
        int originSize = size+1;
        size = 2*size;
        for (int row = 1; row <size; row++) {
            for (int col = 1; col <size; col++) {
                int atEveryIndex = originSize- Math.min(Math.min(row,col), Math.min(size-row,size-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    private static void doubleSquareNoPattern(int size) {
        for (int row = 1; row <= size;row++)
        {
            for (int s = 0;s< size - row;s++)
            {
                System.out.print("  ");
            }
            for (int col = row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for (int col = 2;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void doubleSquareNoPattern1(int size) {
        for (int row = 1; row <= 2*size;row++)
        {
            int totalColsInRow = row>size ? 2*size-row:row;
            int space = size - totalColsInRow;
            for (int s = 0;s< space;s++)
            {
                System.out.print("  ");
            }
            for (int col = totalColsInRow;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for (int col = 2;col<=totalColsInRow;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    private static void doubleSquarePattern(int size) {
        for (int row = 1; row <= 2*size;row++)
        {
            int totalColsInRow = row>size ? 2*size-row:row;
            int space = size - totalColsInRow;
            for (int s = 1;s<=space;s++)
            {
                System.out.print(" ");
            }
            for (int col = 1;col<=totalColsInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void doubleTrianglePattern(int size) {
        for (int row = 1; row < 2*size;row++)
        {
            int totalColsInRow = row>size ? 2 * size-row:row;
            for (int col = 0;col<totalColsInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void trianglePattern(int size,boolean reversed) {
        if(!reversed)
        {
            for (int i  = 1 ; i<=size; i++)
            {
                for (int j = 1 ; j<=size-i+1;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        else {
            for (int i  = 1 ; i<=size; i++)
            {
                for (int j = 1 ; j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }

    }
}
