class Main {
public static void main ( String args[ ]){
    int  i, j, k;
    for(i = 1; i <= 4; i++)
   {
      for(k = 0;k<i-1; k++)
      {
        System.out.print(" ");
      }
      for(j = i; j <= 4; j++)
      {
         System.out.print("*");
         System.out.print(" ");
      }

      System.out.println();
   }
}
}
