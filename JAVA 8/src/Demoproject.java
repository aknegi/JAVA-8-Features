import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Demoproject {/*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<N;i++){
            int j= scan.nextInt();
            arr.add(j);
        }
        int sum = 0;
        int tsum =0;

        for(int j=0;j<N;j++) {
            if(arr.get(j)!=0)
            {tsum=tsum+arr.get(j);
                j++;
            }else{
                j=j-1;
            }
        }
        for(int j=1;j<N;j++) {
            if(arr.get(j)!=0)
            {sum=sum+arr.get(j);
                j++;
            }else{
                j=j-1;
            }
        }
    if(tsum>sum){
        System.out.println(tsum);
    }
    else    {
        System.out.println(sum);
    }
    }*/

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2= new Stack<Character>();

        String str= s.next();
        boolean flag=false;
        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                stack1.push(str.charAt(i));

            else if(Character.isAlphabetic(str.charAt(i)))
                stack2.push(str.charAt(i));
            else {
                System.out.println("Invalid Input");
                flag = true;
                break;
            }
        }
        if(!flag) {
            while(!stack1.empty()) {
                System.out.println(stack1.pop());
            }
        }
        if(!flag) {
            while(!stack2.empty()) {
                System.out.println(stack2.pop());
            }
        }
    }
}

