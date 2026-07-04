package com.example.artspace.data

import com.example.artspace.R
import com.example.artspace.model.Art

object DataSource {
    val Arts: List<Art> = listOf(
        Art(
            drawableResourceId = R.drawable.gogh_himawari,
            stringResourceTitleId = R.string.painting_les_tournesols_title,
            stringResourceArtistId = R.string.painting_les_tournesols_artist
        ),
        Art(
            drawableResourceId = R.drawable.las_meninas,
            stringResourceTitleId = R.string.painting_las_meninas_title,
            stringResourceArtistId = R.string.painting_las_meninas_artist
        ),
        Art(
            drawableResourceId = R.drawable.mona_lisa,
            stringResourceTitleId = R.string.painting_mona_lisa_title,
            stringResourceArtistId = R.string.painting_mona_lisa_artist
        ),
        Art(
            drawableResourceId = R.drawable.pearl_earring,
            stringResourceTitleId = R.string.painting_meisje_met_de_parel_title,
            stringResourceArtistId = R.string.painting_meisje_met_de_parel_artist
        ),
        Art(
            drawableResourceId = R.drawable.starry_night,
            stringResourceTitleId = R.string.painting_the_starry_night_title,
            stringResourceArtistId = R.string.painting_the_starry_night_artist
        ),
        Art(
            drawableResourceId = R.drawable.the_kiss,
            stringResourceTitleId = R.string.painting_der_kuss_title,
            stringResourceArtistId = R.string.painting_der_kuss_artist
        ),
        Art(
            drawableResourceId = R.drawable.the_nightwatch_by_rembrandt,
            stringResourceTitleId = R.string.painting_de_nachtwacht_title,
            stringResourceArtistId = R.string.painting_de_nachtwacht_artist
        ),
        Art(
            drawableResourceId = R.drawable.the_scream,
            stringResourceTitleId = R.string.painting_skrik_title,
            stringResourceArtistId = R.string.painting_skrik_artist
        )


    )
}