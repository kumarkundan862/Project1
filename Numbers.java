package com.Conditionals;

import java.util.Scanner;
class IncomeTaxPaid {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        // Enter annual income
        double income = scan.nextDouble();
        // Enter age
        int age = scan.nextInt();

        double tax = 0.0;


        //Consider first range of income
        if (income<= 250000)
            System.out.println("No Tax applicable");
       /* if (250000< income && income>= 300000){
            if(age<60)
                tax = 0.10*(income - 250000);
            if(60<= age && age< 80)
            System.out.println("No Tax applicable");
            if (age>=80)
                System.out.println("No Tax applicable");
        }  */

        //Consider second range of income
        if (250001 < income && income <= 500000){
            if(age<60)
                tax =  0.10*(income-250000);
            if(60<= age && age < 80)
            tax = 0.1* (income-250000);
            if (age>=80)
                System.out.println("No Tax applicable");
        }

        //Consider third range of income

        if (500001 < income  && income <= 1000000){
            if(age<60)
                tax = 0.1*(500000-250000) + 0.2*(income-500000) ;
            if(60<= age && age < 80)
            tax =  0.1*(500000-250000) + 0.2*(income-500000);
            if (age>=80)
                tax = 0.2*(income-500000);
        }


        //Consider fourth range of income

        if (income > 1000000){
            if(age<60)
                tax = 0.1 * (500000 - 250000) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);

            if(60<= age && age < 80)
            tax =  0.1*(500000-250000) + 0.2*(1000000-500000) + 0.3*(income - 1000000);
            if (age>=80)
                tax = 0.2*(1000000-500000) +  0.3*(income - 1000000);
        }


        System.out.print(tax);
        scan.close();
    }
}
