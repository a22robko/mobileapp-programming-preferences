package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences myPreferences;
    private SharedPreferences.Editor editor;
    private TextView prefTextRef;
    private EditText newPrefText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        myPreferences = getSharedPreferences("MyAppPreferences", MODE_PRIVATE);
        editor = myPreferences.edit();

        prefTextRef = findViewById(R.id.prefText);
        prefTextRef.setText(myPreferences.getString("MyEditTextValue", "Hej hur mår du."));

        newPrefText = findViewById(R.id.settingseditview);
    }

    public void savePref() {
        String text = newPrefText.getText().toString();
        editor.putString("MyEditTextValue", text);
        editor.apply();

        prefTextRef.setText(text);
    }
}