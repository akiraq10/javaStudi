package lession_03;

public class LoopFlowControlKeywords {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            if (index==3){
//                continue; //keep loop with index=3
                break; //break loop when matching with condition
            }
            System.out.println(index);
        }

    }

}
