import java.util.*;
public class bill{
    public static void main(String args[]){
        //First We take Values of Items!!
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Value of Pen");
float pen = sc.nextFloat();
System.out.println("Enter the Value of Pencil");
float pencil = sc.nextFloat();
System.out.println("Enter the Value of Rubber");
float rubber = sc.nextFloat();
float total = pen+pencil+rubber;
float GST = (total/100) * 18f;
float Total= total+GST;
//Now we make a structure like a Bill!!
System.out.println("***********ABHINANDAN STORE***********" 
+ "\n value of pen:"+ pen
+"\n value of pencil:"+pencil
+"\n Value of rubber:"+rubber
+"\n total GST Charges:"+GST
+"\n Total:"+Total
+"\n**************Thank You***************");

    }
}