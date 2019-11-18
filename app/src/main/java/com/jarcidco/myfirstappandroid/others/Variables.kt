package com.jarcidco.myfirstappandroid.others

import android.util.Log

// Documentation: https://kotlinlang.org/docs/reference/basic-types

/*
     In kotlin all is object.
     No basic types, and no void type exist, if anything doesn't return anything, kotlin returns Unit object.
     Variables can be mutable or immutable, we use immutables always as be posible ( var - mutables, val immutables )
     The types are defined after the variables name, with double dot and space ( var name: type ), this definition is optional.
 */

class Variables {

    private var first = 1
    private var second: Byte = 1
    private var third = -123
    private var fourth = 12315123232
    private var fifth: Float = 1.1.toFloat()
    private var sixth = 1.9

    //Show case for Int

    private fun showCase1(){
        Log.w( "Var first ", "Is first a Integer? ::::: " + (first is Int))
        Log.w( "Var second ", "Is second a Byte? ::::: " + (second is Byte))
    }

    // Show case for byte
    private fun showCase2() {
        Log.w( "Var third ", "Is third a Int? ::::: " + (third is Int))
        third = Int.MAX_VALUE
    }

    private fun showCase3() {
        Log.w( "Var fourth ", "Is fourth a Long? ::::: " + (fourth is Long))
    }

    private fun showCase4() {
        Log.w( "Var fifth ", "Is fifth a Float? ::::: " + (fifth is Float))
    }

    private fun showCase5() {
        Log.w( "Var sixth ", "Is sixth a Float? ::::: " + (fifth is Float))
    }

}