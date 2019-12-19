package TP2;
import java.util.Scanner;
classe test{
  public static void main(String[] args){
    int nbre= -1;
    int res;
    int i;
    Scanner scan= new Scanner(System.in);
    System.out.println("Entrer le chiffre à multiplier:");
    nbre=scan.nextInt();
    for(i=1; i<11; i++){
      res= i*nbre;
      System.out.print(i);
      System.out.print("x"+ nbre+ "=");
      System.out.println(res);
    }
    scan.close();
  }
}
