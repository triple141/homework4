import java.io.PrintStream;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        //savarjisho 1

//        int n = sc.nextInt();
//        System.out.println((double) n/2);

        //savarjisho 2

//        int n = sc.nextInt();
//
//        for (int i = 1; i<=n; i++)
//        {
//            if(Math.pow(2,i)==n)
//            {
//                System.out.print(" " + (int)Math.pow(2,i));
//                n-=Math.pow(2, i);
//                i=0;
//            }
//            else if(Math.pow(2,i)>n) {
//                n -= Math.pow(2, i - 1);
//                System.out.print(" " + (int) Math.pow(2, i - 1));
//                i = 0;
//            }
//        }


        //savarjisho 3


//        for (int i = 1; i<=15; i++)
//        {
//            if(i==5 || i==7 || i==11)
//            {
//                continue;
//            }
//            System.out.print(" " + i);
//        }


        //savarjisho 4

//        int n = sc.nextInt();
//        String s="";
//        while(n>0)
//        {
//            if(n%2==1)
//            {
//                s+='1';
//                n=n/2;
//            }
//            else
//            {
//                s+='0';
//                n=(int)n/2;
//            }
//        }
//        for (int i=s.length()-1; i>=0; i--)
//        {
//            System.out.print(s.charAt(i));
//        }


        //savarjisho 5

//        int n = sc.nextInt();
//        int oper = 0;
//        int n2 = n;
//        int counter=0;
//
//        while (n2!=0)
//        {
//            counter++;
//            n2/=10;
//        }
//
//        for(int i=0; i<counter; i++)
//        {
//            if(n%10==1)
//            {
//                oper+=Math.pow(2,i);
//                n/=10;
//            }
//            else
//            {
//                n/=10;
//            }
//        }
//
//        System.out.println(oper);

        //savarjisho 6

//        int random, in, attempt;
//        random = 1 + (int) (100 * Math.random());
//        attempt = 0;
//
//        System.out.println("Guess a number between 0 and 100");
//
//        in = sc.nextInt();
//         while (in != random) {
//
//
//
//            if (in > random)
//            {
//                System.out.println("Go Lower!");
//                attempt += 1;
//            }
//            else
//            {
//                System.out.println("Go Higher!");
//                attempt += 1;
//            }
//            in = sc.nextInt();
//        }
//
//        System.out.println(random + " That is it, You guessed. It took you " + attempt + " attempts!");
//
    }
}
