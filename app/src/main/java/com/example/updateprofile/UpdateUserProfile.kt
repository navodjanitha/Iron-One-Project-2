package com.example.updateprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.main.activity_update_user_profile.*

class UpdateUserProfile : AppCompatActivity() {
    private val REQUEST_IMAGE = 100;



    var genderArray = arrayOf("Male", "Female")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_user_profile)


        update_button.setOnClickListener {
            MaterialAlertDialogBuilder(this)
                .setTitle("Update Profile")
                .setMessage("Do you want to update ?")
                .setNeutralButton("Cancel") { dialog, which ->
                    // Respond to neutral button press
                }
                .setNegativeButton("Update") { dialog, which ->
                    // Respond to negative button press
                }
                .show()
        }


        val gender_text_layout = findViewById<TextInputLayout>(R.id.gender_text_layout)


        val dropdowntext = findViewById<AutoCompleteTextView>(R.id.dropdown_item)
        val adapterItem =  ArrayAdapter<String>(this,
            R.layout.dropdown_item, genderArray)
        dropdowntext.setAdapter(adapterItem)
    }
}
