package com.example.retrofit.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.retrofit.R
import com.example.retrofit.models.MemeElement

class MemeAdapter(private val context: Activity, private val list: MutableList<MemeElement>) :
    ArrayAdapter<MemeElement>(
        context,
        R.layout.meme_list_item, list
    ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var rootView = context.layoutInflater.inflate(R.layout.meme_list_item,null,true)

        val memeTitleText = rootView.findViewById<TextView>(R.id.memeTitleTextView)
        val memeImg = rootView.findViewById<ImageView>(R.id.memeImgView)

        val meme = list.get(position)
        memeTitleText.text = meme.name
        Glide.with(rootView).load(meme.url).into(memeImg)
        return rootView
    }

}