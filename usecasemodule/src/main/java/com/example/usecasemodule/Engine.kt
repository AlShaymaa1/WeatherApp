package com.example.usecasesmodule

import android.os.Build
import android.os.CountDownTimer
import android.support.annotation.RequiresApi
import android.util.Log
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import java.util.function.Consumer
import org.reactivestreams.Subscription


private const val FINISH_AFTER_MILLIS = 10 * 60000L
private const val INTERVAL_IN_MILLIS = 1000L

//class Ticker(private val onTicking: (Long) -> Unit)
class Ticker()
//: CountDownTimer(FINISH_AFTER_MILLIS, INTERVAL_IN_MILLIS)
{

//    override fun onTick(millisUntilFinished: Long) {
//        onTicking(millisUntilFinished)
//    }
//
//    override fun onFinish() {
//    }

    fun timer(onTicking: (Long) -> Unit) {
        val subscription = Observable.interval(FINISH_AFTER_MILLIS, INTERVAL_IN_MILLIS, TimeUnit.MILLISECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .repeat()
          // .subscribe { Consumer<Long>(onTicking(it)) }
//                     // here is the task that should repeat
//                     onTicking(it)
//                 Log.e("error",it.toString())


        val disposable: CompositeDisposable = CompositeDisposable()
     //   disposable.add(subscription)
    }


}


