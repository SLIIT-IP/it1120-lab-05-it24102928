import java.util.Scanner;

public class IT24102928Lab5Q1  {
    public static void main(String[] args)  {

         Scanner rs = new Scanner(System.in);

         System.out.println("Enter the first integer:");
         int num1 = rs.nextInt();

         System.out.println("Enter the second integer:");
         int num2 = rs.nextInt();

         System.out.println("Enter the third integer:");
         int num3 = rs.nextInt();
         
          System.out.println("User enterd numbers are : " +num1+" "+num2+" "+num3);

           if(num1<num2 && num1<num3) {

              System.out.println("The Smallest number is :" +num1);
                }

           else if(num2<num1 && num2<num3) {
              System.out.println("The Smallest number is :" +num2);
                }
 
           else {
 
               System.out.println("The Smallest number is :" +num3);
                 }

           if(num1>num2 && num1>num3) {
        
               System.out.println("The Largest number is :" +num1);
                }

            else if(num2>num1 && num2>num3) {
        
               System.out.println("The Largest number is :" +num2);
                }
            
            else {
        
               System.out.println("The Largest number is :" +num3);
                }

     }

}



          

