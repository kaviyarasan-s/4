import java.util.*;
class alphabet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if((((int)c)>=97||((int)c)<=122)||(((int)c)>=65||((int)c)<=90))
        {
            System.out.print("Is Alphabet");
        }
        else 
        {
            System.out.print("Not  Alphabet");
        }
        
    }
}
