package com.example.projectebodshojaei.data.user

class UserState(private val userRepository: UserRepository) {
    var currentUser: User? = null

    fun signUp(user: User): Boolean {
        val success = userRepository.signUp(user)
        if (success) {
            currentUser = user
        }
        return success
    }

    fun login(email: String, password: String): Boolean {
        val user = userRepository.login(email, password)
        currentUser = user
        return user != null
    }

    fun updateUser(user: User) {
        userRepository.updateUser(user)
        currentUser = user
    }

    fun toggleFavorite(tokenId: String) {
        val user = currentUser ?: return
        val updatedUser = user.copy(favorites = user.favorites.toMutableSet().apply {
            if (contains(tokenId)) {
                remove(tokenId)
            } else {
                add(tokenId)
            }
        })
        updateUser(updatedUser)

    }
}