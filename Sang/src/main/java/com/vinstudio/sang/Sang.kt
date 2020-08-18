package com.vinstudio.sang

import android.content.Context
import android.widget.Toast

class Sang {
    fun show(context:Context,message: String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}
