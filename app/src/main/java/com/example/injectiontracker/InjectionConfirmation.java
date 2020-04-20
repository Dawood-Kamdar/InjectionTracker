package com.example.injectiontracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InjectionConfirmation extends AppCompatActivity {

    private int siteNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_injection_confirmation);

        siteNumber = this.getIntent().getIntExtra("siteNumber", 0);

        TextView view = this.findViewById(R.id.siteInjected);
        view.setText("Site " + siteNumber + " injected");
    }

    public void cancel(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }

    public void save(View view) {
        //TODO db stuff
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
