package com.demo.pokedox.navigation


sealed class Screens(val route: String) {
    object PokemonList: Screens("pokemon_list_screen")
    object PokemonDetail: Screens("pokemon_detail_screen")
 }