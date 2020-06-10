package com.team8.scientificcalculator;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;

public class SecondActivity extends AppCompatActivity {
    String process = "";
    Boolean dotPressed = false;
    Boolean bracketPressed = false;
    boolean currentTheme = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific_calculator);
        Intent intent = getIntent();

        final TextView numInput = findViewById(R.id.numInput);
        final TextView numOutput = findViewById(R.id.numOutput);

        numInput.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT1));
        numOutput.setText(intent.getStringExtra(MainActivity.EXTRA_TEXT2));
        if(intent.getStringExtra(MainActivity.CURRENT_PROCESS) != null)
            process = intent.getStringExtra(MainActivity.CURRENT_PROCESS);
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
                bracketPressed = false;
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

        findViewById(R.id.btnConstant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + Math.E);
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnPi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + Math.PI);
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnPower).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "^");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnRoot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "v/");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnSin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "sin");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnCos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "cos");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnTan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "tan");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnLn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "ln");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnLog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "log");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnProd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText(process + "!");
                process = numInput.getText().toString();
                dotPressed = false;
            }
        });

        findViewById(R.id.btnBracket).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bracketPressed){
                    numInput.setText(process + ")");
                    process = numInput.getText().toString();
                    bracketPressed = false;
                }else{
                    numInput.setText(process + "(");
                    process = numInput.getText().toString();
                    bracketPressed = true;
                }
            }
        });

        findViewById(R.id.btnBackspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numInput.length() == 0){
                    //do nothing
                }else{
                    numInput.setText(numInput.getText().toString().trim().subSequence(0, numInput.length() - 1));
                    process = numInput.getText().toString();
                }
            }
        });

        //still has problem after result .0
        findViewById(R.id.btnDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dotPressed = false && numOutput.getText().equals("")) {
                    numInput.setText(process + ".");
                    process = numInput.getText().toString();
                    dotPressed = true;
                }else{
                    //do nothing
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
                    numInput.setText("");
                    process = obj.toString();
                }catch(Exception e){
                    finalresult = "ERROR";
                    Log.i("ERORR", "" + e.getStackTrace());
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
                Toast.makeText(this,"~Basic mode~", Toast.LENGTH_SHORT).show();
                openBasic();
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

    public void openBasic(){
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);

        String currentInput = numInput.getText().toString();
        String currentOutput = numOutput.getText().toString();
        String currentProcesss = process;
        int currentBgcolor, currentTextColor;

        if(currentTheme) {
            currentBgcolor = WHITE;
            currentTextColor = BLACK;
        }else{
            currentBgcolor = BLACK;
            currentTextColor = WHITE;
        }

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.EXTRA_TEXT1,currentInput);
        intent.putExtra(MainActivity.EXTRA_TEXT2,currentOutput);
        intent.putExtra(MainActivity.CURRENT_PROCESS,currentProcesss);
        intent.putExtra(MainActivity.CURRENT_BG_COLOR,currentBgcolor);
        intent.putExtra(MainActivity.CURRENT_TEXT_COLOR,currentTextColor);

        startActivity(intent);
    }

    public void changeTheme() {
        LinearLayout display = findViewById(R.id.display_layout);
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);


        if (currentTheme) {
            display.setBackgroundColor(BLACK);
            numInput.setTextColor(WHITE);
            numOutput.setTextColor(WHITE);
            currentTheme = false;
        } else {
            display.setBackgroundColor(WHITE);
            numInput.setTextColor(BLACK);
            numOutput.setTextColor(BLACK);
            currentTheme = true;
        }
    }
}
