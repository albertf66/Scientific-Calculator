package com.team8.scientificcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.WHITE;

public class SecondActivity extends AppCompatActivity {
    String process = "", operator = "", processNumber = "", prodNumber = "";
    Double numberOne, numberTwo;
    Boolean dot_pressed = false, current_theme = false, operator_pressed = false,
            special_operator = false, percent_pressed = false, pi_or_cons_pressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific_calculator);
        Intent intent = getIntent();

        final TextView numInput = findViewById(R.id.numInput);
        final TextView numOutput = findViewById(R.id.numOutput);

        numOutput.setText(intent.getStringExtra(MainActivity.CURRENT_RESULT));

        if(intent.getStringExtra(MainActivity.CURRENT_PROCESS) != null)
            process = intent.getStringExtra(MainActivity.CURRENT_PROCESS);
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
                if(!special_operator) {
                    numInput.setText(processNumber + "0");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "1");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "2");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "3");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "4");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "5");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "6");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "7");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "8");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!special_operator) {
                    numInput.setText(processNumber + "9");
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput.setText("");
                numOutput.setText("");
                process = "";
                operator = "";
                processNumber = "";
                dot_pressed = false;
                percent_pressed = false;
                operator_pressed = false;
                special_operator = false;
                pi_or_cons_pressed = false;
            }
        });

        findViewById(R.id.btnPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0 + ";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " + ";
                        else
                            process = numberOne + " + ";
                    }else{
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " + ";
                        else
                            process = numberOne + " + ";
                    }
                    operator = "add";
                    numInput.setText("");
                    numOutput.setText("+");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0 - ";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " - ";
                        else
                            process = numberOne + " - ";
                    }else{
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " - ";
                        else
                            process = numberOne + " - ";
                    }
                    operator = "minus";
                    numInput.setText("");
                    numOutput.setText("-");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0 x ";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " x ";
                        else
                            process = numberOne + " x ";
                    }else{
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " x ";
                        else
                            process = numberOne + " x ";
                    }

                    operator = "multiply";
                    numInput.setText("");
                    numOutput.setText("x");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0 / ";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " / ";
                        else
                            process = numberOne + " / ";
                    }else{
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " / ";
                        else
                            process = numberOne + " / ";
                    }
                    operator = "divide";
                    numInput.setText("");
                    numOutput.setText("/");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0%";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        prodNumber = numberOne + "";
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + "%";
                        else
                            process = numberOne + "%";
                    }else{
                        prodNumber = numInput.getText().toString();
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + "%";
                        else
                            process = numberOne + "%";
                    }
                    operator = "percent";
                    numInput.setText(process);
                    numOutput.setText("");
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                    special_operator = true;
                }
            }
        });

        findViewById(R.id.btnConstant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!pi_or_cons_pressed){
                    if(numInput.length() == 0){
                        numInput.setText(Math.E + "");
                        processNumber = numInput.getText().toString();
                        pi_or_cons_pressed = true;
                    }
                }
            }
        });

        findViewById(R.id.btnPi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!pi_or_cons_pressed){
                    if(numInput.length() == 0){
                        numInput.setText(Math.PI + "");
                        processNumber = numInput.getText().toString();
                    }
                    pi_or_cons_pressed = true;
                }
            }
        });

        findViewById(R.id.btnPower).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0 ^ ";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " ^ ";
                        else
                            process = numberOne + " ^ ";
                    }else{
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " ^ ";
                        else
                            process = numberOne + " ^ ";
                    }
                    operator = "power";
                    numInput.setText("");
                    numOutput.setText("^");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnRoot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed && numInput.length() == 0) {
                    process = "√";
                    operator = "root";
                    numInput.setText("");
                    numOutput.setText("√");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnSin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed && numInput.length() == 0) {
                    process = "sin(";
                    operator = "sin";
                    numInput.setText("");
                    numOutput.setText("sin");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnCos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed && numInput.length() == 0) {
                    process = "cos(";
                    operator = "cos";
                    numInput.setText("");
                    numOutput.setText("cos");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnTan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed && numInput.length() == 0) {
                    process = "tan(";
                    operator = "tan";
                    numInput.setText("");
                    numOutput.setText("tan");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnLn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed && numInput.length() == 0) {
                    process = "ln(";
                    operator = "ln";
                    numInput.setText("");
                    numOutput.setText("ln");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnLog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed && numInput.length() == 0) {
                    process = "log(";
                    operator = "log";
                    numInput.setText("");
                    numOutput.setText("log");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnProd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0 && numOutput.length() == 0) {
                        numberOne = 0.0;
                        process = "0!";
                    }else if(numOutput.length() != 0){
                        prodNumber = numOutput.getText().toString();
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + "!";
                        else
                            process = numberOne + "!";
                    }else{
                        prodNumber = numInput.getText().toString();
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + "!";
                        else
                            process = numberOne + "!";
                    }
                    operator = "prod";
                    numInput.setText(process);
                    numOutput.setText("");
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                    special_operator = true;
                }
            }
        });

        findViewById(R.id.btnModulus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!operator_pressed) {
                    if(numInput.length() == 0) {
                        numberOne = 0.0;
                        process = "0 Mod ";
                    }else if(numOutput.length() != 0){
                        numberOne = Double.parseDouble(numOutput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " Mod ";
                        else
                            process = numberOne + " Mod ";
                    }else{
                        numberOne = Double.parseDouble(numInput.getText().toString());
                        if(numberOne % 1 == 0)
                            process = Math.round(numberOne) + " Mod ";
                        else
                            process = numberOne + " Mod ";
                    }
                    operator = "modulus";
                    numInput.setText("");
                    numOutput.setText("Mod");
                    dot_pressed = false;
                    operator_pressed = true;
                    processNumber = "";
                    pi_or_cons_pressed = false;
                }
            }
        });

        findViewById(R.id.btnBackspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numInput.length() != 0){
                    if(processNumber.charAt(processNumber.length() - 1) == '.'){
                        dot_pressed = false;
                    }
                    numInput.setText(numInput.getText().toString().trim().subSequence(0, numInput.length() - 1));
                    processNumber = numInput.getText().toString();
                }
            }
        });

        findViewById(R.id.btnBackspace).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                numInput.setText("");
                process = "";
                operator = "";
                processNumber = "";
                dot_pressed = false;
                percent_pressed = false;
                operator_pressed = false;
                special_operator = false;
                pi_or_cons_pressed = false;
                return true;
            }
        });
        findViewById(R.id.btnDot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!dot_pressed){
                    if(numInput.length() == 0){
                        numInput.setText("0.");
                        processNumber = numInput.getText().toString();
                    }else{
                        numInput.setText(processNumber + ".");
                        processNumber = numInput.getText().toString();
                    }
                }
                dot_pressed = true;
            }
        });

        findViewById(R.id.btnEqual).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(!operator_pressed && numInput.length() == 0){
                        numOutput.setText("NaN");
                    }else if(numOutput.length() == 0 && numInput.length() > 0 && !operator_pressed){
                        numOutput.setText(numInput.getText().toString());
                    }else if(operator_pressed){
                        String result;
                        switch(operator){
                            default:
                                break;
                            case("add"):
                                try {
                                    numberTwo = Double.parseDouble(numInput.getText().toString());
                                    if((numberOne + numberTwo) % 1 == 0)
                                        numOutput.setText(Math.round(numberOne + numberTwo) + "");
                                    else
                                        numOutput.setText(numberOne + numberTwo + "");
                                    numInput.setText(process + processNumber);
                                    process = numOutput.getText().toString();
                                }catch (Exception e){
                                    numOutput.setText("NaN");
                                }
                                break;
                            case("minus"):
                                try {
                                    numberTwo = Double.parseDouble(numInput.getText().toString());
                                    if((numberOne - numberTwo) % 1 == 0)
                                        numOutput.setText(Math.round(numberOne - numberTwo) + "");
                                    else
                                        numOutput.setText(numberOne - numberTwo + "");;
                                    numInput.setText(process + processNumber);
                                    process = numOutput.getText().toString();
                                }catch (Exception e){
                                    numOutput.setText("NaN");
                                }
                                break;
                            case("multiply"):
                                try {
                                    numberTwo = Double.parseDouble(numInput.getText().toString());
                                    if((numberOne * numberTwo) % 1 == 0)
                                        numOutput.setText(Math.round(numberOne * numberTwo) + "");
                                    else
                                        numOutput.setText(numberOne * numberTwo + "");;
                                    numInput.setText(process + processNumber);
                                    process = numOutput.getText().toString();
                                }catch (Exception e){
                                    numOutput.setText("NaN");
                                }
                                break;
                            case("divide"):
                                try {
                                    numberTwo = Double.parseDouble(numInput.getText().toString());
                                    if((numberOne / numberTwo) % 1 == 0)
                                        numOutput.setText(Math.round(numberOne / numberTwo) + "");
                                    else
                                        numOutput.setText(numberOne / numberTwo + "");;
                                    numInput.setText(process + processNumber);
                                    process = numOutput.getText().toString();
                                }catch (Exception e){
                                    numOutput.setText("NaN");
                                }
                                break;
                            case("percent"):
                                if((numberOne / 100) % 1 == 0)
                                    numOutput.setText(Math.round(numberOne / 100) + "");
                                else
                                    numOutput.setText(numberOne / 100 + "");;
                                numInput.setText(process);
                                process = numOutput.getText().toString();
                                break;
                            case("power"):
                                try {
                                    numberTwo = Double.parseDouble(numInput.getText().toString());
                                    if(Math.pow(numberOne,numberTwo) % 1 == 0)
                                        numOutput.setText(Math.round(Math.pow(numberOne,numberTwo)) + "");
                                    else
                                        numOutput.setText(Math.pow(numberOne,numberTwo) + "");
                                    numInput.setText(process + processNumber);
                                    process = numOutput.getText().toString();
                                }catch (Exception e){
                                    numOutput.setText("NaN");
                                }
                                break;
                            case("root"):
                                try {
                                    numberTwo = Double.parseDouble(numInput.getText().toString());
                                    if(Math.sqrt(numberTwo) % 1 == 0)
                                        numOutput.setText(Math.round(Math.sqrt(numberTwo)) + "");
                                    else
                                        numOutput.setText(Math.sqrt(numberTwo) + "");
                                    numInput.setText(process + processNumber);
                                    process = numOutput.getText().toString();
                                }catch (Exception e){
                                    numOutput.setText("NaN");
                                }
                                break;
                            case("sin"):
                                numberTwo = Double.parseDouble(numInput.getText().toString());
                                if(Math.sin(Math.toRadians(numberTwo)) % 1 == 0)
                                    numOutput.setText(Math.round(Math.sin(Math.toRadians(numberTwo))) + "");
                                else
                                    numOutput.setText(Math.sin(Math.toRadians(numberTwo)) + "");
                                numInput.setText(process + processNumber + ")");
                                process = numOutput.getText().toString();
                                break;
                            case("cos"):
                                numberTwo = Double.parseDouble(numInput.getText().toString());
                                if(Math.cos(Math.toRadians(numberTwo)) % 1 == 0)
                                    numOutput.setText(Math.round(Math.cos(Math.toRadians(numberTwo))) + "");
                                else
                                    numOutput.setText(Math.cos(Math.toRadians(numberTwo)) + "");
                                numInput.setText(process + processNumber + ")");
                                process = numOutput.getText().toString();
                                break;
                            case("tan"):
                                numberTwo = Double.parseDouble(numInput.getText().toString());
                                if(Math.tan(Math.toRadians(numberTwo)) % 1 == 0)
                                    numOutput.setText(Math.round(Math.tan(Math.toRadians(numberTwo))) + "");
                                else
                                    numOutput.setText(Math.tan(Math.toRadians(numberTwo)) + "");
                                numInput.setText(process + processNumber + ")");
                                process = numOutput.getText().toString();
                                break;
                            case("ln"):
                                numberTwo = Double.parseDouble(numInput.getText().toString());
                                if(Math.log(numberTwo) % 1 == 0)
                                    numOutput.setText(Math.round(Math.log(numberTwo)) + "");
                                else
                                    numOutput.setText(Math.log(numberTwo)+ "");
                                numInput.setText(process + processNumber + ")");
                                process = numOutput.getText().toString();
                                break;
                            case("log"):
                                numberTwo = Double.parseDouble(numInput.getText().toString());
                                if(Math.log10(numberTwo) % 1 == 0)
                                    numOutput.setText(Math.round(Math.log10(numberTwo)) + "");
                                else
                                    numOutput.setText(Math.log10(numberTwo)+ "");
                                numInput.setText(process + processNumber + ")");
                                process = numOutput.getText().toString();
                                break;
                            case("modulus"):
                                numberTwo = Double.parseDouble(numInput.getText().toString());
                                if((numberOne % numberTwo) % 1 == 0)
                                    numOutput.setText(Math.round(numberOne % numberTwo) + "");
                                else
                                    numOutput.setText(numberOne % numberTwo + "");
                                numInput.setText(process + processNumber);
                                process = numOutput.getText().toString();
                                break;
                            case("prod"):
                                try {
                                    int n = Integer.parseInt(prodNumber) - 1;
                                    while (n > 0) {
                                        numberOne = numberOne * n;
                                        n--;
                                    }
                                    if(numberOne % 1 == 0)
                                        numOutput.setText(Math.round(numberOne) + "");
                                    else
                                        numOutput.setText(numberOne + "");
                                    numInput.setText(process);
                                    process = numOutput.getText().toString();
                                    break;
                                } catch (Exception e) {
                                    numOutput.setText("NaN");
                                }

                        }
                        operator_pressed = false;
                    }
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

    public void openBasic(){
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);

        String currentInput = numInput.getText().toString();
        String currentOutput = numOutput.getText().toString();
        String currentProcesss = process;
        int currentBgcolor, currentTextColor;

        if(current_theme) {
            currentBgcolor = WHITE;
            currentTextColor = BLACK;
        }else{
            currentBgcolor = BLACK;
            currentTextColor = WHITE;
        }

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.CURRENT_RESULT,currentOutput);
        intent.putExtra(MainActivity.CURRENT_PROCESS,currentProcesss);
        intent.putExtra(MainActivity.CURRENT_BG_COLOR,currentBgcolor);
        intent.putExtra(MainActivity.CURRENT_TEXT_COLOR,currentTextColor);

        startActivity(intent);
    }

    public void changeTheme() {
        LinearLayout display = findViewById(R.id.display_layout);
        TextView numInput = findViewById(R.id.numInput);
        TextView numOutput = findViewById(R.id.numOutput);


        if (current_theme) {
            display.setBackgroundColor(BLACK);
            numInput.setTextColor(WHITE);
            numOutput.setTextColor(WHITE);
            current_theme = false;
        } else {
            display.setBackgroundColor(WHITE);
            numInput.setTextColor(BLACK);
            numOutput.setTextColor(BLACK);
            current_theme = true;
        }
    }
}
