package s8u.studies.myapplication.model.Pokemon

import com.google.gson.annotations.SerializedName

data class PokemonEvolutions(
    @SerializedName("name")
    var evolutionName: String
)