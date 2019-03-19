package com.example.usecasesmodule

import android.arch.lifecycle.MutableLiveData


//return double instead of fun randomNumberGenerator():Double
//return Math.random()*1000
//fun randomNumberGenerator()=Math.random()*1000

fun numberIncrementer(liveData: MutableLiveData<Int>,incrementBy :Int =1){
    val oldValue=liveData.value ?:0
    liveData.postValue(oldValue+incrementBy)
}

