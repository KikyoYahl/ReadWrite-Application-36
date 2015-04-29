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
public class HazardPay extends PayCalculator{
   
    public HazardPay(BigDecimal payRate){
        super(payRate);
    }
  @Override
    BigDecimal computePay(double hour){
   return payRate.multiply(new BigDecimal(hour)).multiply(new BigDecimal(1.5));
    }
}
