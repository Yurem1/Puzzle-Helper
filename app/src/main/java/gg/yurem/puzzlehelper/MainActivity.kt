package gg.yurem.puzzlehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/* No use for this class so far, however, it will stay intact for future use */

class MainActivity : AppCompatActivity {

    constructor() : super() {
        /* Redundant way to call a constructor, do not mind */
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}