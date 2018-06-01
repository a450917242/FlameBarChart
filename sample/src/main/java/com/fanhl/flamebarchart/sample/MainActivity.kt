package com.fanhl.flamebarchart.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.fanhl.flamebarchart.TravelChart
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = Random()
        chart_travel.data = TravelChart.DefaultData<Item>().apply {
            (1..20).forEach { list.add(Item(random.nextFloat())) }
        }
    }

    data class Item(val y: Float) : TravelChart.IItem {
        override fun getXLabel(): String {
            return "-$y-"
        }

        override fun getYAxis(): Float {
            return y
        }

    }
}
