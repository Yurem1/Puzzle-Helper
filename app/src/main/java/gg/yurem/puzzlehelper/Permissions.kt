package gg.yurem.puzzlehelper

import androidx.fragment.app.Fragment
import com.vmadalin.easypermissions.EasyPermissions
import android.Manifest
import android.app.Activity
import android.content.Context
import android.widget.Toast
internal class Permissions : Fragment, EasyPermissions.PermissionCallbacks {

    constructor() : super() {
        // Redundant way to call a constructor, do not mind
    }

    companion object {

        /* Static method, showToast() is called statically in order to show
         the user that they lack permissions (if any). It's called everytime to remind
         the user to enable permissions from their android settings */

        private fun showToast(thisContext: Activity): Unit {

            if (!hasCameraPermissions(thisContext)) {
                Toast.makeText(
                    thisContext,
                    "Missing Camera Permissions!",
                    Toast.LENGTH_SHORT
                ).show() // Toast pops to notify the user for missing permissions
            }
        }

        /* Checks if user holds camera permissions, returns false if it does not */
        internal fun hasCameraPermissions(thisContext: Context?): Boolean {
            return EasyPermissions.hasPermissions(
                thisContext,
                Manifest.permission.CAMERA
            )
        }

        /* Requests the user for camera permissions, then calls showToast() */
        internal fun requestCameraPermission(thisContext: Activity): Unit {
            EasyPermissions.requestPermissions(
                thisContext,
                "Camera Permissions are required",
                1,
                Manifest.permission.CAMERA
            )
            showToast(thisContext)
        }
    }

    /* No use for this function so far */
    override fun onPermissionsDenied(requestCode: Int, perms: List<String>) {

    }

    /* No use for this function so far */
    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {

    }
}