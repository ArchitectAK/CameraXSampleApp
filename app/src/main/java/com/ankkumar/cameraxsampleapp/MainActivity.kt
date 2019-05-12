package com.ankkumar.cameraxsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.Manifest
import android.util.Size
import android.graphics.Matrix
import androidx.lifecycle.LifecycleOwner
import java.util.concurrent.TimeUnit


private const val REQUEST_CODE_PERMISSIONS = 881

private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)


class MainActivity : AppCompatActivity(), LifecycleOwner {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
