package com.saucefan.stuff.m01assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.saucefan.stuff.m01assignment.recycleview.Adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var shopingItemList = mutableListOf<ShoppingItem>()
        val manager = StaggeredGridLayoutManager(10, StaggeredGridLayoutManager.HORIZONTAL)
        val adapter = Adapter(ItemMockData)
        recycle_view.layoutManager = manager
        recycle_view.adapter = adapter



    }
}
