package com.example.wahid.c5b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



import java.util.Date;

public class RoutinActivity extends AppCompatActivity {

    String temp;
    String day;
    String d;
    int n;

    TextView date, month, year, Textday;
    TextView time1, time2, time3, time4;
    TextView text1, text2, text3, text4;
    TextView HD, HD1, HD2, HD3, HD4;
    TextView VD;
    TextView chill;
    Spinner spin;


    /* SYSTEM DATE METHOD */
    public String getdate() {

        Date date = new Date();

        return date.toString();
    }

    /* SYSTEM DATE METHOD FINISHED */

    /* SYSTEM DAY IN STRING */
    public String GetDay() {
        String date = getdate();
        String day = date.substring(0, 3);

        return day;
    }

    /* SYSTEM DAY IN STRING METHOD FINISHED */

    /* SYSTEM TIME IN STRING METHOD */
    public String getTime() {
        String date = getdate().substring(11, 20);


        return date;
    }
    /* SYSTEM TIME IN STRING METHOD FINISHED */

    public String getMonth() {
        String date = getdate();
        String month = date.substring(4,7);

        return month;
    }
    public String getYear() {
        String date = getdate();
        String year = date.substring(24,28);

        return year;
    }


    public void text3Blank() {

        time3.setText(" ");
        time3.setBackgroundResource(R.color.White);
        text3.setText(" ");
        text3.setBackgroundResource(R.color.White);


        time4.setText(" ");
        time4.setBackgroundResource(R.color.White);
        text4.setText(" ");
        text4.setBackgroundResource(R.color.White);
        VD.setBackgroundResource(R.color.White);
        //HD.setBackgroundResource(R.color.White);
        //HD1.setBackgroundResource(R.color.White);
        //HD2.setBackgroundResource(R.color.White);
        HD3.setBackgroundResource(R.color.White);
        HD4.setBackgroundResource(R.color.White);
    }

    public void text4Blank() {
       /* time3.setText(" ");
        time3.setBackgroundResource(R.color.White);
        text3.setText(" ");
        */


        time4.setText(" ");
        time4.setBackgroundResource(R.color.White);
        text4.setText(" ");
        text4.setBackgroundResource(R.color.White);
        VD.setBackgroundResource(R.color.White);
        //HD.setBackgroundResource(R.color.White);
        //HD1.setBackgroundResource(R.color.White);
        //HD2.setBackgroundResource(R.color.White);
        //HD3.setBackgroundResource(R.color.White);
        HD4.setBackgroundResource(R.color.White);
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routin);
        date = findViewById(R.id.date);
        month = findViewById(R.id.month);
        year = findViewById(R.id.year);

        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        time3 = findViewById(R.id.time3);
        time4 = findViewById(R.id.time4);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        spin = findViewById(R.id.spinner);
        Textday = findViewById(R.id.day);
        chill = findViewById(R.id.chill);

        VD = findViewById(R.id.verticalD);
        HD = findViewById(R.id.horizontalD);
        HD1 = findViewById(R.id.horizontalD1);
        HD2 = findViewById(R.id.horizontalD2);
        HD3 = findViewById(R.id.horizontalD3);
        HD4 = findViewById(R.id.horizontalD4);




     //  String mp=getYear();
      // year.setText(mp);


        String y=getMonth();

        if (y.equals("Jan")){
            n=0;
            temp="January";
            month.setText(temp);
        }
        else if (y.equals("Feb")){
            n=1;
            temp="February";
            month.setText(temp);
        }
        else if (y.equals("Mar")){
            n=2;
            temp="March";
            month.setText(temp);
        }
        else if (y.equals("Apr")){
            n=3;
            temp="April";
            month.setText(temp);
        }
        else if (y.equals("May")){
            n=4;
            temp="May";
            month.setText(temp);
        }
        if (y.equals("Jun")){
            n=0;
            temp="June";
            month.setText(temp);
        }
        else if (y.equals("Jul")){
            n=1;
            temp="July";
            month.setText(temp);
        }
        else if (y.equals("Aug")){
            n=2;
            temp="August";
            month.setText(temp);
        }
        else if (y.equals("Sep")){
            n=3;
            temp="September";
            month.setText(temp);
        }
        else if (y.equals("Oct")){
            n=4;
            temp="October";
            month.setText(temp);
        }
        else if (y.equals("Dec")){
            n=3;
            temp="December";
            month.setText(temp);
        }
        else if (y.equals("Nov")){
            n=4;
            temp="November";
            month.setText(temp);
        }

        y=GetDay();

        if (y.equals("Sat")){
            n=0;
            d="Saturday";
        }
        else if (y.equals("Sun")){
            n=1;
            d="Sunday";
        }
        else if (y.equals("Mon")){
            n=2;
            d="Monday";
        }
        else if (y.equals("Tue")){
            n=3;
            d="Tuesday";
        }
        else if (y.equals("Wed")){
            n=4;
            d="Wednesday";
        }
        else if (y.equals("Thu")){
            d="Thursday";
        }
        else if (y.equals("Fri")){
            d="Friday";
        }



