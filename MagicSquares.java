import java.util.*;
public class MagicSquares
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size;
        boolean option = true;
        String getOption;
        {
            System.out.println("\n Enter the size of the magic square (positive & odd): ");
            size = input.nextInt();

            if(size %2 == 0 || size < 0)
            {
                System.out.println("\n The size is invalid!");
            }
            else
            {
                int[][] sizeSquare = new int[size][size];
            }
            
            int[][] sizeSquare = new int[size][size];
            int rowPositive = 0;
            int columnPositive = size / 2;

            sizeSquare[rowPositive][columnPositive] = 1;

            for (int i = 2; i <= size*size; i++)
            {
                if (sizeSquare [(rowPositive + 1) % size] [(columnPositive +1) % size] == 0)
                {
                    rowPositive = (rowPositive + 1) % size;
                    columnPositive = (columnPositive + 1) % size;
                }
                else
                {
                    rowPositive = (rowPositive -1 + size) % size;
                }
                sizeSquare[rowPositive][columnPositive] = i;
            }
            for (int i = 0; i < size; i++)
            {
                for (int x = 0; x < size; x++)
                {
                    if (sizeSquare[i][x] < 10 && sizeSquare[i][x] < 100)
                    System.out.print(" ");
                    else if (sizeSquare[i][x] < 100) System.out.print(" ");
                    System.out.print(sizeSquare[i][x] +" ");
                }
                System.out.println();
            }
            System.out.println("\n The "+ size +" magic sqaures add up to" + (size * (size * size + 1) / 2));
            System.out.println();
            System.out.println("\n Do you want to continue? (Y/N): ");
            getOption = input.next();

            if (getOption.toLowerCase().equals("Y"))
            {
                option = true;
            }
            else
            option = false;
        }
        while(option);
    }
    
}


