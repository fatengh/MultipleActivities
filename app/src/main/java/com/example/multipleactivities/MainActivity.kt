package com.example.multipleactivities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private lateinit var edName: EditText
    private lateinit var edEmail: EditText
    private lateinit var edMobile: EditText
    private lateinit var edAdd: EditText
    private lateinit var cb: CheckBox
    private lateinit var btnSU: Button
    val user = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName = findViewById(R.id.edName)
        edEmail = findViewById(R.id.edEmail)
        edMobile = findViewById(R.id.edMobile)
        edAdd = findViewById(R.id.edAdd)
        cb = findViewById(R.id.cb)
        btnSU = findViewById(R.id.btnSU)

        btnSU.setOnClickListener {
            var name = edName.text.toString()
            user.add(name)
            var email = edEmail.text.toString()
            user.add(email)
            var mobile = edMobile.text.toString()
            user.add(mobile)
            var add = edAdd.text.toString()
            user.add(add)
            if (cb.isChecked){
                val intent= Intent(applicationContext,MainActivity2::class.java)
                intent.putExtra("name",name)
                intent.putExtra("email",email)
                intent.putExtra("address",add)
                intent.putExtra("mobile",mobile)
                startActivity(intent)
            }else{
                alert()
            } } }


    fun alert(){
        val d = AlertDialog.Builder(this)
        d.setMessage("Don't forgot to check agree box ")
            .setPositiveButton("Ok", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })
        val aler=d.create()
        aler.show()
    }
}