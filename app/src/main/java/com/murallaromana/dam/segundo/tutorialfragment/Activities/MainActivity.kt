package com.murallaromana.dam.segundo.tutorialfragment.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.murallaromana.dam.segundo.tutorialfragment.R
import com.murallaromana.dam.segundo.tutorialfragment.fragments.PrimerFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**Clases utiles:
         *        -FragamentManager(está en activity, se llama supportFragmentManager)
         *        -FragmentTransaction
         *        -Fragment
         *
         */


        val fragmenttransaction = supportFragmentManager.beginTransaction()
        fragmenttransaction.add(R.id.contenedorFragments, PrimerFragment())
        fragmenttransaction.commit()





    }
}