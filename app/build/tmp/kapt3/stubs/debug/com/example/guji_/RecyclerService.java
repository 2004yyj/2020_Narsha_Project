package com.example.guji_;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/guji_/RecyclerService;", "", "getPlaceData", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/example/guji_/Model;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface RecyclerService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/places")
    public abstract retrofit2.Call<java.util.ArrayList<com.example.guji_.Model>> getPlaceData();
}