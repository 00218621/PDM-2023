package com.example.laboratorio04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.util.Log
import android.content.Intent



class MainActivity : AppCompatActivity() {
    private lateinit var Display_name_text:EditText
    private lateinit var Display_correo_text:EditText
    private lateinit var Display_telefono_text:EditText
    private lateinit var Send_save_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "OnCreate")
        bin()
        Send_Date()
    }
    fun bin(){
        Display_name_text=findViewById(R.id.name_one_activity_text)
        Display_correo_text=findViewById(R.id.correo_one_activity_text)
        Display_telefono_text=findViewById(R.id.telefono_one_activity_text)
        Send_save_button=findViewById(R.id.save_button)
    }
    fun Send_Date(){
        Send_save_button.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("name",Display_name_text.text.toString())
            intent.putExtra("correo",Display_correo_text.text.toString())
            intent.putExtra("telefono",Display_telefono_text.text.toString())
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "OnRestart")
    }

    companion object {
        const val TAG = "com.example.MainActivity"
    }



}