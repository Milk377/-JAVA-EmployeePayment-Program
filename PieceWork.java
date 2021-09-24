package com.company;

public class PieceWork extends Employee  {

    private int pieces;
    private double wages;



    public PieceWork( String first, String last, String ssn,
                               int month, int day, int year, int _howLongIsHeWorking,int pieces, double wage )
    {
        super( first, last, ssn, month, day, year , _howLongIsHeWorking);

    } // end eight-argument CommissionEmployee constructor

    public double getWagesForPieceWorker()
    {
        return pieces * wages;
    }



    public double earningsInOneShot(Boolean birthBonus,Boolean longWorkBonus)
    {
        double wages = 0;

        if(birthBonus)
        {

        }
        else
        {

        }

        return wages;

    }




    // abstract method overridden by subclasses
    public double earnings(int _month)
    {
        // 10년 이상 일하고
        if (longWorkBonus()) {
            // 현재 달에 생일이 포함 될 경우
            if (checkBirthBonus(_month)) {

                System.out.printf("He works more than 10, Birthday\n");


                return getWagesForPieceWorker() + getWagesForPieceWorker()/10 + 10 ;
            }
            // 현재 달에 생일이 없는 경우
            else {
                System.out.printf("He works more than 10, NOT Birthday\n");
                return getWagesForPieceWorker() + getWagesForPieceWorker()/10;

            }

        }
        // 10년 이상 일하지 않은 경우
        else {

            // 현재 달에 생일이 포함 될 경우
            if (checkBirthBonus(_month)) {
                System.out.printf("He is not workking more than 10, Birthday\n");

                return getWagesForPieceWorker() + 10;
            }
            // 현재 달에 생일이 없는 경우
            else {

                System.out.printf("He is not workking more than 10, NOT Birthday\n");
                return getWagesForPieceWorker();

            }


        } // end method earnings

    }





}
