package za.ac.tut.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    private TextView textView, textView2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button1);

        String name = getIntent().getStringExtra("results");
        String word = getIntent().getStringExtra("word");

        if(name.contains("Won")){
            textView.setTextColor(Color.GREEN);
            textView.setText(name);
        }else{
            textView2.setText("Guessed Word: " + word);
            textView.setTextColor(Color.RED);
            textView.setText(name);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Results.this, MainActivity.class));
            }
        });

    }
}