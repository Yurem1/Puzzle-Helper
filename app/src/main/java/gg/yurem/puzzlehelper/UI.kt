package gg.yurem.puzzlehelper

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

open class UI : Activity {

    constructor() : super() {
        /* Redundant way to call a constructor, do not mind */
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_interface)

        /* Upload Image Button */
        findViewById<ImageButton>(R.id.upload_button).setOnClickListener() {
            Tools.takePicture(this) // Calls takePicture to take a picture
        }
    }
}