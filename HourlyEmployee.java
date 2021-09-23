package com.company;

public class HourlyEmployee extends Employee{

    private double wage; // wage per hour
    private double hours; // hours worked for week

    // eight-argument constructor
    public HourlyEmployee( String first, String last, String ssn,
                           int month, int day, int year, int _howLongIsHeWorking,
                           double hourlyWage, double hoursWorked )
    {
        super( first, last, ssn, month, day, year ,_howLongIsHeWorking);
        setWage( hourlyWage );
        setHours( hoursWorked );
    } // end eight-argument HourlyEmployee constructor

    // set wage
    public void setWage( double hourlyWage )
    {
        wage = hourlyWage < 0.0 ? 0.0 : hourlyWage;
    } // end method setWage

    // return wage
    public double getWage()
    {
        return wage;
    } // end method getWage

    // set hours worked
    public void setHours( double hoursWorked )
    {
        hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
                hoursWorked : 0.0;
    } // end method setHours

    // return hours worked
    public double getHours()
    {
        return hours;
    } // end method getHours

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings(int _month)
    {



        // 10년 이상 일하고
        if(longWorkBonus())
        {
            System.out.println("He is working more than 10 years.");
            // 현재 달에 생일이 포함 될 경우
            if(checkBirthBonus(_month))
            {
                System.out.println("He has also brith date this month.");
                if ( getHours() <= 40 ) // no overtime
                    return getWage() * getHours() + (getWage() * getHours())/10 + 10;
                else
                    return (40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5)
                            + (40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5)/10 + 10;
            }
            // 현재 달에 생일이 없는 경우
            else{

                System.out.println("He does not have brith date this month.");

                if ( getHours() <= 40 ) // no overtime
                    return getWage() * getHours() + (getWage() * getHours())/10 ;
                else
                    return (40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5)
                            + (40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5)/10 ;

            }

        }
        // 10년 이상 일하지 않은 경우
        else
        {
            System.out.println("He is not working more than 10 years.");

            // 현재 달에 생일이 포함 될 경우 10만원만 더 주면 됨
            if(checkBirthBonus(_month))
            {
                System.out.println("But He has brith date this month.");

                if ( getHours() <= 40 ) // no overtime
                    return getWage() * getHours() + 10;
                else
                    return (40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5)
                            + 10;
            }
            // 현재 달에 생일이 없는 경우
            else{
                System.out.println("He does not have brith date this month.");

                // 이 경우는 10년 이상 일하지도 않았고, 현재 달에 생일도 없는 경우이다.

                if ( getHours() <= 40 ) // no overtime
                    return getWage() * getHours() ;
                else
                    return (40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5);


            }

        }









    } // end method earnings

    // return String representation of HourlyEmployee object
    @Override
    public String toString()
    {
        return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours() );
    } // end method toString
}
