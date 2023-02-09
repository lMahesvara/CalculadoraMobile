package mx.itson.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    var op: Char = '+'
    var num1: Double = 0.0
    var num2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNum1: TextView = findViewById(R.id.tvNum1)
        val tvNum2: TextView = findViewById(R.id.tvNum2)

        val btnSum: Button = findViewById(R.id.btnSum)
        val btnRest: Button = findViewById(R.id.btnRest)
        val btnMult: Button = findViewById(R.id.btnMult)
        val btnDiv: Button = findViewById(R.id.btnDiv)

        val btnResult: Button = findViewById(R.id.btnResult)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)

        val btn0: Button = findViewById(R.id.btn0)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btn5: Button = findViewById(R.id.btn5)
        val btn6: Button = findViewById(R.id.btn6)
        val btn7: Button = findViewById(R.id.btn7)
        val btn8: Button = findViewById(R.id.btn8)
        val btn9: Button = findViewById(R.id.btn9)

        fun agregarDigito(num:Int){
            if(tvNum1.text.equals("0")) tvNum1.setText("${num}")
            else tvNum1.setText("${tvNum1.text}${num}")
        }

        btn0.setOnClickListener{agregarDigito(0)}
        btn1.setOnClickListener{agregarDigito(1)}
        btn2.setOnClickListener{agregarDigito(2)}
        btn3.setOnClickListener{agregarDigito(3)}
        btn4.setOnClickListener{agregarDigito(4)}
        btn5.setOnClickListener{agregarDigito(5)}
        btn6.setOnClickListener{agregarDigito(6)}
        btn7.setOnClickListener{agregarDigito(7)}
        btn8.setOnClickListener{agregarDigito(8)}
        btn9.setOnClickListener{agregarDigito(9)}

        btnSum.setOnClickListener{
            op='+'
            tvNum2.setText("${tvNum1.text}+")
            num1 = tvNum1.text.toString().toDouble()
            tvNum1.setText("0")
        }

        btnRest.setOnClickListener{
            op='-'
            tvNum2.setText("${tvNum1.text}-")
            num1 = tvNum1.text.toString().toDouble()
            tvNum1.setText("0")
        }

        btnMult.setOnClickListener{
            op='*'
            tvNum2.setText("${tvNum1.text}*")
            num1 = tvNum1.text.toString().toDouble()
            tvNum1.setText("0")
        }

        btnDiv.setOnClickListener{
            op='/'
            tvNum2.setText("${tvNum1.text}/")
            num1 = tvNum1.text.toString().toDouble()
            tvNum1.setText("0")
        }

        btnResult.setOnClickListener{
            num2= tvNum1.text.toString().toDouble()
            when(op){
                '+' -> tvNum2.setText((num1+num2).toString())
                '-' -> tvNum2.setText((num1-num2).toString())
                '*' -> tvNum2.setText((num1*num2).toString())
                '/' -> tvNum2.setText((num1/num2).toString())
                else -> tvNum2.setText(0)
            }
            tvNum1.setText("0")
            //resetearVariables()
        }

        btnBorrar.setOnClickListener{
            tvNum1.setText("0")
            tvNum2.setText("")
            resetearVariables()
        }


    }

    fun resetearVariables(){
        op = '+'
        num1 = 0.0
        num2 = 0.0
    }


}