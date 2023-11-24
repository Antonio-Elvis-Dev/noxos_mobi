package com.example.noxos_mobi.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.noxos_mobi.R
import com.example.noxos_mobi.databinding.ActivityMainNavBinding
import com.example.noxos_mobi.fragments.Home
import com.example.noxos_mobi.fragments.Pedido
import com.example.noxos_mobi.fragments.Producao
import com.example.noxos_mobi.fragments.Search

class Main : AppCompatActivity() {
    private lateinit var binding: ActivityMainNavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainNavBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.btNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> replaceFragment(Home())
                R.id.ic_search -> replaceFragment(Search())
                R.id.ic_clip -> replaceFragment(Pedido())
                R.id.ic_box -> replaceFragment(Producao())
            }
            true
        }
    }

    private fun replaceFragment (fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}