package com.madura.pokedex.pokemonDetail

import androidx.lifecycle.ViewModel
import com.madura.pokedex.data.remote.responses.Pokemon
import com.madura.pokedex.repository.PokemonRepository
import com.madura.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {
    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}