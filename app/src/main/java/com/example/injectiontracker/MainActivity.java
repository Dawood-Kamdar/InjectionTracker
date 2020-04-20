package com.example.injectiontracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.injectiontracker.Database.AppDatabase;
import com.example.injectiontracker.Entity.BodyPart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = this.findViewById(R.id.home_done_layout);
        view.setVisibility(View.VISIBLE);
//        Toolbar myToolbar = findViewById(R.id.my_toolbar);
//        setSupportActionBar(myToolbar);
//        Context context = this.getApplicationContext();
//        AppDatabase db = Room.inMemoryDatabaseBuilder(context, AppDatabase.class)
//                .allowMainThreadQueries().build();

//        BodyPart bodyPart = new BodyPart();
//        bodyPart.bodyPartId = 5;
//        bodyPart.name = "test";

//        db.bodyPartDao().insertAll(bodyPart);
//        BodyPart toDisplay = db.bodyPartDao().getAll().get(0);
//        ((TextView)findViewById(R.id.textView)).setText(toDisplay.name);
//        db.close();

    }

    public void seeSiteMap(View view) {
        Intent intent = new Intent(this, SiteMap.class);
        this.startActivity(intent);
    }

    public void inject(View view) {
        Intent intent = new Intent(this, InjectionConfirmation.class);
        TextView textView = this.findViewById(R.id.siteNumber);
        int siteNumber = Integer.parseInt(textView.getText().toString());
        intent.putExtra("siteNumber", siteNumber);
        this.startActivity(intent);
    }
}
