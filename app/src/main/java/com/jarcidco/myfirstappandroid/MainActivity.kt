package com.jarcidco.myfirstappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showToast() {
        Toast.makeText( this, "Hello from toast!", Toast.LENGTH_LONG).show()
    }

    fun showSnackBar() {

        val layout = findViewById<ConstraintLayout>(R.id.constraint)
        Snackbar.make(layout, "Hello from snackbar", Snackbar.LENGTH_LONG).setAction("Okay!"){
            Snackbar.make(layout, "Well done!", Snackbar.LENGTH_LONG).show()
        }.show()
    }
}
