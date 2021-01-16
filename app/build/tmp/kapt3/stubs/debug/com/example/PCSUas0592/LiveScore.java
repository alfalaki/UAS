package com.example.PCSUas0592;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u00012\u00020\u0002:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/PCSUas0592/LiveScore;", "Landroid/app/Application;", "Lorg/kodein/di/KodeinAware;", "()V", "kodein", "Lorg/kodein/di/LazyKodein;", "getKodein", "()Lorg/kodein/di/LazyKodein;", "onCreate", "", "Companion", "app_debug"})
public final class LiveScore extends android.app.Application implements org.kodein.di.KodeinAware {
    @org.jetbrains.annotations.NotNull()
    private final org.kodein.di.LazyKodein kodein = null;
    public static com.example.PCSUas0592.LiveScore instance;
    public static com.example.PCSUas0592.data.pref.PrefManager prefManager;
    public static com.example.PCSUas0592.data.db.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.PCSUas0592.LiveScore.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.kodein.di.LazyKodein getKodein() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public LiveScore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.kodein.di.KodeinContext<?> getKodeinContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.kodein.di.KodeinTrigger getKodeinTrigger() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8FX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/PCSUas0592/LiveScore$Companion;", "", "()V", "db", "Lcom/example/PCSUas0592/data/db/AppDatabase;", "getDb", "()Lcom/example/PCSUas0592/data/db/AppDatabase;", "setDb", "(Lcom/example/PCSUas0592/data/db/AppDatabase;)V", "instance", "Lcom/example/PCSUas0592/LiveScore;", "getInstance", "()Lcom/example/PCSUas0592/LiveScore;", "setInstance", "(Lcom/example/PCSUas0592/LiveScore;)V", "prefManager", "Lcom/example/PCSUas0592/data/pref/PrefManager;", "getPrefManager", "()Lcom/example/PCSUas0592/data/pref/PrefManager;", "setPrefManager", "(Lcom/example/PCSUas0592/data/pref/PrefManager;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.example.PCSUas0592.LiveScore getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.example.PCSUas0592.LiveScore p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.PCSUas0592.data.pref.PrefManager getPrefManager() {
            return null;
        }
        
        public final void setPrefManager(@org.jetbrains.annotations.NotNull()
        com.example.PCSUas0592.data.pref.PrefManager p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.PCSUas0592.data.db.AppDatabase getDb() {
            return null;
        }
        
        public final void setDb(@org.jetbrains.annotations.NotNull()
        com.example.PCSUas0592.data.db.AppDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}