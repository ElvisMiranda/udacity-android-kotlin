package com.example.aboutme

import android.content.Context
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nicknameEdit: EditText
    lateinit var nicknameText: TextView
    lateinit var doneButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        nicknameEdit = findViewById(R.id.nickname_edit)
        nicknameText = findViewById(R.id.nickname_text)
        doneButton = findViewById(R.id.done_button)
        doneButton.setOnClickListener { addNickname(it) }
    }

    private fun addNickname(view: View) {
        nicknameText.text = nicknameEdit.text
        nicknameText.visibility = View.VISIBLE
        nicknameEdit.visibility = View.GONE
        doneButton.visibility = View.GONE

        // Hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}