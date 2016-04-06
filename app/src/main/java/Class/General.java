package Class;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by DIEGOH on 2/04/2016
 * Copyright 2016 Sinapsis Soft.
 */
public  class General {
    // Variable for storing current date and time
    public static int mYear, mMonth, mDay, mHour, mMinute;
    public  static String sDate=null;


    public static  String  dialogCalendar(Activity activity){
    final Calendar c = Calendar.getInstance();

    mYear = c.get(Calendar.YEAR);
    mMonth = c.get(Calendar.MONTH);
    mDay = c.get(Calendar.DAY_OF_MONTH);

    DatePickerDialog dpd = new DatePickerDialog(activity,new DatePickerDialog.OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view, int year,
                                      int monthOfYear, int dayOfMonth) {

                    sDate=dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;
                }
            }, mYear, mMonth, mDay);
    dpd.show();
        return sDate;
    }
}
