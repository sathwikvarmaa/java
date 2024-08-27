public class getbit {
        public static void main(String[] args) {
            int n = 5;
            int pos = 2;
            
            int bit = 1<<pos;
            
            if((bit & n) == 0){
                System.out.println("bit was zero");
            }else{
                System.out.println("bit was one");
            }
        }
}
