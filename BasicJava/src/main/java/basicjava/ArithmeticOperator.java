
package basicjava;

import java.util.Scanner;

public class ArithmeticOperator {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        int price = 1800;
        int numberOfInstallment, installmentPerMonth;
        
        System.out.print("Number of installments : ");
        numberOfInstallment=input.nextInt();
        
        installmentPerMonth=price/numberOfInstallment;
        
        System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
        
    }
}
