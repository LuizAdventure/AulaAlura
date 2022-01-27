package com.example.financas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.financas.R
import com.example.financas.databinding.ActivityListaTransacoesBinding

class ListaTransacoesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaTransacoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaTransacoesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val lista: List<String> = listOf("Comida - R$ 20,50", "Economia - R$ 100,00")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, lista)


        binding.listaTransacoesListview.adapter = arrayAdapter



    }
}