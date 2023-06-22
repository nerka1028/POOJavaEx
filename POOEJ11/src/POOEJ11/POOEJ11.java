package POOEJ11;

import java.sql.Date;

public class POOEJ11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int year = 2023;
        int month = 10;
        int day = 11;
        Date date = new Date(year, month, day);
        System.out.println("Year: " + date.getYear());
        System.out.println("Now date: "+ date.getTime());
    }
}
