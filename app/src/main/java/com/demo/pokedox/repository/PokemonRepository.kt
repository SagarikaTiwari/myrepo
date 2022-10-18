package com.demo.pokedox.repository

import com.demo.pokedox.data.remote.PokeApi
import com.demo.pokedox.data.remote.responses.Pokemon
import com.demo.pokedox.data.remote.responses.PokemonList
import com.demo.pokedox.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api : PokeApi
){

    suspend fun getPokemonList(limit : Int , offset:Int): Resource<PokemonList> {

    val response = try{
        api.getPokemonList(limit, offset)
    }catch (e: Exception){
        return Resource.Error("An error occured !")
    }
        return Resource.Success(response)
    }


    suspend fun getPokemonInfo(pokemonName : String ): Resource<Pokemon> {

        val response = try{
            api.getPokemonInfo(pokemonName)
        }catch (e: Exception){
            return Resource.Error("An error occured !")
        }
        return Resource.Success(response)
    }
}