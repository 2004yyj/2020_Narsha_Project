package com.example.guji_

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.FrameLayout
import androidx.core.view.get
import androidx.fragment.app.*
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    val foodFragment = FoodFragment()
    val marketFragment = MarketFragment()
    val cafeFragment = CafeFragment()
    val infoFragment = InfoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = ViewPagerAdapter(this)
        pager.registerOnPageChangeCallback(ViewPagerChangeCallback())
        bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    inner class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int = 4

        override fun createFragment(position: Int): Fragment {
            return when(position) {
                0 -> foodFragment
                1 -> cafeFragment
                2 -> marketFragment
                3 -> infoFragment
                else -> foodFragment
            }
        }
    }

    inner class ViewPagerChangeCallback : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            bottomNavigation.selectedItemId = when(position) {
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