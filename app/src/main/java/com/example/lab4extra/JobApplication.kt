package com.example.lab4extra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class JobApplication : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job_application)

        val usuario:Usuario = intent.getSerializableExtra("user") as Usuario

        val textViewNombre = findViewById<TextView>(R.id.textViewNombre)
        val textViewApellido = findViewById<TextView>(R.id.textViewApellido)
        val textViewDireccion = findViewById<TextView>(R.id.textViewDireccion)
        val textViewCorreo = findViewById<TextView>(R.id.textViewCorreo)
        val textViewTelefono = findViewById<TextView>(R.id.textViewTelefono)
        val textViewPosicion = findViewById<TextView>(R.id.textViewPosicion)
        val textViewFecha = findViewById<TextView>(R.id.textViewFecha)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        textViewNombre.text = usuario.nombre
        textViewApellido.text = usuario.apellido
        textViewDireccion.text = usuario.direccion
        textViewCorreo.text = usuario.correo
        textViewTelefono.text = usuario.telefono
        textViewPosicion.text = usuario.posicion
        textViewFecha.text = usuario.fecha_inicio
        btnLogout.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }
}