package com.example.PCSUas0592.ui.event

import com.example.PCSUas0592.data.model.Event

interface EventView{
    fun showLoading()
    fun hideLoading()
    fun showEventList(data: List<Event>)
}