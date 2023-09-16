package com.proj.project1k

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.project1k.R
import com.example.project1k.databinding.CategoryItemBinding
import com.proj.project1k.model.Category

class CategoryCustomAdapter(var categoryList:ArrayList<Category>):RecyclerView.Adapter<CategoryCustomAdapter.CategoryViewHolder>() {

   // TODO: connect items to their layout references
    class CategoryViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
     val image:ImageView
     val name:TextView
     init {
         image=itemView.findViewById(R.id.item_image)
         name=itemView.findViewById(R.id.item_tv)
     }

    }

   // TODO [1]: create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view=LayoutInflater.from(parent.context)
         .inflate(R.layout.category_item,parent,false)
       return CategoryViewHolder(view)

    }

 // TODO: [2] connect item views to data source
    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

     holder.image.setImageResource(categoryList[position].image)
     holder.name.text=categoryList[position].name

    }

 // TODO[3]: send number of items in the list
    override fun getItemCount(): Int {
       return categoryList.size
    }


}