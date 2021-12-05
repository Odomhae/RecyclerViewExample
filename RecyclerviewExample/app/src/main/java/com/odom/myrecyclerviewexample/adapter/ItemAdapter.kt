package com.odom.myrecyclerviewexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.odom.myrecyclerviewexample.R
import com.odom.myrecyclerviewexample.model.Affirmation

class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // ViewHolder 만들기
    // RecyclerView의 단일 목록 항목 뷰를 나타내며 가능한 경우 재사용할 수 있습니다.
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    // RecyclerView의 새 뷰 홀더를 만들기 위해 레이아웃 관리자가 호출합니다(재사용할 수 있는 기존 뷰 홀더가 없는 경우).
    // 뷰 홀더는 단일 목록 항목 뷰를 나타냅니다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //  이 메서드는 목록 항목 뷰의 콘텐츠를 바꾸기 위해 레이아웃 관리자가 호출합니다.
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    // 데이터 세트의 크기를 반환해야 합니다
    override fun getItemCount(): Int {
        return dataset.size
    }

}