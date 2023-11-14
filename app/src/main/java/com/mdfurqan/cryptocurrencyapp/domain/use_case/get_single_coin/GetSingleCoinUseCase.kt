package com.mdfurqan.cryptocurrencyapp.domain.use_case.get_single_coin

import com.mdfurqan.cryptocurrencyapp.common.Resource
import com.mdfurqan.cryptocurrencyapp.data.remote.dto.toCoin
import com.mdfurqan.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.mdfurqan.cryptocurrencyapp.domain.model.Coin
import com.mdfurqan.cryptocurrencyapp.domain.model.CoinDetail
import com.mdfurqan.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetSingleCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId:String) : Flow<Resource<CoinDetail>> = flow {

        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))

        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An Unexpected Error Occurred"))
        }catch (e: IOException){
            emit(Resource.Error("Couldn't reach server. Please Check Your internet connection"))
        }
    }
}