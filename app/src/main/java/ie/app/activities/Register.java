package ie.app.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import ie.app.restaurantreservation.R;

public class Register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText fNameField = (EditText) findViewById(R.id.fNameField);
        final EditText lNameField = (EditText) findViewById(R.id.lNameField);
        final EditText usernameField = (EditText) findViewById(R.id.usernameField);
        final EditText passwordField = (EditText) findViewById(R.id.passwordField);
        final EditText emailAddressField = (EditText) findViewById(R.id.emailAddressField);

        final Button registerButton2 = (Button) findViewById(R.id.registerButton2);

    }
}
