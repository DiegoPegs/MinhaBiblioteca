package br.com.dhccorreia.minhabiblioteca

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast

class CustomToast {
    fun showToast(context: Context, mensagem: String) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val customToastroot = inflater.inflate(R.layout.custom_toast, null)

        val customtoast = Toast(context)

        customtoast.view = customToastroot
        val textView = customToastroot.findViewById<View>(R.id.textView1) as TextView
        textView.text = mensagem
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM, 0, 0)
        customtoast.duration = Toast.LENGTH_LONG
        customtoast.show()
    }
}