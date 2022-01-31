package com.example.financas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.financas.R
import com.example.financas.extensions.formatForBrazil
import com.example.financas.model.Tipo
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

        if(transacao.tipo == Tipo.RECEITA){
            view.findViewById<TextView>(R.id.transacao_valor)
                .setTextColor(ContextCompat.getColor(context,R.color.receita))
        }else {
            view.findViewById<TextView>(R.id.transacao_valor)
                .setTextColor(ContextCompat.getColor(context,R.color.despesa))
        }

        if(transacao.tipo == Tipo.RECEITA){
            view.findViewById<ImageView>(R.id.transacao_icone)
                .setBackgroundResource(R.drawable.icone_transacao_item_receita)
        }else {
            view.findViewById<ImageView>(R.id.transacao_icone)
                .setBackgroundResource(R.drawable.icone_transacao_item_despesa)
        }




        view.findViewById<TextView>(R.id.transacao_valor).text = transacao.value.toString()
        view.findViewById<TextView>(R.id.transacao_categoria).text = transacao.category
        view.findViewById<TextView>(R.id.transacao_data).text = transacao.date.formatForBrazil()




   return view
    }



}