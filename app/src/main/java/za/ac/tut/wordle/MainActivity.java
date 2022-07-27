package za.ac.tut.wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText, editText1, editText2, editText3, editText4,editText5, editText6, editText7, editText8, editText9, editText10, editText11, editText12, editText13, editText14, editText15, editText16, editText17, editText18, editText19, editText20, editText21,editText22, editText23, editText24;
    String word = "testa", guess, guess1, guess2, guess3, guess4;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);*/
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.g1);
        editText1 = findViewById(R.id.g2);
        editText2 = findViewById(R.id.g3);
        editText3 = findViewById(R.id.g4);
        editText4 = findViewById(R.id.g5);
        editText5 = findViewById(R.id.g6);
        editText6 = findViewById(R.id.g7);
        editText7 = findViewById(R.id.g8);
        editText8 = findViewById(R.id.g9);
        editText9 = findViewById(R.id.g10);
        editText10 = findViewById(R.id.g11);
        editText11 = findViewById(R.id.g12);
        editText12 = findViewById(R.id.g13);
        editText13 = findViewById(R.id.g14);
        editText14 = findViewById(R.id.g15);
        editText15 = findViewById(R.id.g16);
        editText16 = findViewById(R.id.g17);
        editText17 = findViewById(R.id.g18);
        editText18 = findViewById(R.id.g19);
        editText19 = findViewById(R.id.g20);
        editText20 = findViewById(R.id.g21);
        editText21 = findViewById(R.id.g22);
        editText22 = findViewById(R.id.g23);
        editText23 = findViewById(R.id.g24);
        editText24 = findViewById(R.id.g25);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guess = editText.getText().toString() + editText1.getText().toString() + editText2.getText().toString() + editText3.getText().toString() + editText4.getText().toString();
                guess1 = editText5.getText().toString() + editText6.getText().toString() + editText7.getText().toString() + editText8.getText().toString() + editText9.getText().toString();
                guess2 = editText10.getText().toString() + editText11.getText().toString() + editText12.getText().toString() + editText13.getText().toString() + editText14.getText().toString();
                guess3 = editText15.getText().toString() + editText16.getText().toString() + editText17.getText().toString() + editText18.getText().toString() + editText19.getText().toString();
                guess4 = editText20.getText().toString() + editText21.getText().toString() + editText22.getText().toString() + editText23.getText().toString() + editText24.getText().toString();

                if (guess.length() == 5 || guess1.length() == 5 || guess2.length() == 5 || guess4.length() == 5 || guess3.length() == 5) {
                    if (count == 5) {

                        Intent intent = new Intent(MainActivity.this, Results.class);

                        intent.putExtra("word", word);
                        intent.putExtra("results", "You Lose!");
                        startActivity(intent);

                        Toast.makeText(MainActivity.this, "Game over!", Toast.LENGTH_SHORT).show();
                    } else {
                        if (count == 0) {
                            if (guess.length() == 5) {
                                if (guess.equals(word)) {
                                    //Toast.makeText(MainActivity.this, "You win!", Toast.LENGTH_SHORT).show();

                                    Intent intent = new Intent(MainActivity.this, Results.class);

                                    intent.putExtra("results", "You Won!");
                                    startActivity(intent);
                                } else {
                                    String text;

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText.getText().toString().charAt(0);
                                        text = editText.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(0)) {
                                                editText.setTextColor(Color.GREEN);
                                                editText.setText(text);
                                            } else {
                                                editText.setTextColor(Color.YELLOW);
                                                editText.setText(text);
                                            }
                                        } else {
                                            editText.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        text = editText1.getText().toString();
                                        char t1 = editText1.getText().toString().charAt(0);

                                        if (t1 == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(1)) {
                                                editText1.setTextColor(Color.GREEN);
                                                editText1.setText(text);
                                            } else {
                                                editText1.setTextColor(Color.YELLOW);
                                                editText1.setText(text);
                                            }
                                        } else {
                                            editText1.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        text = editText2.getText().toString();
                                        char t = editText2.getText().toString().charAt(0);

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(2)) {
                                                editText2.setTextColor(Color.GREEN);
                                                editText2.setText(text);
                                            } else {
                                                editText2.setTextColor(Color.YELLOW);
                                                editText2.setText(text);
                                            }
                                        } else {
                                            editText2.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText3.getText().toString().charAt(0);
                                        text = editText3.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(3)) {
                                                editText3.setTextColor(Color.GREEN);
                                                editText3.setText(text);
                                            } else {
                                                editText3.setTextColor(Color.YELLOW);
                                                editText3.setText(text);
                                            }
                                        } else {
                                            editText3.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText4.getText().toString().charAt(0);
                                        text = editText4.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(4)) {
                                                editText4.setTextColor(Color.GREEN);
                                                editText4.setText(text);
                                            } else {
                                                editText4.setTextColor(Color.YELLOW);
                                                editText4.setText(text);
                                            }
                                        } else {
                                            editText4.setText(text);
                                        }
                                    }
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Invalid word!", Toast.LENGTH_SHORT).show();
                            }
                        } else if (count == 1) {
                            if (guess1.length() == 5) {
                                if (guess1.equals(word)) {
                                    Intent intent = new Intent(MainActivity.this, Results.class);

                                    intent.putExtra("results", "You Won!");
                                    startActivity(intent);
                                } else {
                                    String text;

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText5.getText().toString().charAt(0);
                                        text = editText5.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(0)) {
                                                editText5.setTextColor(Color.GREEN);
                                                editText5.setText(text);
                                            } else {
                                                editText5.setTextColor(Color.YELLOW);
                                                editText5.setText(text);
                                            }
                                        } else {
                                            editText5.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText6.getText().toString().charAt(0);
                                        text = editText6.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(1)) {
                                                editText6.setTextColor(Color.GREEN);
                                                editText6.setText(text);
                                            } else {
                                                editText6.setTextColor(Color.YELLOW);
                                                editText6.setText(text);
                                            }
                                        } else {
                                            editText6.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText7.getText().toString().charAt(0);
                                        text = editText7.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(2)) {
                                                editText7.setTextColor(Color.GREEN);
                                                editText7.setText(text);
                                            } else {
                                                editText7.setTextColor(Color.YELLOW);
                                                editText7.setText(text);
                                            }
                                        } else {
                                            editText7.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText8.getText().toString().charAt(0);
                                        text = editText8.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(3)) {
                                                editText8.setTextColor(Color.GREEN);
                                                editText8.setText(text);
                                            } else {
                                                editText8.setTextColor(Color.YELLOW);
                                                editText8.setText(text);
                                            }
                                        } else {
                                            editText8.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText9.getText().toString().charAt(0);
                                        text = editText9.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(4)) {
                                                editText9.setTextColor(Color.GREEN);
                                                editText9.setText(text);
                                            } else {
                                                editText9.setTextColor(Color.YELLOW);
                                                editText9.setText(text);
                                            }
                                        } else {
                                            editText9.setText(text);
                                        }
                                    }
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Invalid word!", Toast.LENGTH_SHORT).show();
                            }
                        } else if (count == 2) {
                            if (guess2.length() == 5) {
                                if (guess2.equals(word)) {
                                    Intent intent = new Intent(MainActivity.this, Results.class);

                                    intent.putExtra("results", "You Won!");
                                    startActivity(intent);
                                } else {
                                    String text;

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText10.getText().toString().charAt(0);
                                        text = editText10.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(0)) {
                                                editText10.setTextColor(Color.GREEN);
                                                editText10.setText(text);
                                            } else {
                                                editText10.setTextColor(Color.YELLOW);
                                                editText10.setText(text);
                                            }
                                        } else {
                                            editText10.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText11.getText().toString().charAt(0);
                                        text = editText11.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(1)) {
                                                editText11.setTextColor(Color.GREEN);
                                                editText11.setText(text);
                                            } else {
                                                editText11.setTextColor(Color.YELLOW);
                                                editText11.setText(text);
                                            }
                                        } else {
                                            editText11.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText12.getText().toString().charAt(0);
                                        text = editText12.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(2)) {
                                                editText12.setTextColor(Color.GREEN);
                                                editText12.setText(text);
                                            } else {
                                                editText12.setTextColor(Color.YELLOW);
                                                editText12.setText(text);
                                            }
                                        } else {
                                            editText12.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText13.getText().toString().charAt(0);
                                        text = editText13.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(3)) {
                                                editText13.setTextColor(Color.GREEN);
                                                editText13.setText(text);
                                            } else {
                                                editText13.setTextColor(Color.YELLOW);
                                                editText13.setText(text);
                                            }
                                        } else {
                                            editText13.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText14.getText().toString().charAt(0);
                                        text = editText14.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(4)) {
                                                editText14.setTextColor(Color.GREEN);
                                                editText14.setText(text);
                                            } else {
                                                editText14.setTextColor(Color.YELLOW);
                                                editText14.setText(text);
                                            }
                                        } else {
                                            editText14.setText(text);
                                        }
                                    }
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Invalid word!", Toast.LENGTH_SHORT).show();
                            }
                        } else if (count == 3) {
                            if (guess3.length() == 5) {
                                if (guess3.equals(word)) {
                                    Intent intent = new Intent(MainActivity.this, Results.class);

                                    intent.putExtra("results", "You Won!");
                                    startActivity(intent);
                                } else {
                                    String text;

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText15.getText().toString().charAt(0);
                                        text = editText15.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(0)) {
                                                editText15.setTextColor(Color.GREEN);
                                                editText15.setText(text);
                                            } else {
                                                editText15.setTextColor(Color.YELLOW);
                                                editText15.setText(text);
                                            }
                                        } else {
                                            editText15.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText16.getText().toString().charAt(0);
                                        text = editText16.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(1)) {
                                                editText16.setTextColor(Color.GREEN);
                                                editText16.setText(text);
                                            } else {
                                                editText16.setTextColor(Color.YELLOW);
                                                editText16.setText(text);
                                            }
                                        } else {
                                            editText16.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText17.getText().toString().charAt(0);
                                        text = editText17.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(2)) {
                                                editText17.setTextColor(Color.GREEN);
                                                editText17.setText(text);
                                            } else {
                                                editText17.setTextColor(Color.YELLOW);
                                                editText17.setText(text);
                                            }
                                        } else {
                                            editText17.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText18.getText().toString().charAt(0);
                                        text = editText18.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(3)) {
                                                editText18.setTextColor(Color.GREEN);
                                                editText18.setText(text);
                                            } else {
                                                editText18.setTextColor(Color.YELLOW);
                                                editText18.setText(text);
                                            }
                                        } else {
                                            editText18.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText19.getText().toString().charAt(0);
                                        text = editText19.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(4)) {
                                                editText19.setTextColor(Color.GREEN);
                                                editText19.setText(text);
                                            } else {
                                                editText19.setTextColor(Color.YELLOW);
                                                editText19.setText(text);
                                            }
                                        } else {
                                            editText19.setText(text);
                                        }
                                    }
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Invalid word!", Toast.LENGTH_SHORT).show();
                            }
                        } else if (count == 5) {
                            if (guess4.length() == 5) {
                                if (guess4.equals(word)) {
                                    Intent intent = new Intent(MainActivity.this, Results.class);

                                    intent.putExtra("results", "You Won!");
                                    startActivity(intent);
                                } else {
                                    String text;

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText20.getText().toString().charAt(0);
                                        text = editText20.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(0)) {
                                                editText20.setTextColor(Color.GREEN);
                                                editText20.setText(text);
                                            } else {
                                                editText20.setTextColor(Color.YELLOW);
                                                editText20.setText(text);
                                            }
                                        } else {
                                            editText20.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText21.getText().toString().charAt(0);
                                        text = editText21.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(1)) {
                                                editText21.setTextColor(Color.GREEN);
                                                editText21.setText(text);
                                            } else {
                                                editText21.setTextColor(Color.YELLOW);
                                                editText21.setText(text);
                                            }
                                        } else {
                                            editText21.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText22.getText().toString().charAt(0);
                                        text = editText22.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(2)) {
                                                editText22.setTextColor(Color.GREEN);
                                                editText22.setText(text);
                                            } else {
                                                editText22.setTextColor(Color.YELLOW);
                                                editText22.setText(text);
                                            }
                                        } else {
                                            editText22.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText23.getText().toString().charAt(0);
                                        text = editText23.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(3)) {
                                                editText23.setTextColor(Color.GREEN);
                                                editText23.setText(text);
                                            } else {
                                                editText23.setTextColor(Color.YELLOW);
                                                editText23.setText(text);
                                            }
                                        } else {
                                            editText23.setText(text);
                                        }
                                    }

                                    for (int i = 0; i < word.length(); i++) {
                                        char t = editText24.getText().toString().charAt(0);
                                        text = editText24.getText().toString();

                                        if (t == (word.charAt(i))) {
                                            if ((word.charAt(i)) == word.charAt(4)) {
                                                editText24.setTextColor(Color.GREEN);
                                                editText24.setText(text);
                                            } else {
                                                editText24.setTextColor(Color.YELLOW);
                                                editText24.setText(text);
                                            }
                                        } else {
                                            editText24.setText(text);
                                        }
                                    }
                                }
                            } else {
                                Toast.makeText(MainActivity.this, "Invalid word!", Toast.LENGTH_SHORT).show();
                            }
                        }

                        count++;
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Invalid word!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}