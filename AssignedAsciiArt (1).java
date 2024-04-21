import java.util.Scanner;
public class AssignedAsciiArt {

   public static void pin(int num){
      for(int a = 0; a < num; a++){
         for(int i = 0; i < num * 3; i++){
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   public static void top(int num){
      int len  = (num * 3) - 4;
      if(num > 1){
         for(int i = 0; i < len; i++){
                  System.out.print(" ");
               }
         System.out.println(" __/||\\__");
      }
      if(num <= 1){
         System.out.println("__/||\\__");
      }
   
         if((num - 1) > 1){
               for(int l = 0; l < (num - 1); l++){
               int stat = len - (l * 3) - 2;
                  for(int i = 0; i < stat; i++){
                        System.out.print(" ");
                     }
                  System.out.print("__/");
                  for(int ll = 0; ll < (l + 1); ll++){
                     System.out.print(":::");
                  }
                  System.out.print("||");
                  for(int ll = 0; ll < (l + 1); ll++){
                     System.out.print(":::");
                  }
                 System.out.println("\\__");
               }
            }
   }
   public static void midtop(int num){
      System.out.print("|");
      for(int i = 0; i < (num * 6); i++){
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   public static void topbot(int num){
   
      for(int i = 0; i < num; i++){
      
         if(i >= 1){
            for(int r = 0; r < i; r++){
               System.out.print("  ");
            }
         }
      
         System.out.print("\\_");
         
         for(int s = 0; s < ((num * 3) - ((i * 2) + 1)); s++){
            
            System.out.print("/\\");
            
         }
         
         System.out.println("_/");
         
      }
   
   }
   
   public static void elv1(int num){
   
      for(int i = 0; i < num; i++){
      
         for(int s = 0; s < num * 3; s++){
            System.out.print(" ");
         }
      
         System.out.println("||");
      }
   
   }
   
   public static void elv2(int num){
      for(int i = 0; i < (num * 3); i++){
         for(int s = 0; s < ((num * 3) - 2); s++){
            System.out.print(" ");
         }
         System.out.println("|%||%|");
      }
   }
   
   public static void main(String[] args){
   
      Scanner scanner = new Scanner(System.in);
      System.out.println("scale:");
      int userName = Integer.parseInt(scanner.nextLine());
      pin(userName);
      top(userName);
      midtop(userName);
      topbot(userName);
      elv1(userName);
      elv2(userName);
      top(userName);
      midtop(userName);
      
      
     }
}