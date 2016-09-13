package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */
public class Operand {
    String operand;

    public Operand(String operand)
    {
        this.operand = operand;
    }

    public Operand(int operand)
    {
        this.operand = Integer.toString(operand);
    }

    public Operand(double operand)
    {
        this.operand = Double.toString(operand);
        /* your code here */
    }

}
