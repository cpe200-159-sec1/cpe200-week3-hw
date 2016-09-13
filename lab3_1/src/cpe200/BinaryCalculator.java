package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */

    public BigDecimal bn1,bn2;


    public BinaryCalculator()
    {
        this.bn1 = new  BigDecimal("0.0");
        this.bn2 = new  BigDecimal("0.0");
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        this.bn1 = new  BigDecimal(operand.operand);

    }


    public void setSecondOperand(Operand operand)
    {
        this.bn2 = new  BigDecimal(operand.operand);

    }

    public String add()
    {
        bn1 = bn1.add(bn2);
        BigDecimal bigDecimal = bn1.stripTrailingZeros();
        return bigDecimal.toString();
    }

    public String subtract()
    {
        /* your code here */
        bn1 = bn1.subtract(bn2);
        BigDecimal bigDecimal = bn1.stripTrailingZeros();
        return bigDecimal.toString();
    }

    public String multiply()
    {
        /* your code here */
        bn1 = bn1.multiply(bn2);
        bn1 = bn1.stripTrailingZeros();
        return bn1.toString();
    }

    public String division()
    {
        /* your code here */

        bn1 = bn1.divide(bn2 , 5 , BigDecimal.ROUND_HALF_UP);
        bn1 = bn1.stripTrailingZeros();
        return bn1.toString();

    }


}
