package com.example.guji_

import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.guji_.viewPager.ViewPagerAdapter
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
        when(item.itemId) {
            R.id.food -> {
                pager.currentItem = 0
                return true
            }
            R.id.cafe -> {
                pager.currentItem = 1
                return true
            }
            R.id.market -> {
                pager.currentItem = 2
                return true
            }
            R.id.info -> {
                pager.currentItem = 3
                return true
            }
        }
        return false
    }

}