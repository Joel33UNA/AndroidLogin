package com.example.lab4extra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val username = findViewById<EditText>(R.id.editTextUsuario)
        val password = findViewById<EditText>(R.id.editTextClave)
        val login = findViewById<Button>(R.id.btnLogin)

        val jobForm = Usuario("Juan", "Perez", "Heredia",
            "juan@mail.com", "888485", "juan", "123", "informatica", "29/4/2022")

        login.setOnClickListener{
            if(username.text.toString() == jobForm.nombre_usuario && password.text.toString() == jobForm.clave){
                val intent = Intent(this, JobApplication::class.java)
                intent.putExtra("user", jobForm)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Error, las credenciales son juan / 123!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}