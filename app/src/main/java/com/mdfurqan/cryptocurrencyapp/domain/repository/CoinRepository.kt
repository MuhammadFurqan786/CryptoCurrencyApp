package com.mdfurqan.cryptocurrencyapp.domain.repository

import com.mdfurqan.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.mdfurqan.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId:String):CoinDetailDto
}