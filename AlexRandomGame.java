import java.util.Scanner; 
import java.util.Random; 

class Main {
  public static void main(String[] args) {
    int minimum = 10;
    int maximum = 100;
    int attempts = 10;
    Scanner myObj = new Scanner(System.in); 
    Random rand = new Random(); 
     int random = rand.nextInt(maximum); 
     while (random < minimum) {
         random = rand.nextInt(maximum);
     }
    System.out.println("Enter guess");
     int num = myObj.nextInt();  
     boolean beat = false;
     int i = 0;
  while (beat == false && i < attempts){
    i = i+1;
      if (num > random) {
        System.out.println("Too High!");
        num = myObj.nextInt();
        }
      else if (num < random) {
       System.out.println("Too Low!");
       num = myObj.nextInt();
      }
       else if (num == random) {
        System.out.println("Good Job!");
        beat = true;
      }
    }   
  }
}