package com.manorup.timepassapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;

public class SecondActivity extends AppCompatActivity {
    Button button, button2;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        layout = findViewById(R.id.layout);

        Snackbar.make(layout,"Welcome MEssage",Snackbar.LENGTH_SHORT)
                        .setAction("Start", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                //your code here
                                Toast.makeText(SecondActivity.this, "Started", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.settings:
                Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "bi", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}