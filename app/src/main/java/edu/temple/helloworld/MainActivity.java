package edu.temple.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeText();
    }

    // make button click change TextView
    private void changeText() {
        final TextView changingText = (TextView) findViewById(R.id.textView);
        Button TextButton = (Button) findViewById(R.id.button);
        TextButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                changingText.setText(R.string.message);
            }
        });
    }
}