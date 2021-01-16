package com.example.PCSUas0592.ui.detail


import com.example.PCSUas0592.data.model.EventDetail

interface EventDetailView{
    fun showLoading()
    fun hideLoading()
    fun showEventDetail(data: List<EventDetail>)
}