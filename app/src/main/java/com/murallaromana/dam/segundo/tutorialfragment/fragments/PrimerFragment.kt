package com.murallaromana.dam.segundo.tutorialfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.murallaromana.dam.segundo.tutorialfragment.R
import com.murallaromana.dam.segundo.tutorialfragment.segundoFragment

class PrimerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_primer, container, false)

        val btnIrotroFragment: Button = view.findViewById(R.id.btn_ir_al_segundo_fragment)


        btnIrotroFragment.setOnClickListener {

            val ft = activity?.supportFragmentManager?.beginTransaction()
            ft?.replace(R.id.contenedorFragments, segundoFragment())
            ft?.commit()

        }
        return view

    }


}
