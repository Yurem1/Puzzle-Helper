package gg.yurem.puzzlehelper

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat.startActivity
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.fragment.app.Fragment

internal class Camera : UI() {

    /* Opens up the camera to a singular picture  */

    companion object {

        private const val cameraRequestCode: Int = 1

        internal fun takePicture(thisContext: Activity) {

            startActivityForResult(
                thisContext,
                Intent(MediaStore.ACTION_IMAGE_CAPTURE),
                cameraRequestCode,
                null
            )
        }
    }
}