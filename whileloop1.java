import java.util.*;
public class whileloop1 {
    public static void main(String args[]) {
Scanner sc =new Scanner (System.in);
int N = sc.nextInt();        
int count = 1;
int sum =0;

        while(count<=N){

            sum+=count;
            count++;
        }
        System.out.println("Sum is :" + sum);
    }
}
