package com.demo.pokedox.data.remote.responses

data class PokemonGender(
    val id: Int,
    val name: String,
    val pokemon_species_details: List<PokemonSpeciesDetail>,
    val required_for_evolution: List<RequiredForEvolution>
)