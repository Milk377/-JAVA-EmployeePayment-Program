package com.company;

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // eight-argument constructor
    public CommissionEmployee( String first, String last, String ssn,
                               int month, int day, int year, int _howLongIsHeWorking,double sales, double rate )
    {
        super( first, last, ssn, month, day, year , _howLongIsHeWorking);
        setGrossSales( sales );
        setCommissionRate( rate );
    } // end eight-argument CommissionEmployee constructor

    // set commission
    public void setCommissionRate( double rate )
    {
        commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate()
    {
        return commissionRate;
    } // end method getCommissionRate

    // set gross sales amount
    public void setGrossSales( double sales )
    {
        grossSales = sales < 0.0 ? 0.0 : sales;
    } // end method setGrossSales

    // return gross sales amount
    public double getGrossSales()
    {
        return grossSales;
    } // end method getGrossSales

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(int _month) {

        // 10년 이상 일하고
        if (longWorkBonus()) {
            // 현재 달에 생일이 포함 될 경우
            if (checkBirthBonus(_month)) {

                System.out.printf("He works more than 10, Birthday\n");


                return getCommissionRate() * getGrossSales() + (getCommissionRate() * getGrossSales()) / 10 + 10;
            }
            // 현재 달에 생일이 없는 경우
            else {
                System.out.printf("He works more than 10, NOT Birthday\n");
                return getCommissionRate() * getGrossSales() + (getCommissionRate() * getGrossSales()) / 10;

            }

        }
        // 10년 이상 일하지 않은 경우
        else {

            // 현재 달에 생일이 포함 될 경우
            if (checkBirthBonus(_month)) {
                System.out.printf("He is not workking more than 10, Birthday\n");

                return getCommissionRate() * getGrossSales() + 10;
            }
            // 현재 달에 생일이 없는 경우
            else {

                System.out.printf("He is not workking more than 10, NOT Birthday\n");
                return getCommissionRate() * getGrossSales();

            }


        } // end method earnings
    }

    // return String representation of CommissionEmployee object
    @Override
    public String toString()
    {
        return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate() );
    } // end method toString
}
