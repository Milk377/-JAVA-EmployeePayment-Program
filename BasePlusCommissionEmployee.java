package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee  {

    private double baseSalary; // base salary per week

    // nine-argument constructor
    public BasePlusCommissionEmployee( String first, String last,
                                       String ssn, int month, int day, int year, int _howLongIsHeWorking,
                                       double sales, double rate, double salary )
    {
        super( first, last, ssn, month, day, year, _howLongIsHeWorking, sales, rate );
        setBaseSalary( salary );
    } // end nine-argument BasePlusCommissionEmployee constructor

    // set base salary
    public void setBaseSalary( double salary )
    {
        baseSalary = salary < 0.0 ? 0.0 : salary; // non-negative
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary()
    {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings(int _month)
    {


        // 10년 이상 일하고
        if(longWorkBonus())
        {
            // 현재 달에 생일이 포함 될 경우
            if(checkBirthBonus(_month))
            {

                System.out.printf("He works more than 10, Birthday\n");
                return getBaseSalary() + super.earnings(_month)  + (getBaseSalary() + super.earnings(_month))/10 + 10;
            }
            // 현재 달에 생일이 없는 경우
            else{
                // System.out.printf("He works more than 10, NOT Birthday\n");
                return getBaseSalary() + super.earnings(_month)  + (getBaseSalary() + super.earnings(_month))/10 ;
            }

        }
        // 10년 이상 일하지 않은 경우
        else
        {

            // 현재 달에 생일이 포함 될 경우
            if(checkBirthBonus(_month))
            {
                System.out.printf("He is not workking more than 10, Birthday\n");

                return getBaseSalary() + super.earnings(_month) +10;
            }
            // 현재 달에 생일이 없는 경우
            else{

                System.out.printf("He is not workking more than 10, NOT Birthday\n");
                return getBaseSalary() + super.earnings(_month);

            }

        }






    } // end method earnings

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString()
    {
        return String.format( "%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary() );
    } // end method toString
}
