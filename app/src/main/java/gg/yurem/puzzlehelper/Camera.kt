package gg.yurem.puzzlehelper

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import androidx.core.app.ActivityCompat.startActivityForResult

class Camera : Intent() {
    companion object {
        private val REQUEST_IMAGE_CAPTURE = 69
        internal fun takePicture(thisContext: Activity) {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(thisContext, takePictureIntent, REQUEST_IMAGE_CAPTURE, null)

        }
    }
}