package ie.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ie.app.restaurantreservation.R;

public class Options extends AppCompatActivity {

    public void viewButtonPressed (View view)
    {
        Intent intent = new Intent(this, ViewR.class);
        startActivity(intent);
        //Log.v("Login", "Login button pressed!");
    }

    public void makeButtonPressed (View view)
    {
        Intent intent = new Intent(this, MakeR.class);
        startActivity(intent);
        //Log.v("Login", "Login button pressed!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
}
