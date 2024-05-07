package com.example.kka

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
//    private var mService : Messenger? = null
//    private  var isBound : Boolean = false
//
//    private val mConnection = object : ServiceConnection {
//        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
//            Toast.makeText(applicationContext, "Connected", Toast.LENGTH_SHORT).show()
//            mService = Messenger(service)
//            isBound = true
//        }
//
//        override fun onServiceDisconnected(name: ComponentName?) {
//            Toast.makeText(applicationContext, "UnConnected", Toast.LENGTH_SHORT).show()
//            isBound = false
//            mService = null
//        }
//
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       // val intent = Intent(this, MyService::class.java)

       // bindService(intent, mConnection, Context.BIND_AUTO_CREATE )
    }
}