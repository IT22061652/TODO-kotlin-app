package com.example.todoapp

import androidx.lifecycle.ViewModel

class MyViewmodel:ViewModel() {

    private var registeringtext=""
    private var updatetext=""




    fun getregistertext():String{
        return "Register"
    }

    fun getupdatetext():String{
        return "Update"
    }

    fun returntext(text:String):String{
        return text;
    }
}
