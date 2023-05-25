package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener{
            binding.inputtext.text = ""
            binding.outputtext.text= ""

        }
        binding.btn0.setOnClickListener {
           // binding.inputtext.text="0"
            binding.inputtext.append("0")


        }
        binding.btn1.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.btnDot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.btnPlus.setOnClickListener {
            binding.inputtext.append("+")
        }
        binding.btnMinus.setOnClickListener {
            binding.inputtext.append("-")
        }
        binding.btnMultiply.setOnClickListener {
            binding.inputtext.append("*")
        }
        binding.btnDivide.setOnClickListener {
            binding.inputtext.append("/")
        }
        binding.btnSbrac.setOnClickListener {
            binding.inputtext.append("(")
        }
        binding.btnEbrac.setOnClickListener {
            binding.inputtext.append(")")
        }
        binding.btnEqual.setOnClickListener {
            try {
                val expression = ExpressionBuilder(binding.inputtext.text.toString()).build()
                val result = expression.evaluate()
                val longResult = result.toLong()
                if (result == longResult.toDouble()) {
                    binding.outputtext.text = longResult.toString()
                } else {
                    binding.outputtext.text = result.toString()
                }
            } catch (e: Exception) {
                binding.outputtext.text = "error"
            }
        }

    }
}