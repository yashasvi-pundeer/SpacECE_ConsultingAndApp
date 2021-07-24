package com.sphydro.spaece_activity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sphydro.spaece_activity.Model.consultantDetail
import com.sphydro.spaece_activity.R

class Adapter(val list : List<consultantDetail>) : RecyclerView.Adapter<viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.consultant_detail_card, parent ,false)
        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val name = list[position].userName
        holder.UserName.text = name
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
class viewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    val UserName : TextView = itemView.findViewById(R.id.username)
    val LicenseNo : TextView = itemView.findViewById(R.id.licnesNo)
    val Email : TextView = itemView.findViewById(R.id.email)
    val PhoneNo : TextView = itemView.findViewById(R.id.phoneNo)

}