package com.proj.project1k

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project1k.R
import com.example.project1k.databinding.MostviewedItemBinding
import com.proj.project1k.model.Category
import com.proj.project1k.model.MostViewed

class ViewedCustomAdapter(var viewedList:ArrayList<MostViewed>): RecyclerView.Adapter<ViewedCustomAdapter.MostViewedViewHolder>() {
  //  inner class ViewHolder(val binding: MostviewedItemBinding):RecyclerView.ViewHolder(binding.root)
  // TODO: connect items to their layout references
   class MostViewedViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
       val image:ImageView
       val title:TextView
       val subTitle:TextView
       init {
           image=itemView.findViewById(R.id.image)
           title=itemView.findViewById(R.id.title_tv)
           subTitle=itemView.findViewById(R.id.subtitle_tv)
       }

   }
    // TODO [1]: create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MostViewedViewHolder {
      val view=LayoutInflater.from(parent.context)
        .inflate(R.layout.mostviewed_item,parent,false)
      return MostViewedViewHolder(view)
    }

    // TODO: [2] connect item views to data source
    override fun onBindViewHolder(holder: MostViewedViewHolder, position: Int) {
        holder.image.setImageResource(viewedList[position].profile)
        holder.title.text=viewedList[position].title
        holder.subTitle.text=viewedList[position].subTitle

    }

    override fun getItemCount(): Int {
        return viewedList.size
    }


}
