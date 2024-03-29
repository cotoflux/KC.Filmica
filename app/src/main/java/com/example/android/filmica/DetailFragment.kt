package com.example.android.filmica

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment: Fragment() {

    companion object {
        fun newInstance(filId: String): DetailFragment{
            val fragment = DetailFragment()
            val bundle = Bundle()
            bundle.putString("id", filId)
            fragment.arguments = bundle

            return fragment

        }
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val id = arguments?.getString("id", "")
        val film = FilmsRepo.findFilmById(id!!)

        film?.let{
            labelTitle.text = it.titulo
            labelGeneres.text = it.genere
            labelDescription.text = it.overview
            labelDate.text = it.date
        }

        buttonAdd.setOnClickListener {
            Toast.makeText(context, "Añadido al watchlist", Toast.LENGTH_LONG).show()
        }

    }


}