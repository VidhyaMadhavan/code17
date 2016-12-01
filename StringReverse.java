import java.lang.*;
import java.util.*;
public class StringReverse
 {
public static void main(String[] args)
 {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter string:");
        str=sc.nextLine();
        String[] arr=str.split(" ");

        StringBuilder builder=new StringBuilder("");
        for(int i=arr.length-1; i>=0;i--)
        {
            builder.append(arr[i]+" ");
        }
        System.out.println(builder.toString());
    }

}
