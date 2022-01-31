package com.example.financas.ui

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.financas.adapter.ListaTransacoesAdapter
import com.example.financas.databinding.ActivityListaTransacoesBinding
import com.example.financas.model.Tipo
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
            Transacao(
                value = BigDecimal(30.5),
                tipo = Tipo.DESPESA, category = "Comida"),
            Transacao(
                value = BigDecimal(100.0),
                tipo = Tipo.RECEITA, category = "Premio")
        )

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, lista)


        binding.listaTransacoesListview.adapter =
            ListaTransacoesAdapter(lista,this)



    }
}