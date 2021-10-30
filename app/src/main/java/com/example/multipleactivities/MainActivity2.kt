package com.example.multipleactivities

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    private lateinit var tvName: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvMobile: TextView
    private lateinit var tvAdd: TextView
    private lateinit var btnConf: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvName = findViewById(R.id.tvName)
        tvEmail = findViewById(R.id.tvEmail)
        tvMobile = findViewById(R.id.tvMobile)
        tvAdd = findViewById(R.id.tvAdd)
        btnConf = findViewById(R.id.btnConf)

        val user = ArrayList<String>()


        var name = intent.getStringExtra("name").toString()
        var email = intent.getStringExtra("email").toString()
        var add = intent.getStringExtra("address").toString()
        var mobile = intent.getStringExtra("mobile").toString()

        tvName.text = name
        tvEmail.text = email
        tvAdd.text = add
        tvMobile.text = mobile

        user.add(name)
        user.add(email)
        user.add(add)
        user.add(mobile)


        btnConf.setOnClickListener {
            alert(user, name ,email,add, mobile)
        }

    }
    fun alert(user:ArrayList<String>, name : String,email: String,add: String, mobile: String){
        val d= AlertDialog.Builder(this)
        d.setMessage("pleas click on conform ")

            .setPositiveButton("conform", DialogInterface.OnClickListener {
                    dialog, id ->
                val intent= Intent(applicationContext,MainActivity3::class.java)
                intent.putExtra("user",user)
                startActivity(intent)
            })
            .setNegativeButton("cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        val aler=d.create()
        aler.show()
    }
}