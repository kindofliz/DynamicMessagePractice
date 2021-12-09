package com.example.dynamicmessagepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void composeMessage(View view) {
        //This launches the new activity (next screen) on button click when its assigned to this method)
        Intent i = new Intent(this, ComposeMessageActivity.class);

        //This takes a name input on this screen in the button name
        //stores it in variable name
        //and puts in a 'briefcase' to carry to the next activity
        String name = ((Button)view).getText().toString();
        i.putExtra("NAME", name);
        startActivity(i);
    }
}