package ie.app.models;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import ie.app.activities.Login;
import ie.app.activities.Register;
import ie.app.restaurantreservation.R;


public class RestaurantReservation extends AppCompatActivity {

    private Button registerButton;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_reservation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });

        registerButton = (Button) findViewById(R.id.registerButton);
        loginButton = (Button) findViewById(R.id.loginButton);

        if (registerButton != null && loginButton != null)
        {
            Log.v("Register and Login", "Really got the register and login buttons!");
        }
    }*/

    public void registerButtonPressed (View view)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
        //Log.v("Register", "Register button pressed!");
    }

    public void loginButtonPressed (View view)
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        //Log.v("Login", "Login button pressed!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_restaurant_reservation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

       // switch (item.getItemId()) {
            //case R.id.loginButton:
                //startActivity(new Intent(this, Login.class));
                //break;
        //}

        return super.onOptionsItemSelected(item);
    }

}
