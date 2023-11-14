package com.mdfurqan.cryptocurrencyapp.domain.use_case.get_coins

import com.mdfurqan.cryptocurrencyapp.common.Resource
import com.mdfurqan.cryptocurrencyapp.data.remote.dto.toCoin
import com.mdfurqan.cryptocurrencyapp.domain.model.Coin
import com.mdfurqan.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {

        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))

        }catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An Unexpected Error Occurred"))
        }catch (e: IOException){
            emit(Resource.Error("Couldn't reach server. Please Check Your internet connection"))
        }
    }
}