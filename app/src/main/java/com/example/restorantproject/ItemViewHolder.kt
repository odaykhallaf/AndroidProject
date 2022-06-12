package com.example.restorantproject;
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val title = itemView;
    private val itemCount = itemView;
    private val imageView = itemView;

    fun bind(item: ListItem, onItemClickListener: RecyclerAdapter.OnItemClickListener) {
        title.tooltipText = item.title
        itemCount.tooltipText = "${item.itemCount} items"
        Glide.with(itemView).load(item.image).placeholder(R.drawable.placeholder).circleCrop()
            .into(imageView as ImageView)
        itemView.setOnClickListener {
            onItemClickListener.onItemClick(itemView, item, adapterPosition)
        }
    }
}