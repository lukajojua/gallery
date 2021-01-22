package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.coroutines.coroutineContext
class ProductAdapter(private val photos:List<Photo>)
    : RecyclerView.Adapter<ProductAdapter.PViewHolder>() {
    class PViewHolder(itemVieW: View) : RecyclerView.ViewHolder(itemVieW) {
        val imageView: ImageView = itemVieW.findViewById(R.id.imageView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.random_layout, parent, false)
        return PViewHolder(view)
    }
    override fun onBindViewHolder(holder: PViewHolder, position: Int) {
        val p = photos[position]
        val url: String?=p.url
        Glide.with(holder.imageView.context).load(url).centerCrop().into(holder.imageView)
    }
    override fun getItemCount(): Int = photos.size
}
