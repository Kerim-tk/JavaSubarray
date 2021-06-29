import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int i = 0;
        int [] array = new int [length];
        while(i < length)
        {
            array[i] = input.nextInt();
            i++;
        }
        int con = 1;
        int sum = 0;
        int count = 0;
        for(int l = 0; l < length; l++)
        {
            while(con <= length)
            {
                for(int e=l; e < con; e++)
                {
                    sum = sum + array[e];
                }
                if(sum < 0)
                    count++;
                con ++;
                sum = 0;
            }
            con = l;
        }
        System.out.println(count);
    }
}
