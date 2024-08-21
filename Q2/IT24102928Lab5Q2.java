import java.util.Scanner;

  public class IT24102928Lab5Q2 {
      public static void main(String[] args) {

          Scanner input = new Scanner(System.in);

          System.out.print("Enter the number of new members introduced :");
          int num = input.nextInt();

          switch(num){
                 case 0:System.out.println("no prize");break;
      
                 case 1:System.out.println("prize: pen ");break;

                 case 2:System.out.println("prize: Umbrella");break;

                 case 3:System.out.println("prize: Bag");break;

                 case 4:System.out.println("prize: Travelling Chair");break;

                 default:if(num>=5) {
                      System.out.println("Prize: Headphone");
                     }
                     else {
                     System.out.println("Input must be number 0 or greater.");
                      }
              

              }

         }
 }
           