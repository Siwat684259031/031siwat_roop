public class Break {
    public static void main (String[] args){

        for(int i = 0; i < 10; i++){
            if(i == 5){
                IO.println("พบเลข 5 แล้วหยุด ");
                break;
            }
            IO.println("i = "+i);
        }
    }
}
