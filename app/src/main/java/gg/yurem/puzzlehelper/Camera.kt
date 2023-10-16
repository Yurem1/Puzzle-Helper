package gg.yurem.puzzlehelper

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat.startActivity
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.fragment.app.Fragment

internal class Camera : UI {

    constructor() : super() {
        /* redundant way to call a constructor, do not mind */
    }

    /* Opens up the camera to a singular picture  */
    companion object {

        private val cameraRequestCode: Int
            get() {
                return 1
            }

        /* Takes a picture, if the user has Camera permissions */
        internal fun takePicture(thisContext: Activity) {

            startActivityForResult(
                thisContext,
                Intent(MediaStore.ACTION_IMAGE_CAPTURE),
                cameraRequestCode,
                null
            )
        }

        /* Returns the private field `cameraRequestCode` */
        fun returnCameraRequestCode(): Int {
            return cameraRequestCode
        }
    }
}