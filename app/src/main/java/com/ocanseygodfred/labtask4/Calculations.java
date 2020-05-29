package com.ocanseygodfred.labtask4;


public class Calculations {

   public static int months=0;
   public static Double downPayment=0.00, leaseRate=0.00, monthlyInstall=0.00;




    public void calc(){
        months= Integer.parseInt( MainActivity.editText.getText().toString());
        downPayment= Double.parseDouble(MainActivity.editText2.getText().toString());
        leaseRate=Double.parseDouble(MainActivity.editText3.getText().toString());

        monthlyInstall= (leaseRate-downPayment)/months;

    }
}
