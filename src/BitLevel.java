import java.util.Scanner;

public class BitLevel {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    short num = input.nextShort();
    short bits[] = new short[16];
    
    System.out.print("The bits are ");
    short mask = 0b1;
    for (int i = 0; i < 16; i++){
      short bit = (short)(num & mask);
      num = (byte)(num >> 1);
      bits[i] = bit;
    } // for i
    
    for(int i = 15; i >= 0; i--)
      System.out.print(bits[i]);
    System.out.println();
  }  // main
} // BitLevel
