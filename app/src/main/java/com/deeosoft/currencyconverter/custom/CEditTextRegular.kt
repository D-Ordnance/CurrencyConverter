package com.deeosoft.currencyconverter.custom

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class CEditTextRegular: AppCompatEditText {
    constructor(context: Context): super(context){
        init()
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs){
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle){
        init()
    }

    private fun init(){
        if (!isInEditMode) {
            val tf = Typeface.createFromAsset(context.assets, "fonts/MontserratAlternates-Regular.ttf")
            typeface = tf
        }
    }
}