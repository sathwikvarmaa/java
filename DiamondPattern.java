public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
      
        for(int i=1;i<=n;i++){
            
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            int val = 2*(i-1);
            for(int j=1;j<val;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
      for(int i=n;i>=1;i--){
            
            for(int j=1; j<=n-i;j++){
                System.out.print("  ");
            }
            int val = 2*(i-1);
            for(int j=1;j<val;j++){
                System.out.print("* ");
            }
            System.out.println();
      }
    }
}
