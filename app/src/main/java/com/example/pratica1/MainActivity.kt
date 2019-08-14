package com.example.pratica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun autenticar(v: View) {
        if (usuario.text.toString().equals("nome") && senha.text.toString().equals("123")) {
            Toast.makeText(this, "Logado", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "erro de login", Toast.LENGTH_SHORT).show()
        }
    }
}