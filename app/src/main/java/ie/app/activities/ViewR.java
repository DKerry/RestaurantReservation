package ie.app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ie.app.restaurantreservation.R;

public class ViewR extends AppCompatActivity {


    ListView listView;

    static final String [] reservations = new String []
            {
                    "Time, Amount of people",
                    "18:30pm, 2",
                    "20:00pm, 5",
                    "18:30pm, 6",
                    "18:00pm, 2",
                    "19:00pm, 3"

            };



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewr);

        listView = (ListView) findViewById(R.id.reservationList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, reservations);
        listView.setAdapter(adapter);
    }
}
