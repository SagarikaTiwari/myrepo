package com.demo.pokedox.data.remote.responses

data class PokemonType(
    val damage_relations: DamageRelations,
    val game_indices: List<GameIndiceX>,
    val generation: GenerationXXX,
    val id: Int,
    val move_damage_class: MoveDamageClass,
    val moves: List<MoveXX>,
    val name: String,
    val names: List<NameXX>,
    val past_damage_relations: List<Any>,
    val pokemon: List<PokemonXXX>
)