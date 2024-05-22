package com.servicioscm.examengustavo

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.servicioscm.examengustavo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMetrosKilometros.setOnClickListener(this)
        binding.btnMetrosCentimetros.setOnClickListener(this)
        binding.btnMetrosMilimetros.setOnClickListener(this)
    }

    fun metrosKilometros(metro: String): String {
        val conversion = (metro.toFloat() / 1000)
        return "Son: $conversion kilometros"
    }

    fun metrosCentimetros(metro: String): String {
        val conversion = (metro.toFloat() * 100)
        return "Son: $conversion centimetros"
    }

    fun metrosMilimetros(metro: String): String {
        val conversion = (metro.toFloat() * 1000)
        return "Son: $conversion milimetros"
    }

    override fun onClick(v: View?) {
        when (v) {
            binding.btnMetrosKilometros -> {
                if (binding.valorMetros.text.toString().isNotEmpty()) {
                    /*Toast.makeText(
                        this,
                        metrosKilometros(binding.valorMetros.text.toString()),
                        Toast.LENGTH_LONG
                    ).show()*/
                    binding.resultado.text = metrosKilometros(binding.valorMetros.text.toString())
                } else {
                    val mensaje = "Ingresaste un número inválido"
                    binding.resultado.text = mensaje
                }
            }

            binding.btnMetrosCentimetros -> {
                if (binding.valorMetros.text.toString().isNotEmpty()) {
                    /*Toast.makeText(
                        this,
                        metrosCentimetros(binding.valorMetros.text.toString()),
                        Toast.LENGTH_LONG
                    ).show()*/
                    binding.resultado.text = metrosCentimetros(binding.valorMetros.text.toString())
                } else {
                    /*Toast.makeText(
                        this,
                        "Ingresa un número válido",
                        Toast.LENGTH_LONG
                    ).show()*/
                    val mensaje = "Ingresaste un número inválido"
                    binding.resultado.text = mensaje
                }
            }

            binding.btnMetrosMilimetros -> {
                if (binding.valorMetros.text.toString().isNotEmpty()) {
                    /*Toast.makeText(
                        this,
                        metrosMilimetros(binding.valorMetros.text.toString()),
                        Toast.LENGTH_LONG
                    ).show()*/
                    binding.resultado.text = metrosMilimetros(binding.valorMetros.text.toString())
                } else {
                    /*Toast.makeText(
                        this,
                        "Ingresa un número válido",
                        Toast.LENGTH_LONG
                    ).show()*/
                    val mensaje = "Ingresaste un número inválido"
                    binding.resultado.text = mensaje
                }
            }
        }
    }
}