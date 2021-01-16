package com.example.PCSUas0592.ui.favorite

import com.example.PCSUas0592.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}