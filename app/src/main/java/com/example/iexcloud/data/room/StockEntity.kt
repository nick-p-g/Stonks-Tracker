package com.example.iexcloud.data.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Watchlist")
data class StockEntity(
        val avgTotalVolume: Int,
        val calculationPrice: String,
        val change: Double,
        val changePercent: Double,
        val closeSource: String,
        val companyName: String,
        val iexAskPrice: Double,
        val iexAskSize: Int,
        val iexBidPrice: Double,
        val iexBidSize: Int,
        val iexClose: Double,
        val iexCloseTime: Long,
        val iexLastUpdated: Long,
        val iexMarketPercent: Double,
        val iexOpen: Double,
        val iexOpenTime: Long,
        val iexRealtimePrice: Double,
        val iexRealtimeSize: Int,
        val iexVolume: Int,
        val isUSMarketOpen: Boolean,
        val lastTradeTime: Long,
        val latestPrice: Double,
        val latestSource: String,
        val latestTime: String,
        val latestUpdate: Long,
        val marketCap: Long,
        val openSource: String,
        val previousClose: Double,
        val previousVolume: Int,
        val primaryExchange: String,
        @PrimaryKey
        val symbol: String,
        val week52High: Double,
        val week52Low: Double,
        val ytdChange: Double
)