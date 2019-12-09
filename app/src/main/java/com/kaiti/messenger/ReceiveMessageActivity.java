package com.kaiti.messenger;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message"; //extra value passing in the intent

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent(); //create Intent
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);//get intent and the message in it using getStringExtra()
        TextView messageView = findViewById(R.id.message);
        messageView.setText(messageText);//add text to the message text view

        //when user clicks button the onSendMessage method is called. If intent is OK the ReceiveMessageActivity
        //will start. The activity layout updates and displays extra text included in the intent.
    }
}
