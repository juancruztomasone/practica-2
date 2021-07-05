package com.company;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    int day;
    int month;
    int year;
    Date date;
    Calendar calendar;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.date = Date.valueOf(year+"-"+month+"-"+day);
        this.calendar = new GregorianCalendar(year,month,day);
    }

    public Date addOneDay(){
        Calendar newCalendar = this.calendar;
        newCalendar.add(Calendar.DAY_OF_MONTH, 1);

        Date newDate = (Date) newCalendar.getTime();
        return newDate;
    }

    public boolean isValid(int year, int month, int day) {
        boolean isValid = true;
        Calendar calendar = new GregorianCalendar(year, month, day);
        if(year != calendar.get(Calendar.YEAR)) {
            isValid = false;
        }else if(month != calendar.get(Calendar.MONTH)) {
            isValid = false;
        }else if(day != calendar.get(Calendar.DAY_OF_MONTH)) {
            isValid = false;
        }

        return isValid;
    }

    public Date getDate(){
        Calendar cal = new GregorianCalendar();
        cal.setTime(this.date);
        return (Date) cal.getTime();
    }
}
