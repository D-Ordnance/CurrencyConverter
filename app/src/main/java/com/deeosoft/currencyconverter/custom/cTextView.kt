package com.deeosoft.currencyconverter.custom

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

class cTextView(context: Context): TextView(context) {
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int): super(context, attrs, defStyle){
        init()
    }

    private fun init() {
        if (!isInEditMode) {
            val tf = Typeface.createFromAsset(context.assets, "fonts/SF-Pro-Display-Light.otf")
            typeface = tf
        }
    }
}