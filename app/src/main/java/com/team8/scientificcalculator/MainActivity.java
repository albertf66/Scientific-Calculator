package com.team8.scientificcalculator;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT1 = "com.team8.application.scientificcalculator.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.team8.application.scientificcalculator.EXTRA_TEXT2";
    public static final String CURRENT_PROCESS = "com.team8.application.scientificcalculator.CURRENT_PROCESS";
    public static final String CURRENT_BG_COLOR = "com.team8.application.scientificcalculator.CURRENT_BG_COLOR";
    public static final String CURRENT_TEXT_COLOR = "com.team8.application.scientificcalculator.CURRENT_TEXT_COLOR";

    String process = "";
    Boolean dotPressed = false;
    Boolean checkBracket = false;
    Boolean currentTheme = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_calculator);
        Intent intent = getIntent();

        final TextView numInput = findViewById(R.id.numInput);
        final TextView numOutput = findViewById(R.id.numOutput);

        numInput.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT1));
        numOutput.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT2));
        if(intent.getStringExtra(CURRENT_PROCESS) != null)
            process = intent.getStringExtra(CURRENT_PROCESS);

        if(intent.getIntExtra(MainActivity.CURRENT_BG_COLOR, 0) == WHITE){
            findViewById(R.id.display_layout).setBackgroundColor(WHITE);
            numInput.setTextColor(BLACK);
            numOutput.setTextColor(BLACK);
            currentTheme = true;
        }else{
            findViewById(R.id.display_layout).setBackgroundColor(BLACK);
            numInput.setTextColor(WHITE);
            numOutput.setTextColor(WHITE);
        }

        findViewById(R.id.num0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "0");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "1");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "2");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "3");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "4");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "5");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "6");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "7");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "8");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "9");
                process = numInput.getText().toString();
            }
        });

        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText("");
                numOutput.setText("");
                process = "";
                checkBracket = false;
                dotPressed = false;
            }
        });

        findViewById(R.id.btnPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "+");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "-");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "x");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "/");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "%");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnBracket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBracket){
                    numInput.setText(process + ")");
                    process = numInput.getText().toString();
                    checkBracket = false;
                }else{
                    numInput.setText(process + "(");
                    process = numInput.getText().toString();
                    checkBracket = true;
                }
            }
        });
        findViewById(R.id.btnBackspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numInput.length() == 0){
                    //do nothing
                }else{
                    if(numInput.getText().toString().charAt(numInput.length()- 1)  == '.') {
                        dotPressed = false;
                    }
                    numInput.setText(numInput.getText().toString().trim().subSequence(0, numInput.length() - 1));
                    process = numInput.getText().toString();
                }
            }
        });
        findViewById(R.id.btnDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dotPressed) {
                    // do nothing
                }else{
                    if(numInput.getText().length() != 0){
                        if(numInput.getText().toString().charAt(numInput.length() - 1) == '+' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '-' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == 'x' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '÷' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '%' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '(' ) {
                            numInput.setText(process + "0.");
                            process = numInput.getText().toString();
                            dotPressed = true;
                        }else{
                            numInput.setText(process + ".");
                            process = numInput.getText().toString();
                            dotPressed = true;
                        }
                    }else if(numOutput.getText().length() != 0){
                        for(int i = 0; i < numOutput.length() - 1; i++){
                            if(numOutput.getText().toString().charAt(i) == '.')
                                dotPressed = true;
                        }
                    }
                    else{
                        numInput.setText(process + "0.");
                        process = numInput.getText().toString();
                        dotPressed = true;
                    }
                }
            }
        });

        findViewById(R.id.btnEqual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                process = numInput.getText().toString();
                process = process.replaceAll("x", "*");
                process = process.replaceAll("%", "/100");
                Context con = Context.enter();
                con.setOptimizationLevel(-1);
                String finalresult;
                try{
                    Scriptable scope = con.initSafeStandardObjects();
                    Object obj = con.evaluateString(scope, process, "<cmd>", 1, null);
                    finalresult = obj.toString();
                    if((Double.parseDouble(finalresult) % 1) == 0)
                        finalresult = "" + Math.round(Double.parseDouble(finalresult));
                    numInput.setText("");
                    process = finalresult;
                }catch(Exception e){
                    finalresult = "ERROR";
                }
                numOutput.setText(finalresult);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"~Scientific Mode~", Toast.LENGTH_SHORT).show();
                openScientific();
                return true;
            case R.id.item2:
                if(currentTheme) {
                    Toast.makeText(this, "~Black theme~", Toast.LENGTH_SHORT).show();
                    item.setTitle("White theme");
                    changeTheme();
                }else{
                    Toast.makeText(this, "~White theme~", Toast.LENGTH_SHORT).show();
                    item.setTitle("Black theme");
                    changeTheme();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openScientific(){
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);

        String currentInput = numInput.getText().toString();
        String currentOutput = numOutput.getText().toString();
        String currentProcess = process;
        int currentBgcolor;
        int currentTextColor;

        if(currentTheme) {
            currentBgcolor = WHITE;
            currentTextColor = BLACK;
        }else{
            currentBgcolor = BLACK;
            currentTextColor = WHITE;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT1,currentInput);
        intent.putExtra(EXTRA_TEXT2,currentOutput);
        intent.putExtra(CURRENT_PROCESS,currentProcess);
        intent.putExtra(CURRENT_BG_COLOR,currentBgcolor);
        intent.putExtra(CURRENT_TEXT_COLOR,currentTextColor);
        startActivity(intent);
    }

    public void changeTheme(){
        LinearLayout display = findViewById(R.id.display_layout);
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);

        if(currentTheme) {
            display.setBackgroundColor(BLACK);
            numInput.setTextColor(WHITE);
            numOutput.setTextColor(WHITE);
            currentTheme = false;
        }else{
            display.setBackgroundColor(WHITE);
            numInput.setTextColor(BLACK);
            numOutput.setTextColor(BLACK);
            currentTheme = true;
        }
    }
}
