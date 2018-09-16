package com.example.cesaraugusto.palindromo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.cesaraugusto.palindromo.domain.PalindromoK
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityK : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        bt_verificar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val palindromo = PalindromoK(et_palindromo.text.toString())
        var resposta: String

        resposta = if (palindromo.ehPalindromo())
            " é um palindromo"
        else
            " Não é um palindromo"

        resposta = palindromo.conteudo + resposta
        tv_resposta.text = resposta
    }
}