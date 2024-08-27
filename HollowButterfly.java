public class HollowButterfly {
    public static void main(String[] args) {
        int n = 5;
       
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=3;j<=i;j++){
                System.out.print(" ");
            }
            if(i>=2){
            System.out.print("*");
            }
         int spaces = 2*(n-i);
         for(int j=1;j<=spaces;j++){
             System.out.print(" ");
         }
           System.out.print("*");
            for(int j=3;j<=i;j++){
                System.out.print(" ");
            }
            if(i>=2){
            System.out.print("*");
            }
            System.out.println();
        }
        
      for(int i=n;i>=1;i--){
            System.out.print("*");
            for(int j=3;j<=i;j++){
                System.out.print(" ");
            }
            if(i>=2){
            System.out.print("*");
            }
         int spaces = 2*(n-i);
         for(int j=1;j<=spaces;j++){
             System.out.print(" ");
         }
           System.out.print("*");
            for(int j=3;j<=i;j++){
                System.out.print(" ");
            }
            if(i>=2){
            System.out.print("*");
            }
            System.out.println();
        } 
    }
}
