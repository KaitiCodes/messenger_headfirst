package com.kaiti.messenger;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

        //onSendMessage is the method to connect second activity using intent when button is clicked
    public void onSendMessage(View view){
        //Intent intent = new Intent(this, ReceiveMessageActivity.class); //creating an EXPLICIT Intent
        EditText messageView = (EditText)findViewById(R.id.message); //get text that is in edit text id/message
        String messageText = messageView.getText().toString(); //get the text from editable text field
        //intent.putExtra("message", messageText); //add text to intent using id message
        Intent intent = new Intent(Intent.ACTION_SEND);//IMPLICIT INTENT
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        //startActivity(intent);
        startActivity(chosenIntent);
    }
}
