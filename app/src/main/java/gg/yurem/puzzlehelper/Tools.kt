package gg.yurem.puzzlehelper

import android.app.Activity

internal class Tools {

    /* A mixture of utility functions
     using functions from different classes within the
    application */
    
    companion object {
        fun takePicture(thisContext: Activity) {

            if(Permissions.hasCameraPermissions(thisContext)) {
                Camera.takePicture(thisContext)
            }
            else {
                Permissions.requestCameraPermission(thisContext)
            }
        }
    }
}