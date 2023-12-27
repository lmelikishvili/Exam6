package com.example.exam6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.example.exam6.databinding.FragmentSecretBinding


class SecretFragment : BaseFragment<FragmentSecretBinding>(FragmentSecretBinding::inflate) {
    var passCode: String = "0934"
    var passCodeList = mutableListOf<String>()
    override fun setup() {
        
        with(binding){
            appCompatButton.setOnClickListener(){getBtnValues(appCompatButton)}
            appCompatButton2.setOnClickListener(){getBtnValues(appCompatButton2)}
            appCompatButton3.setOnClickListener(){getBtnValues(appCompatButton3)}
            appCompatButton4.setOnClickListener(){getBtnValues(appCompatButton4)}
            appCompatButton5.setOnClickListener(){getBtnValues(appCompatButton5)}
            appCompatButton6.setOnClickListener(){getBtnValues(appCompatButton6)}
            appCompatButton7.setOnClickListener(){getBtnValues(appCompatButton7)}
            appCompatButton8.setOnClickListener(){getBtnValues(appCompatButton8)}
            appCompatButton9.setOnClickListener(){getBtnValues(appCompatButton9)}
            appCompatButton11.setOnClickListener(){getBtnValues(appCompatButton11)}
        }

    }

    override fun setupListeners() {


    }

    override fun bindData() {

    }

    fun getBtnValues(btn: AppCompatButton){
        passCodeList.also {
            it.add(btn.text.toString())
        }
        if (passCodeList.size == 4){
            if (passCodeList.joinToString (separator = ""){ it.toString() }.contains(passCode)){
                Toast.makeText(context, "Success", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context, "Passwoce Failed", Toast.LENGTH_LONG).show()
                passCodeList.clear()
            }
        }
        println(btn.text)
    }

}