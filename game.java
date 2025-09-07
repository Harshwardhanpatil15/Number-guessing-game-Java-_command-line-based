import java.util.*;

public class game{
    public static void main (String args[]){ 

        int random = (int)(Math.random() * 101);

        Scanner sc = new Scanner(System.in);
        
         int num=1000;

        while (num != random) {
            System.out.print("Enter a number from 0 to 100: ");
            num = sc.nextInt();
            
            if (num < random) {
                if(random - num > 25){
                    System.out.println("Too low!");
                }
                else{

                  System.out.println(" low!");  
                }
            } 
            else if (num > random) {
                if( num - random > 25){
                    System.out.println("Too high!");
                }
                else{
                  System.out.println(" high!");  
                }
            } else {
                System.out.println("Correct 🎉 You guessed it!");
            }
        }
        

    }
 

   
}