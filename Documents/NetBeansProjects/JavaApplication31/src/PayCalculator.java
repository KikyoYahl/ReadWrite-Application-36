/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paycalculator;

/**
 *
 * @author Space
 */
import java.math.BigDecimal;

public abstract class PayCalculator {
    BigDecimal payRate;
    
    PayCalculator(BigDecimal payRate){
        this.payRate=payRate;
    }
    
    abstract BigDecimal computePay(double hour);
    
    
    
    BigDecimal computeDeduction(double deductRate){
        return (this.payRate.multiply(new BigDecimal(deductRate)));
    }

   
}
