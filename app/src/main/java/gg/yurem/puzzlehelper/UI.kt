package gg.yurem.puzzlehelper

import android.app.Activity
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

internal class UI : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_interface)

        /* Fetches the Button element from user_interface using an ID, then the application
        awaits for a click, if so, the application calls requestCameraPermission() */

        fun takePicture() {

            if(Permissions.hasCameraPermissions(this)) {
                Camera.takePicture(this)
            }
            else {
                Permissions.requestCameraPermission(this)
            }
        }
        findViewById<ImageButton>(R.id.upload_button).setOnClickListener() {
        }
    }
}