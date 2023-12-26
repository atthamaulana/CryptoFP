package com.example.CryptoFP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.cryptofp.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Event saat button retronft di klik
        findViewById<ImageButton>(R.id.imagebuttonretro).setOnClickListener {
            replaceFragment(FragmentNFT())
        }
        findViewById<TextView>(R.id.textbuttonretro).setOnClickListener {
            replaceFragment(FragmentNFT())
        }

        // Event saat button sharknft di klik
        findViewById<ImageButton>(R.id.imagebuttonshark).setOnClickListener {
            replaceFragment(FragmentCrypto())
        }
        findViewById<TextView>(R.id.textbuttonshark).setOnClickListener {
            replaceFragment(FragmentCrypto())
        }

        // Event saat button racernft di klik
        findViewById<ImageButton>(R.id.imagebuttonracer).setOnClickListener {
            replaceFragment(RacerFragment())
        }
        findViewById<TextView>(R.id.textbuttonracer).setOnClickListener {
            replaceFragment(RacerFragment())
        }
    }

    // Ganti fragment
    private fun replaceFragment(frg: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentbutton, frg)
        fragmentTrx.commit()
    }
}
