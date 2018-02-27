package ie.app.activities;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;
import ie.app.restaurantreservation.R;


public class MakeR extends AppCompatActivity {

    private static final String TAG = "MAKER";

    //declaring variables
    private TextView date;
   // private TextView time;
    private DatePickerDialog.OnDateSetListener dateSetListener;
    TextView time;
    Calendar currentTime;
    int hour, minute;
    String format;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_r);
        date = (TextView) findViewById(R.id.dateField);
        // time = (TextView) findViewById(R.id.timeField);


        date.setOnClickListener(new OnClickListener() {
            @Override

            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog dialog = new DatePickerDialog(MakeR.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth, dateSetListener, year, month, day);

                //making the background transparent
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1; //because january is 1 and december is 11
                Log.d(TAG, "onDateSet: dd/mm/yyyy: " + day + "/" + month + "/" + year); //printing out to see which order it's in
                String finalDate = "Date selected: " + day + "/" + month + "/" + year;
                date.setText(finalDate);


                time = (TextView) findViewById(R.id.timeField);
                currentTime = Calendar.getInstance();
                hour = currentTime.get(Calendar.HOUR_OF_DAY);
                minute = currentTime.get(Calendar.MINUTE);


            //selectedTimeFormat(hour);




        time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                TimePickerDialog timePickerDialog = new TimePickerDialog(MakeR.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        selectedTimeFormat(hour);
                        time.setText(hour + " : " + minute + " : " + format);
                    }
                }, hour, minute, true);

                timePickerDialog.show();


            }

    private void selectedTimeFormat(int hour) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
    }});
            }};

    }}












