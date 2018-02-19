package com.renovavision.kotlinmvvm.domain.model

/**
 * Created by Alexandr Golovach on 13.02.2018.
 */

data class User(
        val id: Int,
        val firstName: String,
        val lastName: String,
        val avatar: String?
)