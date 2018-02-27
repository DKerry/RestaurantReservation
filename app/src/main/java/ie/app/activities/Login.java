package ie.app.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import activities.Options;
import ie.app.restaurantreservation.R;

public class Login extends AppCompatActivity {


    public void loginButton2Pressed (View view)
    {
        Intent intent = new Intent(this, Options.class);
        startActivity(intent);
        //Log.v("Login", "Login button pressed!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usernameField = (EditText) findViewById(R.id.usernameField);
        final EditText passwordField = (EditText) findViewById(R.id.passwordField);

        final Button loginButton2 = (Button) findViewById(R.id.loginButton2);
        final TextView welcomeMessage = (TextView) findViewById(R.id.welcomeMessage);
    }
}
