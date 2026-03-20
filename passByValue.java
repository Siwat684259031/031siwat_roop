public class passByValue {
    public static void main(){
        Integer data = 100;
        AddOne(data);
        IO.println(data);
    }
    
    static void AddOne(int number){
        number++;
    }
}
