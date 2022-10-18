package com.demo.pokedox.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.demo.pokedox.pokemonlist.PokemonDetailScreen
import com.demo.pokedox.pokemonlist.PokemonListScreen
import java.util.*

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.PokemonList.route)
    {
        composable(route = Screens.PokemonList.route){
            PokemonListScreen(navController)
        }

        composable("pokemon_detail_screen/{dominantColor}/{pokemonName}",
            arguments = listOf(
                navArgument("dominantColor"){
                    type = NavType.IntType
                },
                navArgument("pokemonName"){
                    type = NavType.StringType
                }
            )){
            val dominantColor = remember {
                val  color = it.arguments?.getInt("dominantColor")
                color?.let{ Color(it) }?: Color.White
            }

            val pokemonName = remember {
                it.arguments?.getString("pokemonName")
            }

            PokemonDetailScreen(
                dominantColor = dominantColor ,
                pokemonName = pokemonName?.toLowerCase(Locale.ROOT)?:"",
                navController = navController)
        }
    }
}

