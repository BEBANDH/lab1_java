class Main {
public static void main ( String args[ ]){
    int  i, j, k;
    for(i = 1; i <= 4; i++)
   {
      for(k = i; k < 4; k++)
      {
        System.out.print(" ");
      }
      for(j = 1; j <=i; j++)
      {
         System.out.print("*");
         System.out.print(" ");

      }

      System.out.println();
   }
   }
}
