import java.util.*;
public class Ass2q1
{
    public static void main(String[] args)
    {
        int year;
        System.out.println("Enter year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0&&year/100==0)
        {
            System.out.println("Year is leap year");
        }else
        {
            System.out.println("Year is Not leap year:");
        }
    }
}