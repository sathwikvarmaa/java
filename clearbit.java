class clearbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        
        int bit = 1<<pos;
        
        int bitnot = ~(bit);
       
        int finalbit = bitnot & n;
        
       System.out.print(finalbit);
    }
}