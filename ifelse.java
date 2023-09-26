import java.util.*;
public class ifelse {
    public static void main(String args[]){
 
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if(age>=18){

            System.out.println("Is Adult");
        }
        else if((age<18)&&(age>12)){
            System.out.println("Is Teanager");
        }
        else
        {
            System.out.println("half lemon");
        }
    }

    
}
