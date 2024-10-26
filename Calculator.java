
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Calculator {
  public static void main(String[] args) throws FileNotFoundException{
     
     File f1 = new File("D:/4MW23CS081/In1.txt");
     Scanner sc1=new Scanner(f1);
      int n1=sc1.nextInt();
      int n2=sc1.nextInt();
      int sum=n1+n2;
      int diff=n1-n2;
      int product=n1*n2;
      float div=(float)n1/n2;
      int queo=n1/n2;
      int rem=n1%n2;
      int expo=(int)pow(n1,n2);
      System.out.println(sum);
      System.out.println(diff);
      System.out.println(product);
      System.out.println(div);
      System.out.println(queo);
      System.out.println(rem);
      System.out.println(expo);
      
      
  }  
}
