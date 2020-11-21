package com.example.guji.viewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.guji.mainFragments.CafeFragment
import com.example.guji.mainFragments.FoodFragment
import com.example.guji.mainFragments.InfoFragment
import com.example.guji.mainFragments.MarketFragment

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    private val foodFragment = FoodFragment()
    private val marketFragment = MarketFragment()
    private val cafeFragment = CafeFragment()
    private val infoFragment = InfoFragment()

    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> foodFragment
            1 -> cafeFragment
            2 -> marketFragment
            3 -> infoFragment
            else -> foodFragment
        }
    }
}