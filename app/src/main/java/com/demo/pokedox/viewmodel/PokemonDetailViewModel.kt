package com.demo.pokedox.viewmodel

import androidx.lifecycle.ViewModel
import com.demo.pokedox.data.remote.responses.*
import com.demo.pokedox.navigation.Screens
import com.demo.pokedox.repository.PokemonRepository
import com.demo.pokedox.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository : PokemonRepository
): ViewModel() {

    suspend  fun getPokemonInfo(pokemonName : String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }

    suspend fun getPokemonDescription(pokemonName : String): Resource<PokemonDescription> {
        return repository.getPokemonDescription(pokemonName)
    }

    suspend fun getPokemonType(number : String):Resource<PokemonType>{
        return repository.getPokemonTypeForWeaknessandability(number)
    }

    suspend fun getPokemonEvolutionChain(number : String):Resource<PokemonEvolutionChain>{
        return repository.getPokemonEvolutionChain(number)
    }

    suspend fun getPokemonGender(number : String): Resource<PokemonGender> {
    return repository.getPokemonGender(number)
    }
}