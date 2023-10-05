package gg.yurem.puzzlehelper

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import androidx.core.app.ActivityCompat.startActivityForResult

class Camera : Intent() {

    /* Opens up the camera to a singular picture  */

    companion object {

        internal fun takePicture(thisContext: Activity) {

            startActivityForResult(thisContext,
                Intent(MediaStore.ACTION_IMAGE_CAPTURE),
                1,
                null
            )
        }
    }
}