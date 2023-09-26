import java.util.*;
public class caculatorByternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Inter a" );
        int a = sc.nextInt();
        System.out.println("Inter b" );
        int b = sc.nextInt();
        System.out.println("Inter opretor" );
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("a+b is"+ a+b);
                
                break;

            case '-':System.out.println(a-b);
                
                break;

            case '*':System.out.println("a*b is"+ a*b);
                
                break;

            case '/':System.out.println("a/b is"+ a/b);
                
                break;  

            case '%':System.out.println("a%b is"+ a%b);
                
                break; 
        
            default:System.out.println("!!Wrong Input!!");
                break;
        }
    }
}
