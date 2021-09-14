/*
Lab 4
Partners: Dillon Pearon and YourPartnerName
Date: (whatever date you turn it in)
*/
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int ogRandomNum = r.nextInt(50) + 1;
    int randomNum = ogRandomNum;
    
    System.out.println("The Random number is: " + ogRandomNum);
    
    while (randomNum >= 0) {
      System.out.println(randomNum);
      randomNum--;
    }

    if(ogRandomNum <= 5) {
      System.out.println("Ahoy mateys");
    }

    else if (ogRandomNum < 42 && ogRandomNum > 25) {
      System.out.println("Cannonball!");
    }
    
    else {
      System.out.println("Blast off!");
    }
  }
}