package com.example.myapplication
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class myAdapter(var data: MutableList<Person>):RecyclerView.Adapter<myAdapter.myViewHolder> ()
{    class myViewHolder(var n:View):RecyclerView.ViewHolder(n)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val item =LayoutInflater.from(parent.context).inflate(R.layout.my_item,parent,false)
        var n =myViewHolder(item)
        return n
    }
    override fun getItemCount(): Int {        return data.size
    }
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val tv1= holder.itemView.findViewById<TextView>(R.id.tv_1)
        val tv2= holder.itemView.findViewById<TextView>(R.id.tv_2)
        var photo = holder.itemView.findViewById<ImageView>(R.id.image)
        tv1.text =data.get(position).name
        tv2.text= data[position].address
        photo.setImageResource(data[position].photo)
    }
}