package com.example.financas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.financas.R
import com.example.financas.databinding.TransacaoItemBinding
import com.example.financas.model.Transacao

class ListaTransacoesAdapter(
    lista: List<Transacao>,
    context: Context): BaseAdapter() {

    private  val lista = lista
    private val context = context


    override fun getCount(): Int {
        return lista.size

    }

    override fun getItem(position: Int): Transacao {
        return lista[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.transacao_item, parent,false)

        val transacao = lista[position]

        view.findViewById<TextView>(R.id.transacao_valor).setText(transacao.getvalue().toString())




   return view
    }

}