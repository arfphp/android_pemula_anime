package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.title = "About Me"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val photoDrawable = resources.getDrawable(R.drawable.gw, null)
        val ivPhoto = findViewById<ImageView>(R.id.ivProfile)
        ivPhoto.setImageDrawable(photoDrawable)
        val tvName = findViewById<TextView>(R.id.tvName)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)

        tvName.text = "Akbar Ramadhani Firdaus"
        tvEmail.text = "A129D4KY4315@bangkit.academy"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}