package com.example.myapplication
import android.content.Context
import com.android.volley.Request
import androidx.compose.runtime.MutableState
import android.util.Log

import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.StringRequest
import org.json.JSONObject

fun volleyRequest(context: Context,cardNum:MutableState<String>,cardExp:MutableState<String>){
    val queue= Volley.newRequestQueue(context)
    val url="http://192.168.252.117:7885/credit_cards"
    var response:JSONObject
    val stringRequest=StringRequest(
        Request.Method.GET,url,
        {
            Log.d("Success", "simpleRequest:${it}")
            response = JSONObject(it)

            cardNum.value = response.getString("credit_card_number")
            cardExp.value = response.getString("credit_card_expiry_date")
        },{

            cardNum.apply { "0000-0000-0000-0000" }
            cardExp.apply { "9999-12-31" }
            Log.d("Error","simpleRequest:${it}")
        })
    queue.add(stringRequest)
}
