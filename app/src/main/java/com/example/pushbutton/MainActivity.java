package com.example.pushbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pushbutton.impl.ShowMessage_impl;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    private ShowMessage showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        button = findViewById(R.id.b);
        showMessage = new ShowMessage_impl();

        button.setOnClickListener(v -> handleOperatorClick((Button)v, "Button"));

        /*
        * ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        * */
    }

    private void handleOperatorClick(Button v, String button) {
        showMessage.setText("Hello World!!");
        textView.setText(showMessage.getDisplay());
    }

}