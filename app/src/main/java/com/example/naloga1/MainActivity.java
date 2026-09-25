package com.example.naloga1;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void showToast(View view){
        Toast.makeText(this, "My first android studio application!", Toast.LENGTH_SHORT).show();
    }
    public void showSnackf(View view){
        Snackbar.make(view, "Just another option for button", Snackbar.LENGTH_SHORT).show();

    }
    public void showSnack(View view){
        Snackbar.make(view, "Just another option for button", Snackbar.LENGTH_SHORT).show();
    }

}



