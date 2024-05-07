package com.example.kka

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

private const val MSG_REGISTER = 1;
private const val MSG_STORAGE = 2;
private const val MSG_GET = 3;
class MyService : Service() {

    private val binder =  object : IMyAidlInterface.Stub() {
        override fun findFactorialService(x: Int): Int {
            return x * x
        }

    }
//    private lateinit var mMessenger: Messenger
//    internal class  IncomingHandler (context : Context,
//        private val applicationContext : Context = context.applicationContext) : Handler() {
//        override fun handleMessage(msg: Message) {
//
//            when(msg.what) {
//                MSG_REGISTER -> Toast.makeText(applicationContext, "REGISTER!", Toast.LENGTH_SHORT).show()
//                MSG_STORAGE -> Toast.makeText(applicationContext, "STORAGE", Toast.LENGTH_SHORT).show()
//                MSG_GET -> Toast.makeText(applicationContext, "GET", Toast.LENGTH_SHORT).show()
//                else -> super.handleMessage(msg)
//            }
//        }
//        }

    override fun onBind(intent: Intent): IBinder {
        Toast.makeText(applicationContext, "OnBind", Toast.LENGTH_SHORT).show()
//        mMessenger = Messenger(IncomingHandler(this))
//        return mMessenger.binder
        return binder
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        Log.d("Service", "Start")
        return super.onStartCommand(intent, flags, startId)
    }

}