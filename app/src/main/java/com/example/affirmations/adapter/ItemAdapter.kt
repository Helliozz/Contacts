package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Employee


class ItemAdapter(
    private val context: Context,
    private val dataset: ArrayList<Employee>,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private val typeP = 1
    private val typeN = 0

    class NormalVievHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val number: TextView = view.findViewById(R.id.number)
        fun setNormalDetails(text: String, num: String) {
            name.text = text
            number.text = num
        }
    }

    class PremiumViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val number: TextView = view.findViewById(R.id.number)
        fun setPremiumDetails(text: String, num: String) {
            name.text = text
            number.text = num
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (dataset[position].prem) typeP
            else typeN
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        return if (viewType == typeP) {
            view = LayoutInflater.from(context).inflate(R.layout.item_premium, parent, false)
            PremiumViewHolder(view)
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.item_normal, parent, false)
            NormalVievHolder(view)
        }
    }

   override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == typeP) {
            (holder as PremiumViewHolder).setPremiumDetails(
                dataset[position].name, dataset[position].number
            )
        } else (holder as NormalVievHolder).setNormalDetails(
            dataset[position].name, dataset[position].number
        )
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}

