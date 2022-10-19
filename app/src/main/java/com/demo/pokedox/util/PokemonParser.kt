package com.demo.pokedox.util

import android.graphics.Color
import com.demo.pokedox.R
import com.demo.pokedox.data.remote.responses.Stat
import com.demo.pokedox.data.remote.responses.Type
import com.plcoding.jetpackcomposepokedex.ui.theme.*
import java.util.*

object PokemonParser {
    fun getTypeColor(type: Type): androidx.compose.ui.graphics.Color {
        return when (type.type.name.toLowerCase(Locale.ROOT)) {
            "normal" -> TypeNormal
            "fire" -> TypeFire
            "water" -> TypeWater
            "electric" -> TypeElectric
            "grass" -> TypeGrass
            "ice" -> TypeIce
            "ghost" -> TypeGhost
            "steel" -> TypeSteel
            "dragon" -> TypeDragon
            "dark" -> TypeDark
            "grass" -> TypeGrass
            "fairy" -> TypeFairy
            "fighting" -> TypeFighting
            "poison" -> TypePoison
            "psychic" -> TypePsychic
            "bug" -> TypeBug
            else -> androidx.compose.ui.graphics.Color.Black
        }
    }

    fun parseStatToColor(stat: Stat): androidx.compose.ui.graphics.Color {

        return when (stat.stat.name.toLowerCase()) {
            "hp" -> HPColor
            "attack" -> AtkColor
            "defense" -> DefColor
            "special-attack" -> SpAtkColor
            "special-defense" -> SpDefColor
            "speed" -> SpdColor
            else -> androidx.compose.ui.graphics.Color.White
        }
    }


    fun parseStatToAbbr(stat: Stat): String {

        return when (stat.stat.name.toLowerCase()) {
            "hp" -> "HP"
            "attack" -> "Atk"
            "defense" -> "Def"
            "special-attack" -> "SpkAtk"
            "special-defense" -> "SpDef"
            "speed" -> "Atk"
            else -> ""
        }
    }
}