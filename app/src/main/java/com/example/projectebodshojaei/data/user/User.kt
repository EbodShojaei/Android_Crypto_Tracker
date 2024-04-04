package com.example.projectebodshojaei.data.user

data class User (
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val favorites: MutableSet<String> = mutableSetOf()
)