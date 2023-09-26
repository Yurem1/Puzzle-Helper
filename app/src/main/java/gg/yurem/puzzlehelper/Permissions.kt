package gg.yurem.puzzlehelper

import android.util.Log
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import com.vmadalin.easypermissions.EasyPermissions
import android.Manifest
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Permissions : Fragment(), EasyPermissions.PermissionCallbacks {

    companion object {

        private const val CAMERA_PERMISSION_REQUEST_CODE = 1

        /* Statically calls makeText() in order to show the user that they
        lack permissions (if any) */
        private fun showToast(thisContext: Activity): Unit {
            if (!hasCameraPermissions(thisContext)) {
                return Toast.makeText(
                    thisContext,
                    "You lack Permissions",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        /* Checks if user holds camera permissions, returns false if does not */
        private fun hasCameraPermissions(thisContext: Context?): Boolean {
            return EasyPermissions.hasPermissions(
                thisContext,
                Manifest.permission.CAMERA
            )
        }

        /* Requests the user for camera permissions */
        internal fun requestCameraPermission(thisContext: Activity): Unit {
            EasyPermissions.requestPermissions(
                host = thisContext,
                "Camera Permissions are required",
                CAMERA_PERMISSION_REQUEST_CODE,
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