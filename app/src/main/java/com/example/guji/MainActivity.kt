package com.example.guji

import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.guji.viewPager.ViewPagerAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = ViewPagerAdapter(this)
        pager.registerOnPageChangeCallback(ViewPagerChangeCallback())
        bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    inner class ViewPagerChangeCallback : ViewPager2.OnPageChangeCallback() {

        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            bottomNavigation.selectedItemId = when (position) {
                0 -> R.id.food
                1 -> R.id.cafe
                2 -> R.id.market
                3 -> R.id.info
                else -> R.id.food
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        pager.currentItem = when(item.itemId) {
            R.id.food -> 0
            R.id.cafe -> 1
            R.id.market -> 2
            R.id.info -> 3
            else -> 0
        }
        return false
    }

}