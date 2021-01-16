package com.example.PCSUas0592.data.db.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/PCSUas0592/data/db/dao/FavoriteDao;", "", "deleteAll", "", "getAll", "", "Lcom/example/PCSUas0592/data/db/entities/EventFavorite;", "getByid", "id", "", "insert", "eventFavorite", "app_debug"})
public abstract interface FavoriteDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.PCSUas0592.data.db.entities.EventFavorite eventFavorite);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favorite")
    public abstract java.util.List<com.example.PCSUas0592.data.db.entities.EventFavorite> getAll();
    
    @androidx.room.Query(value = "DELETE FROM favorite")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favorite WHERE eventId = :id")
    public abstract java.util.List<com.example.PCSUas0592.data.db.entities.EventFavorite> getByid(int id);
}