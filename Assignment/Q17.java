import java.util.Scanner; 
  
public class Q17 
{ 
 public static void main(String[] args) {
   
   Scanner sc =new Scanner(System.in);
   int rows = sc.nextInt();

        for(int i = 1; i <= rows; ++i) {
          if(i==rows){
          for(int j = 1; j <= i; ++j) {
                System.out.print(j);
            }}
          else{
            for(int j = 1; j <= i; ++j) {
              if(j==1||j==i)
                System.out.print(j);
              else
                System.out.print(" ");
            }
          }
            System.out.println();
        }
    }
}