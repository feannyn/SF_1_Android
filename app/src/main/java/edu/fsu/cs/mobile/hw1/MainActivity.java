package edu.fsu.cs.mobile.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hWTextView);
        button = findViewById(R.id.hWButton);

        button.setOnClickListener(theOnClickListener);

    }

    View.OnClickListener theOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            textView.setText("Nic Feanny");
        }
    };

}
