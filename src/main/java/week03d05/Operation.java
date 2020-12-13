package week03d05;

public class Operation {

    private int leftOperand;
    private int rightOperand;

    public Operation(String str) {
        leftOperand = Integer.parseInt(str.substring(0, str.indexOf("+")));
        rightOperand = Integer.parseInt(str.substring(str.indexOf("+")+1));
    }

    public int getResult() {
        return leftOperand + rightOperand;
    }
}
