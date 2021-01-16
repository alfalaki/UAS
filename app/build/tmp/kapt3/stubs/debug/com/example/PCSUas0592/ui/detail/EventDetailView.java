package com.example.PCSUas0592.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcom/example/PCSUas0592/ui/detail/EventDetailView;", "", "hideLoading", "", "showEventDetail", "data", "", "Lcom/example/PCSUas0592/data/model/EventDetail;", "showLoading", "app_debug"})
public abstract interface EventDetailView {
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
    
    public abstract void showEventDetail(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.PCSUas0592.data.model.EventDetail> data);
}