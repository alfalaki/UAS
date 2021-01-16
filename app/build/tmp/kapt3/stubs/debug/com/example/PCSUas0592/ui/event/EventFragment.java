package com.example.PCSUas0592.ui.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0016\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/example/PCSUas0592/ui/event/EventFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/PCSUas0592/ui/event/EventView;", "()V", "adapter", "Lcom/example/PCSUas0592/ui/event/EventAdapter;", "event", "", "getEvent", "()Ljava/lang/String;", "setEvent", "(Ljava/lang/String;)V", "events", "", "Lcom/example/PCSUas0592/data/model/Event;", "listEvent", "Landroidx/recyclerview/widget/RecyclerView;", "presenter", "Lcom/example/PCSUas0592/ui/event/EventPresenter;", "progressBar", "Landroid/widget/ProgressBar;", "hideLoading", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "showEventList", "data", "", "showLoading", "Companion", "app_debug"})
public final class EventFragment extends androidx.fragment.app.Fragment implements com.example.PCSUas0592.ui.event.EventView {
    private androidx.recyclerview.widget.RecyclerView listEvent;
    private android.widget.ProgressBar progressBar;
    private java.util.List<com.example.PCSUas0592.data.model.Event> events;
    private com.example.PCSUas0592.ui.event.EventPresenter presenter;
    private com.example.PCSUas0592.ui.event.EventAdapter adapter;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String event = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.PCSUas0592.ui.event.EventFragment.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEvent() {
        return null;
    }
    
    public final void setEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void showEventList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.PCSUas0592.data.model.Event> data) {
    }
    
    public EventFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/PCSUas0592/ui/event/EventFragment$Companion;", "", "()V", "newInstance", "Lcom/example/PCSUas0592/ui/event/EventFragment;", "event", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.PCSUas0592.ui.event.EventFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String event) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}