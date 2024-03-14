package de.syntaxinstitut.nickpodratz.meinerstesandroidprojekt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ncorti.slidetoact.SlideToActView
import de.syntaxinstitut.nickpodratz.mylibrary.MyButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val slider = findViewById<SlideToActView>(R.id.slider)

        val button = MyButton()
    }
}