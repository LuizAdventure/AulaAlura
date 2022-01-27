package com.example.financas.ui

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.financas.adapter.ListaTransacoesAdapter
import com.example.financas.databinding.ActivityListaTransacoesBinding
import com.example.financas.model.Transacao
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListaTransacoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaTransacoesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val lista = listOf(
            Transacao(BigDecimal(30.5),
        "Comida", Calendar.getInstance()),
            Transacao(BigDecimal(100.0),
        "Economia", Calendar.getInstance())
        )

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, lista)


        binding.listaTransacoesListview.adapter =
            ListaTransacoesAdapter(lista,this)



    }
}