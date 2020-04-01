package com.example.injectiontracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.example.injectiontracker.Database.AppDatabase;
import com.example.injectiontracker.Entity.BodyPart;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = this.getApplicationContext();
        AppDatabase db = Room.inMemoryDatabaseBuilder(context, AppDatabase.class)
                .allowMainThreadQueries().build();

//        BodyPart bodyPart = new BodyPart();
//        bodyPart.bodyPartId = 5;
//        bodyPart.name = "test";
//
//        db.bodyPartDao().insertAll(bodyPart);
        BodyPart toDisplay = db.bodyPartDao().getAll().get(0);
        ((TextView)findViewById(R.id.textView)).setText(toDisplay.name);
        db.close();
    }
}
