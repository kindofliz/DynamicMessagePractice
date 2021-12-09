package com.example.dynamicmessagepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ComposeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);

        //This takes the 'briefcase' with the name from the main screen intent
        //puts it in a new variable 'name' and displays it on the new screen
        Intent i = getIntent();
        String name = i.getStringExtra("NAME"); //gets the string names NAME from the 'briefcase'

        //Checks if a name was actually retrieved (the string isn't null)
        //and then
        //Sets the retrieved name to the textview on this screen
        if(name == null) {
            ((TextView)findViewById(R.id.textView)).setText("Composing message: ");
        } else {
            ((TextView)findViewById(R.id.textView)).setText(name);
        }


    }
}