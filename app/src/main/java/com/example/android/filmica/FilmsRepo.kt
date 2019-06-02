package com.example.android.filmica

object FilmsRepo {

    val films: MutableList<Film> = mutableListOf()
    get(){
        if(field.isEmpty())
           field.addAll(dummyFilms())
        return field
    }

    fun findFilmById(id:String): Film? {
        return films.find{
            return@find it.id == id
        }
    }


    private fun dummyFilms(): MutableList<Film> {

        return(1..10).map { i: Int ->
            return@map Film (
                id = "${i}",
                titulo = "Film ${i}",
                overview = "Oveview ${i}",
                genere = "Genre ${i}",
                rating = i.toFloat(),
                date = "2019-05-${i}"
            )
            }.toMutableList()
        }
    }

