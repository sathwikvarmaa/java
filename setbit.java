public class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        
        int bit = 1<<pos;
        
       int newnumber = bit | n;
       
       System.out.print(newnumber);
    }  
}
