public class ForEach {
    public static void main(String[] args) {
        
        double[] scores = {85.5, 92.0, 78.5};
        for(int i = 0; i < scores.length; i++){
            IO.println(scores[i]);
        }
        for(double score : scores){
            IO.println(score);
        }
    }
}
