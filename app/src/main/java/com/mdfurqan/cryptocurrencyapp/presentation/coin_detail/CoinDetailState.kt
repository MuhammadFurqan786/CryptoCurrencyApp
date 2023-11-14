package com.mdfurqan.cryptocurrencyapp.presentation.coin_detail

import com.mdfurqan.cryptocurrencyapp.domain.model.Coin
import com.mdfurqan.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail?= null,
    val error: String = ""
)