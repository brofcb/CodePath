package com.mycompany.ibrahim.codepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Ibrahim", "Button Clicked");
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab the text the user inputted
                //put the text ino our text view once the 'change text button' is clicked
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText))
                {
                    ((TextView)findViewById(R.id.textView)).setText("Hello Ibrahim!");
                }
                else
                {
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Reset the text color back to default
                ((TextView)findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.black));

                //Reset  the background color colorAccent
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                //Reset the text back "Hello Ibrahim !"
                ((TextView)findViewById(R.id.textView)).setText("Hello from Ibrahim!");
            }
        });

        //grab the text the user inputted
        //put the text ino our text view once the 'change text button' is clicked
    }
}
