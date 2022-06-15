package com.example.vollydatabaseexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.ImageRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textviewhere:TextView=findViewById(R.id.textview1)
        var imageViewhere:ImageView=findViewById(R.id.imageview)

        var stringRequest:StringRequest= StringRequest("https://jackwebsite1248.000webhostapp.com/test.php ",Response.Listener {
response -> textviewhere.setText(response)
        },
            Response.ErrorListener{

        })
        var requestQueue:RequestQueue=Volley.newRequestQueue(applicationContext)
        requestQueue.add(stringRequest)
        var imagerequest:ImageRequest= ImageRequest("https://jackwebsite1248.000webhostapp.com/instaphoto.jpg",Response.Listener {
            response ->  imageViewhere.setImageBitmap(response)
        },0,0,null,null,Response.ErrorListener {

        })
        var imageQueue:RequestQueue=Volley.newRequestQueue(applicationContext)
        imageQueue.add(imagerequest)

    }
}