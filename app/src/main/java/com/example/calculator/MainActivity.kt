package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        val btnAdd = findViewById<Button>(R.id.btnplus)
        val btnSub = findViewById<Button>(R.id.btnminus)
        val btnMul = findViewById<Button>(R.id.btnMult)
        val btnDiv = findViewById<Button>(R.id.btndivide)


        val btnDelete = findViewById<Button>(R.id.btndelete)
        val btnClear = findViewById<Button>(R.id.btnclear)
        val btnDot = findViewById<Button>(R.id.btndecimal)
        val btnEqual = findViewById<Button>(R.id.btnequal)

        val total = findViewById<TextView>(R.id.textView1)
        val input = findViewById<EditText>(R.id.editTextNumber)

        var value1 = Double.NaN
        var value2: Double
        var ACTION: String? = null


        btnClear.setOnClickListener {
          value1 = Double.NaN
            total.text = null
            input.text = null
        }

        btnDelete.setOnClickListener {
            var number: String = input.text.toString()
            if (number.length > 0) {
                number = number.substring(0, number.length - 1)
            }

            input.setText(number)
            input.setSelection(input.text.length)
        }

        btnAdd.setOnClickListener {
            ACTION = "+"
            if (!java.lang.Double.isNaN(value1)) {
                value2 = input.getText().toString().toDouble()
                value1 += value2
            } else {
                value1 = input.getText().toString().toDouble()
            }
            total.setText(value1.toString() + " + ")
            input.setText(null)
        }

        btnSub.setOnClickListener{
            ACTION = "-"
            if (!java.lang.Double.isNaN(value1)) {
                value2 = input.getText().toString().toDouble()
                value1 -= value2
            } else {
                value1 = input.getText().toString().toDouble()
            }
            total.setText(value1.toString() + " -")
            input.setText(null)
        }


        btnMul.setOnClickListener{
            ACTION = "*"
            if (!java.lang.Double.isNaN(value1)) {
                value2 = input.getText().toString().toDouble()
                value1 *= value2
            } else {
                value1 = input.getText().toString().toDouble()
            }
            total.setText(value1.toString() + " * ")
            input.setText(null)
        }


        btnDiv.setOnClickListener{
            ACTION = "/"
            if (!java.lang.Double.isNaN(value1)) {
                value2 = input.getText().toString().toDouble()
                value1 /= value2
            } else {
                value1 = input.getText().toString().toDouble()
            }
            total.setText(value1.toString() + " / ")
            input.setText(null)
        }

        btnEqual.setOnClickListener{
            if(ACTION.equals("+")){
                val result: Double = value1 + input.getText().toString().toDouble()
                total.setText(null)
                input.setText(result.toString())
            }else if(ACTION != null && ACTION.equals("-")){
                val result: Double = value1 - input.getText().toString().toDouble()
                total.setText(null)
                input.setText(result.toString())
            } else if(ACTION != null && ACTION.equals("*")){
                val result: Double = value1 * input.getText().toString().toDouble()
                total.setText(null)
                input.setText(result.toString())
            } else if(ACTION != null && ACTION.equals("/")){
                val result: Double = value1 / input.getText().toString().toDouble()
                total.setText(null)
                input.setText(result.toString())
            }
            ACTION = null
            value1 = Double.NaN;
            input.setSelection(input.getText().length);
        }


        btn0.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "0")
            input.setSelection(input.getText().length)
        })

        btn1.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "1")
            input.setSelection(input.getText().length)
        })

        btn2.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "2")
            input.setSelection(input.getText().length)
        })

        btn3.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "3")
            input.setSelection(input.getText().length)
        })

        btn4.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "4")
            input.setSelection(input.getText().length)
        })

        btn5.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "5")
            input.setSelection(input.getText().length)
        })

        btn6.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "6")
            input.setSelection(input.getText().length)
        })

        btn7.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "7")
            input.setSelection(input.getText().length)
        })

        btn8.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "8")
            input.setSelection(input.getText().length)
        })

        btn9.setOnClickListener(View.OnClickListener {
            input.setText(input.getText().toString() + "9")
            input.setSelection(input.getText().length)
        })

        btnDot.setOnClickListener {
            input.setText(input.getText().toString() + ".")
            input.setSelection(input.getText().length)
        }


    }
}