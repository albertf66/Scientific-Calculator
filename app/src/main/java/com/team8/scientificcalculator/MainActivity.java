package com.team8.scientificcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {
    public static final String CURRENT_RESULT = "com.team8.application.scientificcalculator.CURRENT_RESULT";
    public static final String CURRENT_PROCESS = "com.team8.application.scientificcalculator.CURRENT_PROCESS";
    public static final String CURRENT_BG_COLOR = "com.team8.application.scientificcalculator.CURRENT_BG_COLOR";
    public static final String CURRENT_TEXT_COLOR = "com.team8.application.scientificcalculator.CURRENT_TEXT_COLOR";

    String process = "";
    Boolean dot_pressed = false, check_bracket = false,
            current_theme = false, operator_pressed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_calculator);
        Intent intent = getIntent();

        final TextView numInput = findViewById(R.id.numInput);
        final TextView numOutput = findViewById(R.id.numOutput);

        numOutput.setText(intent.getStringExtra(MainActivity.CURRENT_RESULT));

        if(intent.getStringExtra(CURRENT_PROCESS) != null)
            process = intent.getStringExtra(CURRENT_PROCESS);

        if(intent.getIntExtra(MainActivity.CURRENT_BG_COLOR, 0) == WHITE){
            findViewById(R.id.display_layout).setBackgroundColor(WHITE);
            numInput.setTextColor(BLACK);
            numOutput.setTextColor(BLACK);
            current_theme = true;
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
                operator_pressed = false;
            }
        });

        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "1");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "2");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "3");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "4");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "5");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "6");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "7");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "8");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "9");
                process = numInput.getText().toString();
                operator_pressed = false;
            }
        });

        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText("");
                numOutput.setText("");
                process = "";
                check_bracket = false;
                dot_pressed = false;
            }
        });

        findViewById(R.id.btnPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0){
                        numInput.setText("0+");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    } else {
                        numInput.setText(process + "+");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    }
                    operator_pressed = true;
                }
            }
        });

        findViewById(R.id.btnMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if (numInput.length() == 0 && numOutput.length() == 0) {
                        numInput.setText("0-");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    } else {
                        numInput.setText(process + "-");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    }
                    operator_pressed = true;
                }
            }
        });

        findViewById(R.id.btnMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0){
                        numInput.setText("0x");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    } else {
                        numInput.setText(process + "x");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    }
                    operator_pressed = true;
                }
            }
        });

        findViewById(R.id.btnDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0){
                        numInput.setText("0/");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    } else {
                        numInput.setText(process + "/");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    }
                    operator_pressed = true;
                }
            }
        });

        findViewById(R.id.btnPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0){
                        numInput.setText("0%");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    } else {
                        numInput.setText(process + "%");
                        process = numInput.getText().toString();
                        dot_pressed = false;
                    }
                    operator_pressed = true;
                }
            }
        });

        findViewById(R.id.btnBracket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check_bracket){
                    numInput.setText(process + ")");
                    process = numInput.getText().toString();
                    check_bracket = false;
                }else{
                    numInput.setText(process + "(");
                    process = numInput.getText().toString();
                    check_bracket = true;
                }
            }
        });
        findViewById(R.id.btnBackspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numInput.length() != 0){
                    if(numInput.getText().toString().charAt(numInput.length()- 1)  == '.') {
                        dot_pressed = false;
                    }
                    numInput.setText(numInput.getText().toString().trim().subSequence(0, numInput.length() - 1));
                    process = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.btnBackspace).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                numInput.setText("");
                numOutput.setText("");
                process = "";
                check_bracket = false;
                dot_pressed = false;
                return true;
            }
        });

        findViewById(R.id.btnDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!dot_pressed){
                    if(numInput.length() != 0){
                        if(numInput.getText().toString().charAt(numInput.length() - 1) == '+' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '-' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == 'x' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '÷' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '%' ||
                            numInput.getText().toString().charAt(numInput.length() - 1) == '(' ) {
                            numInput.setText(process + "0.");
                            process = numInput.getText().toString();
                            dot_pressed = true;
                        }else{
                            numInput.setText(process + ".");
                            process = numInput.getText().toString();
                            dot_pressed = true;
                        }
                    }else if(numOutput.getText().length() != 0){
                        for(int i = 0; i < numOutput.length() - 1; i++){
                            if(numOutput.getText().toString().charAt(i) == '.')
                                dot_pressed = true;
                        }
                    }
                    else{
                        numInput.setText(process + "0.");
                        process = numInput.getText().toString();
                        dot_pressed = true;
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
                    finalresult = "NaN";
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
                if(current_theme) {
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
        TextView numOutput = findViewById(R.id.numOutput);

        String currentOutput = numOutput.getText().toString();
        String currentProcess = process;
        int currentBgcolor;
        int currentTextColor;

        if(current_theme) {
            currentBgcolor = WHITE;
            currentTextColor = BLACK;
        }else{
            currentBgcolor = BLACK;
            currentTextColor = WHITE;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(CURRENT_RESULT,currentOutput);
        intent.putExtra(CURRENT_PROCESS,currentProcess);
        intent.putExtra(CURRENT_BG_COLOR,currentBgcolor);
        intent.putExtra(CURRENT_TEXT_COLOR,currentTextColor);
        startActivity(intent);
    }

    public void changeTheme(){
        LinearLayout display = findViewById(R.id.display_layout);
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);

        if(current_theme) {
            display.setBackgroundColor(BLACK);
            numInput.setTextColor(WHITE);
            numOutput.setTextColor(WHITE);
            current_theme = false;
        }else{
            display.setBackgroundColor(WHITE);
            numInput.setTextColor(BLACK);
            numOutput.setTextColor(BLACK);
            current_theme = true;
        }
    }
}
