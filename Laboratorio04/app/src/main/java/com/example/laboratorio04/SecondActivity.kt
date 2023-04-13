package com.example.laboratorio04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import org.w3c.dom.Text



class SecondActivity : AppCompatActivity() {
    private lateinit var Name_Text:TextView
    private lateinit var Correo_Text:TextView
    private lateinit var Telefono_Text:TextView
    private lateinit var Share_Button:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        bin()
        ReceiveFun()
        ShareButtonFun()
    }
    fun bin(){
        Name_Text=findViewById(R.id.receive_name_text)
        Correo_Text=findViewById(R.id.receive_correo_text)
        Telefono_Text=findViewById(R.id.receive_telefono_text)
        Share_Button=findViewById(R.id.share_button)
    }
    fun ReceiveFun(){
        val key_name=intent.getStringExtra("name").toString()
        val key_correo=intent.getStringExtra("correo").toString()
        val key_telefono=intent.getStringExtra("telefono").toString()

        Name_Text.setText(key_name)
        Correo_Text.setText(key_correo)
        Telefono_Text.setText(key_telefono)
    }
    fun ShareButtonFun(){
        Share_Button.setOnClickListener {
            val key_name=intent.getStringExtra("name").toString()
            val key_correo=intent.getStringExtra("correo").toString()
            val key_telefono=intent.getStringExtra("telefono").toString()
            val intent=Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"Nombre: "+key_name + "\n" +"Correo: "+ key_correo +"\n"+"Teléfono: "+
                        key_telefono)
                type="text/plain"
            }
            val share=Intent.createChooser(intent,null)
            startActivity(share)
        }

        }
    }
