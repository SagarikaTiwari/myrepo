package com.demo.pokedox.data.models

import com.demo.pokedox.data.remote.responses.Type

data class PokedexListEntry (

    val pokemonName : String ,
    val imageUrl : String ,
    val number : Int,
    val typeList : List<Type>

)