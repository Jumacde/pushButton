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
    Button meaageButton, clearButton;
    private ShowMessage showMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        meaageButton = findViewById(R.id.b);
        clearButton = findViewById(R.id.bc);
        showMessage = new ShowMessage_impl();

        meaageButton.setOnClickListener(bu -> buttonClick((Button)bu, "Button"));
        clearButton.setOnClickListener(cbu -> clearButtonClick((Button)cbu, "clear"));

        /*
        * ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        * */
    }

    private void buttonClick(Button bu, String buttonName) {
        showMessage.setText("Hello World!!");
        textView.setText(showMessage.getDisplay());
    }

    private void clearButtonClick(Button cbu, String buttonName) {
        showMessage.setText("");
        textView.setText(showMessage.getDisplay());
    }

}