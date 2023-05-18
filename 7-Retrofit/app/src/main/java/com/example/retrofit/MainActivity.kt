package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.example.retrofit.adapter.MemeAdapter
import com.example.retrofit.configs.APIClient
import com.example.retrofit.models.Meme
import com.example.retrofit.models.MemeElement
import com.example.retrofit.service.MemeService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {

    lateinit var memesService : MemeService
    lateinit var memeListView : ListView
    var memeList = mutableListOf<MemeElement>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        memesService = APIClient.getClient().create(MemeService::class.java)
        memeListView = findViewById(R.id.memesListView)

        getPopularMemes()
    }

    fun getPopularMemes(){
        memesService.getMemes().enqueue(object : Callback<Meme>{
            override fun onResponse(call: Call<Meme>, response: Response<Meme>) {
                var data = response.body()
                if(data!=null){
                    memeList.addAll(data.data.memes)
                    val adapter = MemeAdapter(this@MainActivity,memeList)
                    memeListView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<Meme>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Internet or Server Fail", Toast.LENGTH_LONG)
                    .show()
            }

        })
    }
}