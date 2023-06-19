package com.example.ejercicioindividual27

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicioindividual27.databinding.ItemListBinding

class ViewHolder (view: View):RecyclerView.ViewHolder(view){

    val binding = ItemListBinding.bind(view)
    fun render(item: ItemList){
        binding.txtNombre.text = item.nombre
        binding.iconItem.setImageResource(item.icon)
    }
}