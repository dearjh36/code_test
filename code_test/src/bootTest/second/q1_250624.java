package bootTest.second;

public class q1_250624 {
    public static void main(String[] args){

        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        int cafelatte = 0;
        int americano = 0;

        for (int i = 0; i< order.length; i++){
           if( order[i].contains("cafelatte")) {
               cafelatte++;
           }else if (order[i].contains("americano")){
               americano++;
           }else if (order[i].contains("anything")){
               americano++;
           }
        }

        int answer = 0;

        answer += cafelatte*5000;
        answer += americano*4500;



    }
}
