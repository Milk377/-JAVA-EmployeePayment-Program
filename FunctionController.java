package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;


public class FunctionController {

    public static void addEmployee() throws IOException  {

        boolean boolValue = true;

        while(boolValue)
        {

            System.out.println("---------------------");
            System.out.println("Add Employee.");
            System.out.println("---------------------");
            System.out.println("1. SalariedEmployee ");
            System.out.println("2. Hourly Employee.");
            System.out.println("3. Commission Employee.");
            System.out.println("4. Base Plus Commission Employee.");
            System.out.println("5. PieceWorker");
            System.out.println("6. Back to Menu");

            System.out.println("Choose Option : ");
            Scanner sc = new Scanner(System.in);
            int inputValue = Integer.parseInt(sc.nextLine());

            String firstName = "";
            String lastName = "";
            String ssn = "";
            int birthMonth = 0;
            int birthDay = 0 ;
            int birthYear =0 ;
            int howLongIsHeWorking = 0;
            double hourlyWage = 0.0;
            double hoursWorked = 0.0;

            double salary = 0.0;
            double rate = 0.0;
            double sales = 0.0;

            Scanner data1,data2,data3,data4,data5,data6,data7,data8,data9,data10;
            String tempEmployee = "";
            String filePath = "C:\\Users\\teddy\\IdeaProjects\\javaex\\src\\com\\company\\employeeData.txt";


            switch(inputValue) {

                // SalariedEmployee
                case 1:
                    // 여기서 인풋값 에러 검증하는건 힘들다ㅠㅠ 사용자에게 주의를 당부하자.
                    // 사용자로부터 추가할 Salaried Employee 의 데이터를 입력받는다.
                    System.out.println("[SYSTEM] : be careful. do not mistake to input user data. ");
                    System.out.println("Input first name, lastname, Social Security Number , birth month, birth day, birth year, how long is he working now, salary");

                    data1 = new Scanner(System.in);
                    firstName = data1.nextLine();

                    data2 = new Scanner(System.in);
                    lastName = data2.nextLine();

                    data3 = new Scanner(System.in);
                    ssn = data3.nextLine();

                    data4 = new Scanner(System.in);
                    birthMonth = Integer.parseInt(data4.nextLine());

                    data5 = new Scanner(System.in);
                    birthDay = Integer.parseInt(data5.nextLine());

                    data6 = new Scanner(System.in);
                    birthYear = Integer.parseInt(data6.nextLine());

                    data7 = new Scanner(System.in);
                    howLongIsHeWorking = Integer.parseInt(data7.nextLine());

                    data8 = new Scanner(System.in);
                    salary = Double.valueOf(data8.nextLine());

                    // Employee 구분자 _ 데이터 구분자 ,
                    tempEmployee = "_" +"SalariedEmployee," + firstName + "," + lastName + "," + ssn + "," + birthMonth + "," +birthDay + "," + birthYear + "," + howLongIsHeWorking  + "," + salary;


                    try {
                        FileWriter fileWriter = new FileWriter(filePath, true);
                        fileWriter.write(tempEmployee);

                        fileWriter.close();
                        System.out.printf("save Salaried Employee data \n");

                    }catch (Exception e)
                    {

                        e.getStackTrace();
                    }

                    boolValue = false;
                    break;
                case 2:
                    // HourlyEmployee

                    System.out.println("[SYSTEM] : be careful. do not mistake to input user data. ");
                    System.out.println("Input firstname, lastname, ssn, month, day, year, howLongIsHeWorking, hourlyWage, hoursWorked");

                    data1 = new Scanner(System.in);
                    firstName = data1.nextLine();

                    data2 = new Scanner(System.in);
                    lastName = data2.nextLine();

                    data3 = new Scanner(System.in);
                    ssn = data3.nextLine();

                    data4 = new Scanner(System.in);
                    birthMonth = Integer.parseInt(data4.nextLine());

                    data5 = new Scanner(System.in);
                    birthDay = Integer.parseInt(data5.nextLine());

                    data6 = new Scanner(System.in);
                    birthYear = Integer.parseInt(data6.nextLine());

                    data7 = new Scanner(System.in);
                    howLongIsHeWorking = Integer.parseInt(data7.nextLine());

                    data8 = new Scanner(System.in);
                    hourlyWage = Double.valueOf(data8.nextLine());

                    data9 = new Scanner(System.in);
                    hoursWorked = Double.valueOf(data9.nextLine());


                    // Employee 구분자 _ 데이터 구분자 ,
                    tempEmployee = "_" +"HourlyEmployee," + firstName + "," + lastName + "," + ssn + "," + birthMonth + "," +birthDay + "," + birthYear + "," + howLongIsHeWorking  + "," + hourlyWage + "," + hoursWorked ;

                    try {
                        FileWriter fileWriter = new FileWriter(filePath, true);
                        fileWriter.write(tempEmployee);

                        fileWriter.close();
                        System.out.printf("save Hourly Employee data. \n");

                    }catch (Exception e)
                    {
                        e.getStackTrace();
                    }

                    boolValue = false;
                    break;
                case 3:

                    /*

                    public CommissionEmployee( String first, String last, String ssn,
                    int month, int day, int year, int _howLongIsHeWorking,double sales, double rate )

                    */
                    System.out.println("[SYSTEM] : be careful. do not mistake to input user data. ");
                    System.out.println("Input first name, lastname, Social Security Number , birth month, birth day, birth year, how long is he working now, sales, rate");

                    data1 = new Scanner(System.in);
                    firstName = data1.nextLine();

                    data2 = new Scanner(System.in);
                    lastName = data2.nextLine();

                    data3 = new Scanner(System.in);
                    ssn = data3.nextLine();

                    data4 = new Scanner(System.in);
                    birthMonth = Integer.parseInt(data4.nextLine());

                    data5 = new Scanner(System.in);
                    birthDay = Integer.parseInt(data5.nextLine());

                    data6 = new Scanner(System.in);
                    birthYear = Integer.parseInt(data6.nextLine());

                    data7 = new Scanner(System.in);
                    howLongIsHeWorking = Integer.parseInt(data7.nextLine());

                    data8 = new Scanner(System.in);
                    sales = Double.valueOf(data8.nextLine());


                    data9 = new Scanner(System.in);
                    rate = Double.valueOf(data8.nextLine());

                    // Employee 구분자 _ 데이터 구분자 ,
                    String TempEmployee = "_" +"CommissionEmployee," + firstName + "," + lastName + "," + ssn + "," + birthMonth + "," +birthDay + "," + birthYear + "," + howLongIsHeWorking  + "," + sales + "," + rate;

                    try {
                        FileWriter fileWriter = new FileWriter(filePath, true);
                        fileWriter.write(TempEmployee);

                        fileWriter.close();
                        System.out.printf("save CommissionEmployee data\n");

                    }catch (Exception e)
                    {
                        e.getStackTrace();
                    }

                    boolValue = false;
                    break;
                case 4:

                    /*

                    Base Plus Commission Employee.
                     */
                    System.out.println("[SYSTEM] : be careful. do not mistake to input user data. ");
                    System.out.println("Input first name, lastname, Social Security Number , birth month, birth day, birth year, how long is he working now, sales , rate, salary");

                    data1 = new Scanner(System.in);
                    firstName = data1.nextLine();

                    data2 = new Scanner(System.in);
                    lastName = data2.nextLine();

                    data3 = new Scanner(System.in);
                    ssn = data3.nextLine();

                    data4 = new Scanner(System.in);
                    birthMonth = Integer.parseInt(data4.nextLine());

                    data5 = new Scanner(System.in);
                    birthDay = Integer.parseInt(data5.nextLine());

                    data6 = new Scanner(System.in);
                    birthYear = Integer.parseInt(data6.nextLine());

                    data7 = new Scanner(System.in);
                    howLongIsHeWorking = Integer.parseInt(data7.nextLine());

                    data8 = new Scanner(System.in);
                    sales = Double.valueOf(data8.nextLine());

                    data9 = new Scanner(System.in);
                    rate = Double.valueOf(data9.nextLine());


                    data10 = new Scanner(System.in);
                    salary = Double.valueOf(data10.nextLine());


                    // Employee 구분자 _ 데이터 구분자 ,
                    TempEmployee = "_" +"BasePlusCommissionEmployee," + firstName + "," + lastName + "," + ssn + "," + birthMonth + "," +birthDay + "," + birthYear + "," + howLongIsHeWorking + "," + sales + "," + rate + "," + salary;

                    try {
                        FileWriter fileWriter = new FileWriter(filePath, true);
                        fileWriter.write(TempEmployee);

                        fileWriter.close();
                        System.out.printf("save Base Plus Commission Employee data \n");

                    }catch (Exception e)
                    {

                        e.getStackTrace();
                    }

                    boolValue = false;

                    break;
                case 5:
                    System.out.println("[SYSTEM] : be careful. do not mistake to input user data. ");
                    System.out.println("Input first name, lastname, Social Security Number , birth month, birth day, birth year, how long is he working now, pieces , wage");

                    data1 = new Scanner(System.in);
                    firstName = data1.nextLine();

                    data2 = new Scanner(System.in);
                    lastName = data2.nextLine();

                    data3 = new Scanner(System.in);
                    ssn = data3.nextLine();

                    data4 = new Scanner(System.in);
                    birthMonth = Integer.parseInt(data4.nextLine());

                    data5 = new Scanner(System.in);
                    birthDay = Integer.parseInt(data5.nextLine());

                    data6 = new Scanner(System.in);
                    birthYear = Integer.parseInt(data6.nextLine());

                    data7 = new Scanner(System.in);
                    howLongIsHeWorking = Integer.parseInt(data7.nextLine());

                    data8 = new Scanner(System.in);
                    sales = Integer.parseInt(data8.nextLine());

                    data9 = new Scanner(System.in);
                    rate = Double.valueOf(data9.nextLine());



                    boolValue = false;
                    break;
                case 6 :
                    System.out.printf("[SYSTEM] : Back to Menu.\n");
                    boolValue = false;


                default:
                    System.out.printf("[SYSTEM] : Error! Input from 1 to 5.\n");

                    // 잘못된 정보를 넣으면 while 문 반복. break 가 없다. 아니 switch 에서 break 은 while 문 break 이 아니다.
                    // 지금 사용하는 용도에서는 switch문 블럭 끝에 break 가 필수적으로 있어줘야 한다.
            }


        }


    };
    public static int paying(int _payingMonth) throws FileNotFoundException {

        int payingMonth = _payingMonth;

        System.out.println("---------------------");
        System.out.println("Paying Employee.");
        System.out.println("---------------------");
        System.out.println("Input Employee first name : ");


        Scanner sc1 = new Scanner(System.in);
        String name1 = sc1.nextLine();


        System.out.println("Input Employee last name : ");

        Scanner sc2 = new Scanner(System.in);
        String name2 = sc2.nextLine();

        String employeeName = name1 + "," + name2;


        Scanner employeeScanner = new Scanner(new File("C:\\Users\\teddy\\IdeaProjects\\javaex\\src\\com\\company\\employeeData.txt"));

        String allEmployeeData = employeeScanner.nextLine();

        //System.out.printf(ALLEMPLOYEEDATA);

        // 데이터가 존재할경우
        // 두번 분리한다. 전체 String 에서 employee 단위로 우선 분리하고
        // employee type 에 따라 4가지 자료형태로 또 분리한다.

        if(allEmployeeData.contains(employeeName))
        {
            System.out.printf("Employee exist. calculrating payments....\n");

            // 데이터가 존재할 경우에만 데이터 분류, 저장 작업을 진행한다.
            // employee 단위로 분리하여 emplArray에 넣는다.
            String[] emplArray = allEmployeeData.split("_");

            int existIndex = 0;
            /*
            // 임플로이 단위로 잘 분리되었는지 확인 OK
            for(int i = 0 ; i < emplArray.length ; i++)
            {

                System.out.println(emplArray[i]);
            }
           */

            // 여기서 위치는 0부터가 아니라 1부터 있다. 만 크게 상관은 없다. 해당 주소값을 변수로 사용할거니까.
            // 똑같은 이름이 중복될 경우 ssn 을 비교하는거 까지는 구현하지 않았다. 문제에서 성과 이름만으로 구분이 가능하다고 했으므로.
            // 제대로 작동 확인 OK
            for(int i = 0 ; i < emplArray.length; i++)
            {
                if(emplArray[i].contains(employeeName) )
                {
                    existIndex = i;
                    //System.out.printf("he is in :" + i);
                }
            }

            // 해당 Employee 데이터를 " , " 단위로 구분한다.
            String[] tarGetEmployee = emplArray[existIndex].split(",");

            // tarGetEmployee 는 index가 0부터 적용되는 배열이며 정상적으로 작동한다.
            /*
            // 모든 자료 출력 확인
            for(int i = 0 ; i < tarGetEmployee.length ; i++)
            {
                System.out.println(tarGetEmployee[i]);
            }

            // 모든 자료 정상 출력 확인.
            // inputdata 불러오기 Ok -> 직원 단위 분리 Ok -> 직원 데이터 단위 분리 Ok

             */

            // 이제 해야 할 일은 직원 종류에 따라서 월급 산정을 달리 하는 것 이다.

            // 철자 주의!!!

            switch(tarGetEmployee[0])
            {
                // 타겟 직원이 어떤 타입의 직원인가에 따라서 월급 산정을 달리한다.
                // 0 - Salaried , 1 - first , 2 - last , 3 - ssn, 4 - month , 5 - day , 6 - year , 7 - howlong , 8 - salary
                case "SalariedEmployee":
                    // Salaried Employee 객체 생성
                    SalariedEmployee sal_emp = new SalariedEmployee
                            (tarGetEmployee[1],tarGetEmployee[2],tarGetEmployee[3], Integer.parseInt(tarGetEmployee[4]),
                                    Integer.parseInt(tarGetEmployee[5]),Integer.parseInt(tarGetEmployee[6]),Integer.parseInt(tarGetEmployee[7]),Double.valueOf(tarGetEmployee[8]));
                    System.out.println("------------------------------------");
                    System.out.println("He earns this month " + payingMonth + " Earn : " + sal_emp.earnings(payingMonth));
                    System.out.println("------------------------------------");


                    break;
                case "HourlyEmployee":
                    // 0 HourlyEmployee ,1 first ,2 last, 3 ssn ,4 month ,5 day ,6 year, 7 howlong, 8 hourlywage, 9 hoursWorked
                    HourlyEmployee hour_emp = new HourlyEmployee
                            (tarGetEmployee[1],tarGetEmployee[2],tarGetEmployee[3],Integer.parseInt(tarGetEmployee[4]),
                            Integer.parseInt(tarGetEmployee[5]),Integer.parseInt(tarGetEmployee[6]),Integer.parseInt(tarGetEmployee[7]),
                                    Double.valueOf(tarGetEmployee[8]), Double.valueOf(tarGetEmployee[9]) );
                    System.out.println("------------------------------------");
                    System.out.println("He earns this month " + payingMonth + " Earn : " + hour_emp.earnings(payingMonth));
                    System.out.println("------------------------------------");


                    break;
                case "CommissionEmployee":

                    // 1 String first, 2String last,3 String ssn,
                    //  4 int month, 5 int day, 6 int year, 7 int _howLongIsHeWorking,8 double sales, 9 double rate )
                    CommissionEmployee comm_emp = new CommissionEmployee
                            (tarGetEmployee[1],tarGetEmployee[2],tarGetEmployee[3],Integer.parseInt(tarGetEmployee[4]),
                                    Integer.parseInt(tarGetEmployee[5]),Integer.parseInt(tarGetEmployee[6]),Integer.parseInt(tarGetEmployee[7]),
                                    Double.valueOf(tarGetEmployee[8]), Double.valueOf(tarGetEmployee[9]) );
                    System.out.println("------------------------------------");
                    System.out.println("He earns this month " + payingMonth + " Earn : " + comm_emp.earnings(payingMonth));
                    System.out.println("------------------------------------");

                    break;
                case "BasePlusCommissionEmployee":
                    BasePlusCommissionEmployee base_emp = new BasePlusCommissionEmployee
                            (tarGetEmployee[1],tarGetEmployee[2],tarGetEmployee[3],Integer.parseInt(tarGetEmployee[4]),
                                    Integer.parseInt(tarGetEmployee[5]),Integer.parseInt(tarGetEmployee[6]),Integer.parseInt(tarGetEmployee[7]),
                                    Double.valueOf(tarGetEmployee[8]), Double.valueOf(tarGetEmployee[9]) ,Double.valueOf(tarGetEmployee[10]));
                    System.out.println("------------------------------------");
                    System.out.println("He earns this month " + payingMonth + " Earn : " + base_emp.earnings(payingMonth));
                    System.out.println("------------------------------------");



                    break;
                default:
                    break;
            }














        }
        // 고용인 데이터가 없는 경우
        else
        {
            System.out.printf("[SYSTEM] : Error! Employee is not exist. check again his name.");
        }











        return 0; };

    // 추가 삭제는 나중에 추가할것.


}
