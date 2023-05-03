package com.example.project;

public class secondactivity {

    SharedPreferences myPreferences;

myPreferences = getSharedPreferences("MyAppPreferences", MODE_PRIVATE);

        EditText editText = findViewById(R.id.my_edit_text);

        String text = editText.getText().toString();
        SharedPreferences.Editor editor = myPreferences.edit();
        editor.putString("MyEditTextValue", text);
        editor.apply();

  String value = myPreferences.getString("MyEditTextValue", "")

}