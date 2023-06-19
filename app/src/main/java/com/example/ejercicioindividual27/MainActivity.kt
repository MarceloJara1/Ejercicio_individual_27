package com.example.ejercicioindividual27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicioindividual27.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val listaItems = mutableListOf<ItemList>()
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Rellenar el itemList
        for(i in 1..13){
            val nombre = "Item $i"
            val icono = R.drawable.baseline_folder_shared_24

            val item = ItemList(nombre, icono)
            listaItems.add(item)
        }

        initRecyclerView()
    }

    fun initRecyclerView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = Adapter(listaItems)
    }
}