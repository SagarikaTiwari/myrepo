package com.demo.pokedox.viewmodel

import androidx.lifecycle.ViewModel
import com.demo.pokedox.data.remote.responses.Pokemon
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
}