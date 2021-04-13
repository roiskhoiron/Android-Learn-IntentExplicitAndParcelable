package com.example.inentexplicitandparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithObject extends AppCompatActivity {
    public static final String EXTRA_PERSON ="extra_person";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);

        TextView tvObject = findViewById(R.id.tv_object_received);
        Person person = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = "Nama : "+ person.getName() + ",\nEmail : " + person.getEmail() + ",\nUsia : " + person.getAge() + ",\nKota : " + person.getCity();

        tvObject.setText(text);
    }
}
