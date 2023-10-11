import java.util.Scanner;

public class pattern7{
  public static void main(String[] args) {

    int i=0, j;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the dollar in each side of square: ");
    int sideSize = sc.nextInt();

    while (i < sideSize )
    {
      j = 0 ;
      while ( j < sideSize )
      {
        if (i == 0 || i == sideSize - 1 || j == 0 || j == sideSize - 1) {
          System.out.print("$"+ " ");
        }
        else {
          System.out.print("  ");
        }
        j++;
      }
      System.out.println();
      i++;
    }
  }
}