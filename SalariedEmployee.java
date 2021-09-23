package com.company;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    // seven-argument constructor
    public SalariedEmployee( String first, String last, String ssn,
                             int month, int day, int year, int _howLongIsHeWorking, double salary )
    {
        super( first, last, ssn, month, day, year , _howLongIsHeWorking );
        setWeeklySalary( salary );
    } // end seven-argument SalariedEmployee constructor

    // set salary
    public void setWeeklySalary( double salary )
    {
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    } // end method setWeeklySalary

    // return salary
    public double getWeeklySalary()
    {
        return weeklySalary;
    } // end method getWeeklySalary

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(int _month)
    {
        // 10년 이상 일하고
        if(longWorkBonus())
        {
            // 현재 달에 생일이 포함 될 경우
            if(checkBirthBonus(_month))
            {

                //System.out.printf("He works more than 10, Birthday\n");
                return getWeeklySalary() + getWeeklySalary()/10 + 10;
            }
            // 현재 달에 생일이 없는 경우
            else{
               // System.out.printf("He works more than 10, NOT Birthday\n");

                return getWeeklySalary() + getWeeklySalary()/10;

            }

        }
        // 10년 이상 일하지 않은 경우
        else
        {

            // 현재 달에 생일이 포함 될 경우
            if(checkBirthBonus(_month))
            {
                System.out.printf("He is not workking more than 10, Birthday\n");

                return getWeeklySalary() + 10;
            }
            // 현재 달에 생일이 없는 경우
            else{

                System.out.printf("He is not workking more than 10, NOT Birthday\n");
                return getWeeklySalary() ;

            }

        }


    } // end method earnings

    // return String representation of SalariedEmployee object
    @Override
    public String toString()
    {
        return String.format( "salaried employee: %s\n%s: $%,.2f",
                super.toString(), "weekly salary", getWeeklySalary() );
    } // end method toString
}
