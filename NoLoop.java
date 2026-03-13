public class NoLoop{
    public static void main(String[] args) {
        // IO.print("Hello");
        // IO.print("Hello");
        // IO.print("Hello");
        // IO.print("Hello");
        // IO.print("Hello");
        int sum = 0;
        for(int i=0 ; i<100; i++){
            if(i%2==0){
            IO.print("Hello "+i);
            sum =sum + i ;
            }
        }
        IO.print("\n sum = "+sum);
}
}
