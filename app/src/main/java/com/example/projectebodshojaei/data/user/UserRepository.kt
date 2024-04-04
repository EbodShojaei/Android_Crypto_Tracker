package com.example.projectebodshojaei.data.user

class UserRepository {
    private val users = mutableListOf<User>()

    fun signUp(user: User): Boolean {
        return if (users.none { it.email == user.email }) {
            users.add(user)
            true
        } else {
            false
        }
    }

    fun login(email: String, password: String): User? {
        return users.find { it.email == email && it.password == password }
    }

    fun updateUser(user: User) {
        val index = users.indexOfFirst { it.id == user.id }
        if (index != -1) {
            users[index] = user
        }
    }
}