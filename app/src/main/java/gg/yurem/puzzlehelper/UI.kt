package gg.yurem.puzzlehelper

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class UI : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_interface)

        val button: Button = findViewById<Button>(R.id.upload_button)

        button.setOnClickListener() {
            Log.d("ButtonClickListener", "Button has been clicked $")
        }
    }
}
