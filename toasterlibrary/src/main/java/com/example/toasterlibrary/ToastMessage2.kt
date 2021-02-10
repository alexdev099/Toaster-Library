package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToastMessage2 {

    fun s(c: Context?, message: String?) {
        Toast.makeText(c, "2 $message", Toast.LENGTH_SHORT).show()
    }
}