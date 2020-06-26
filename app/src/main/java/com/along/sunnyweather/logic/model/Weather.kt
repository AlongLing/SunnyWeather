package com.along.sunnyweather.logic.model

// 将当前的天气数据和未来几天的天气数据封装成一个 Weather 数据。
class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily) {
}