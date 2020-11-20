package com.example.guji_;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/example/guji_/MainActivity;", "Landroidx/fragment/app/FragmentActivity;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "cafeFragment", "Lcom/example/guji_/CafeFragment;", "getCafeFragment", "()Lcom/example/guji_/CafeFragment;", "foodFragment", "Lcom/example/guji_/FoodFragment;", "getFoodFragment", "()Lcom/example/guji_/FoodFragment;", "infoFragment", "Lcom/example/guji_/InfoFragment;", "getInfoFragment", "()Lcom/example/guji_/InfoFragment;", "marketFragment", "Lcom/example/guji_/MarketFragment;", "getMarketFragment", "()Lcom/example/guji_/MarketFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "ViewPagerAdapter", "ViewPagerChangeCallback", "app_debug"})
public final class MainActivity extends androidx.fragment.app.FragmentActivity implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    private final com.example.guji_.FoodFragment foodFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.guji_.MarketFragment marketFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.guji_.CafeFragment cafeFragment = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.guji_.InfoFragment infoFragment = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.guji_.FoodFragment getFoodFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.guji_.MarketFragment getMarketFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.guji_.CafeFragment getCafeFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.guji_.InfoFragment getInfoFragment() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/example/guji_/MainActivity$ViewPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fa", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/example/guji_/MainActivity;Landroidx/fragment/app/FragmentActivity;)V", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "app_debug"})
    public final class ViewPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment createFragment(int position) {
            return null;
        }
        
        public ViewPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity fa) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/example/guji_/MainActivity$ViewPagerChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lcom/example/guji_/MainActivity;)V", "onPageSelected", "", "position", "", "app_debug"})
    public final class ViewPagerChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
        
        public ViewPagerChangeCallback() {
            super();
        }
    }
}