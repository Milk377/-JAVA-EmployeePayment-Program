package com.company;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;
    private int howLongIsHeWorking;

    // six-argument constructor
    public Employee( String first, String last, String ssn,
                     int month, int day, int year, int _howLongIsHeWorking )
    {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        birthDate = new Date( month, day, year );
        howLongIsHeWorking = _howLongIsHeWorking;

    } // end six-argument Employee constructor

    // set first name
    public void setFirstName( String first )
    {
        firstName = first;
    } // end method setFirstName

    // return first name
    public String getFirstName()
    {
        return firstName;
    } // end method getFirstName

    // set last name
    public void setLastName( String last )
    {
        lastName = last;
    } // end method setLastName

    // return last name
    public String getLastName()
    {
        return lastName;
    } // end method getLastName

    // set social security number
    public void setSocialSecurityNumber( String ssn )
    {
        socialSecurityNumber = ssn;  // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    // set birth date
    public void setBirthDate( int month, int day, int year )
    {
        birthDate = new Date( month, day, year );
    } // end method setBirthDate

    // return birth date
    public Date getBirthDate()
    {
        return birthDate;
    } // end method getBirthDate

    // return String representation of Employee object
    @Override
    public String toString()
    {
        return String.format( "%s %s\n%s: %s\n%s: %s",
                getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "birth date", getBirthDate() );
    } // end method toString

    // abstract method overridden by subclasses
    public abstract double earnings(int _month);

    public Boolean checkBirthBonus(int _month)
    {
        if(birthDate.getMonth() == _month)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean longWorkBonus()
    {
        if(howLongIsHeWorking >= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