        //date month and year er jonw new method likhte hbe

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.days));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                temp=d;
                if (i == 0){
                    Textday.setText(temp);
                }
                else if (i ==1){
                    temp="Saturday";
                    Textday.setText("Saturday");
                }
                else if (i==2){
                    temp = "Sunday";
                    Textday.setText("Sunday");
                }
                else if (i == 3 ){
                    temp = "Monday";
                    Textday.setText("Monday");
                }
                else if (i==4){
                    temp="Tuesday";
                    Textday.setText("Tuesday");
                }
                else if (i==5){
                    temp="Wednesday";
                    Textday.setText("Wednesday");
                }
                else if (i==6){
                    temp="Thursday";
                    Textday.setText("Thursday");
                }
                else if (i==7){
                    temp="Friday";
                    Textday.setText("Friday");
                }
                day=temp.substring(0,3);


                if (day.equals("Sat")) //For Saturday
                {
                    String time = com.example.wahid.c5b.sat.firstHourTime();
                    time1.setText(time);
                    time1.setBackgroundResource(R.color.Grey);//Grey
                    String Class = com.example.wahid.c5b.sat.firstHour();
                    text1.setText(Class);
                    text1.setBackgroundResource(R.color.LightB);//LightB

                    time = com.example.wahid.c5b.sat.secondtHourTime();
                    time2.setText(time);
                    time2.setBackgroundResource(R.color.Grey);//Grey
                    Class = com.example.wahid.c5b.sat.secondHour();
                    text2.setText(Class);
                    text2.setBackgroundResource(R.color.LightGreen);//LightGreen

                    time = com.example.wahid.c5b.sat.thirdHourTime();
                    if (!time.equals(" ")) {
                        time3.setText(time);
                        time3.setBackgroundResource(R.color.Grey);//Grey
                        Class = com.example.wahid.c5b.sat.thirdHour();
                        text3.setText(Class);
                        text3.setBackgroundResource(R.color.LightPurple);//LightPurple

                        time = com.example.wahid.c5b.sat.fourthHourTime();
                        if (!time.equals(" ")) {
                            time4.setText(time);
                            time4.setBackgroundResource(R.color.Grey);//Grey
                            Class = com.example.wahid.c5b.sat.fourthHour();
                            text4.setText(Class);
                            text4.setBackgroundResource(R.color.LightSkyBlue);//LightSkyBlue
                        } else
                            text4Blank();
                    } else
                        text3Blank();
                } else if (day.equals("Sun")) //For Sunday
                {
                    String time = com.example.wahid.c5b.sun.firstHourTime();
                    time1.setText(time);
                    time1.setBackgroundResource(R.color.Grey);//Grey
                    String Class = com.example.wahid.c5b.sun.firstHour();
                    text1.setText(Class);
                    text1.setBackgroundResource(R.color.LightOrange);//LightOrange

                    time = com.example.wahid.c5b.sun.secondtHourTime();
                    time2.setText(time);
                    time2.setBackgroundResource(R.color.Grey);//Grey
                    Class = com.example.wahid.c5b.sun.secondHour();
                    text2.setText(Class);
                    text2.setBackgroundResource(R.color.LightRed);//LightRed

                    time = com.example.wahid.c5b.sun.thirdHourTime();
                    if (!time.equals(" ")) {
                        time3.setText(time);
                        time3.setBackgroundResource(R.color.Grey);//Grey
                        Class = com.example.wahid.c5b.sun.thirdHour();
                        text3.setText(Class);
                        text3.setBackgroundResource(R.color.colorPrimaryDark);//primaryDark

                        time = com.example.wahid.c5b.sun.fourthHourTime();
                        if (!time.equals(" ")) {
                            time4.setText(time);
                            time4.setBackgroundResource(R.color.Grey);//Grey
                            Class = com.example.wahid.c5b.sun.fourthHour();
                            text4.setText(Class);
                            text4.setBackgroundResource(R.color.LightPurple);//LightPurple
                        } else
                            text4Blank();
                    } else
                        text3Blank();
                } else if (day.equals("Mon")) //For Sunday
                {
                    String time = com.example.wahid.c5b.mon.firstHourTime();
                    time1.setText(time);
                    time1.setBackgroundResource(R.color.Grey);//Grey
                    String Class = com.example.wahid.c5b.mon.firstHour();
                    text1.setText(Class);
                    text1.setBackgroundResource(R.color.LightGreen);//LightGreen

                    time = com.example.wahid.c5b.mon.secondtHourTime();
                    time2.setText(time);
                    time2.setBackgroundResource(R.color.Grey);//Grey
                    Class = com.example.wahid.c5b.mon.secondHour();
                    text2.setText(Class);
                    text2.setBackgroundResource(R.color.LightSkyBlue);//LightSkyBlue

                    time = com.example.wahid.c5b.mon.thirdHourTime();
                    if (!time.equals(" ")) {
                        time3.setText(time);
                        time3.setBackgroundResource(R.color.Grey);//Grey
                        Class = com.example.wahid.c5b.mon.thirdHour();
                        text3.setText(Class);
                        text3.setBackgroundResource(R.color.White);//White

                        time = com.example.wahid.c5b.mon.fourthHourTime();
                        if (!time.equals(" ")) {
                            time4.setText(time);
                            time4.setBackgroundResource(R.color.Grey);//Grey
                            Class = com.example.wahid.c5b.mon.fourthHour();
                            text4.setText(Class);
                            text4.setBackgroundResource(R.color.LightB);//primaryDark
                        } else
                            text4Blank();
                    } else
                        text3Blank();
                } else if (day.equals("Tue")) //For Tuesday
                {
                    String time = com.example.wahid.c5b.tue.firstHourTime();
                    time1.setText(time);
                    time1.setBackgroundResource(R.color.Grey);//Grey
                    String Class = com.example.wahid.c5b.tue.firstHour();
                    text1.setText(Class);
                    text1.setBackgroundResource(R.color.LightOrange);//LightOrange

                    time = com.example.wahid.c5b.tue.secondtHourTime();
                    time2.setText(time);
                    time2.setBackgroundResource(R.color.Grey);//Grey
                    Class = com.example.wahid.c5b.tue.secondHour();
                    text2.setText(Class);
                    text2.setBackgroundResource(R.color.LightPurple);//LightPurple

                    time = com.example.wahid.c5b.tue.thirdHourTime();
                    if (!time.equals(" ")) {
                        time3.setText(time);
                        time3.setBackgroundResource(R.color.Grey);//Grey
                        Class = com.example.wahid.c5b.tue.thirdHour();
                        text3.setText(Class);
                        text3.setBackgroundResource(R.color.LightRed);//LightRed

                        time = com.example.wahid.c5b.tue.fourthHourTime();
                        if (!time.equals(" ")) {
                            time4.setText(time);
                            time4.setBackgroundResource(R.color.Grey);//Grey
                            Class = com.example.wahid.c5b.tue.fourthHour();
                            text4.setText(Class);
                            text4.setBackgroundResource(R.color.LightGreen);//LightGreen
                        } else
                            text4Blank();
                    } else
                        text3Blank();
                } else if (day.equals("Wed")) //For Wednesday
                {
                    String time = com.example.wahid.c5b.wed.firstHourTime();
                    time1.setText(time);
                    time1.setBackgroundResource(R.color.Grey);//Grey
                    String Class = com.example.wahid.c5b.wed.firstHour();
                    text1.setText(Class);
                    text1.setBackgroundResource(R.color.White);//White

                    time = com.example.wahid.c5b.wed.secondtHourTime();
                    time2.setText(time);
                    time2.setBackgroundResource(R.color.Grey);//Grey
                    Class = com.example.wahid.c5b.wed.secondHour();
                    text2.setText(Class);
                    text2.setBackgroundResource(R.color.LightB);//LightBlue

                    time = com.example.wahid.c5b.wed.thirdHourTime();
                    if (!time.equals(" ")) {
                        time3.setText(time);
                        time3.setBackgroundResource(R.color.Grey);//Grey
                        Class = com.example.wahid.c5b.wed.thirdHour();
                        text3.setText(Class);
                        text3.setBackgroundResource(R.color.LightPurple);//LightPurple

                        time = com.example.wahid.c5b.wed.fourthHourTime();
                        if (!time.equals(" ")) {
                            time4.setText(time);
                            time4.setBackgroundResource(R.color.Grey);//Grey
                            Class = com.example.wahid.c5b.wed.fourthHour();
                            text4.setText(Class);
                            text4.setBackgroundResource(R.color.LightGreen);//LightGreen
                        } else
                            text4Blank();
                    } else
                        text3Blank();
                }

           else if (day.equals("Thu") || day.equals("Fri"))
            {
                time1.setText(" ");
                time1.setBackgroundResource(R.color.White);
                text1.setText(" ");
                text1.setBackgroundResource(R.color.White);


                time2.setText(" ");
                time2.setBackgroundResource(R.color.White);
                text2.setText(" ");
                text2.setBackgroundResource(R.color.White);


                time3.setText(" ");
                time3.setBackgroundResource(R.color.White);
                text3.setText(" ");
                text3.setBackgroundResource(R.color.White);


                time4.setText(" ");
                time4.setBackgroundResource(R.color.White);
                text4.setText(" ");
                text4.setBackgroundResource(R.color.White);
                VD.setBackgroundResource(R.color.White);
                HD.setBackgroundResource(R.color.White);
                HD1.setBackgroundResource(R.color.White);
                HD2.setBackgroundResource(R.color.White);
                HD3.setBackgroundResource(R.color.White);
                HD4.setBackgroundResource(R.color.White);

                chill.setText("Chill dude!!! Why so serious?");
               // Toast.makeText(this,"Today is off day.So chill dude",Toast.LENGTH_LONG).show();


            }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}

