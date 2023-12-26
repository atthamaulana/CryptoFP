package com.example.cryptofp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //hide title bar
        getSupportActionBar()?.hide()

        //instance text
        val txtEmail: EditText = findViewById(R.id.editTextEmail)
        val txtName: EditText = findViewById(R.id.editTextUser)
        val txtPassword: EditText = findViewById(R.id.editTextPassword)
        //instance button register
        val btnRegister: Button = findViewById(R.id.buttonRegister)

        //event button save
        btnRegister.setOnClickListener {
            //object class databaseHelper
            val DatabaseHelper = DatabaseHelper(this)
            //declare data
            val email:String = txtEmail.text.toString().trim()
            val username:String = txtName.text.toString().trim()
            val password:String = txtPassword.text.toString().trim()

            //insert data
            DatabaseHelper.addAccount(email,username,password)

            //show LoginActivity
            val intentLogin = Intent(this@RegisterActivity,
                LoginActivity::class.java)
            startActivity(intentLogin)


        }
    }
}