package com.proj.project1k

import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project1k.R
import com.example.project1k.databinding.MenuActivityBinding
import com.proj.project1k.model.Category
import com.proj.project1k.model.MostViewed

class MenuActivity: AppCompatActivity() {
    lateinit var binding:MenuActivityBinding
    lateinit var categoryCustomAdapter: CategoryCustomAdapter
    lateinit var viewedCustomAdapter: ViewedCustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= MenuActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val profileName = intent.getStringExtra("Username")
        binding.text2.text=profileName
        val loginName=intent.getStringExtra("login")
        binding.text1.text=loginName
        // TODO: [1] getting recycler view by its ID
        val categoryRv=findViewById<RecyclerView>(R.id.category_rv)
        val mostViewedRv=findViewById<RecyclerView>(R.id.viewed_rv)
        // TODO: [2] create layoutManager
       // categoryRv.layoutManager=LinearLayoutManager(this)
        mostViewedRv.layoutManager=LinearLayoutManager(this)
        // TODO: [3] create arraylist to hold data
        val categoryitem = ArrayList<Category>()
        val Mviewed= ArrayList<MostViewed>()
        // TODO: [4] insert data to arraylist
        categoryitem.add(Category(R.drawable.cat_1,"Map"))
        categoryitem.add(Category(R.drawable.cat_2,"Cart"))
        categoryitem.add(Category(R.drawable.cat_3,"Music"))
        categoryitem.add(Category(R.drawable.cat_4,"Inbox"))
        categoryitem.add(Category(R.drawable.cat_1,"Map"))
        categoryitem.add(Category(R.drawable.cat_2,"Cart"))
        categoryitem.add(Category(R.drawable.cat_3,"Music"))
        categoryitem.add(Category(R.drawable.cat_4,"Inbox"))
        Mviewed.add(MostViewed(R.drawable.pic_1,"Browsing Bruges in Belgium","Bruges is one of Europe's best preserved cities"))
        Mviewed.add(MostViewed(R.drawable.pic_2,"Browsing Bruges in Belgium","jjjjjjjjjjjjjjjjjjjj"))
        Mviewed.add(MostViewed(R.drawable.pic_3,"Browsing Bruges in Belgium","Bruges is one of Europe's best preserved cities"))
        Mviewed.add(MostViewed(R.drawable.pic_1,"Browsing Bruges in Belgium","llllllllllllllllllllllllllllllll"))
        Mviewed.add(MostViewed(R.drawable.pic_2,"Browsing Bruges in Belgium","Bruges is one of Europe's best preserved cities"))
        Mviewed.add(MostViewed(R.drawable.pic_1,"Browsing Bruges in Belgium","jjjjjjjjjjjjjjjjjjjjjjjjjjjjjj "))
        // TODO: [5] create an adapter reference
        val categoryadapt= CategoryCustomAdapter(categoryitem)
        val viewedadapt= ViewedCustomAdapter(Mviewed)
        // TODO: [6] setting up the adapter with the RecyclerView
        categoryRv.adapter=categoryadapt
        mostViewedRv.adapter=viewedadapt



        


    }
}