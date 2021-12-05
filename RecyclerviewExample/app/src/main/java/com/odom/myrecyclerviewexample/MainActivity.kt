package com.odom.myrecyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.odom.myrecyclerviewexample.adapter.ItemAdapter
import com.odom.myrecyclerviewexample.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data.
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        // 콘텐츠를 변경해도 RecyclerView의 레이아웃 크기가 변경되지 않는다는 것을 아는 경우 이 설정을 사용합니다.
        recyclerView.setHasFixedSize(true)
    }
}