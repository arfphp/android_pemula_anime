package com.example.recyclerview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_HERO = "extra_hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvDetailName = findViewById<TextView>(R.id.tv_name_detail)
        val tvDetailDescription = findViewById<TextView>(R.id.tv_description_detail)
        val ivDetailPhoto = findViewById<ImageView>(R.id.img_photo_detail)

        val dataHero = intent.getParcelableExtra<Hero>(EXTRA_HERO)
        if (dataHero != null) {
            supportActionBar?.title = dataHero.name

            tvDetailName.text = dataHero.name
            tvDetailDescription.text = dataHero.description
            Glide.with(this).load(dataHero.photo).into(ivDetailPhoto)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}