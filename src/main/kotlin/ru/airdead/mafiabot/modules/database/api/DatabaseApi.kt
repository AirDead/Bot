package ru.airdead.mafiabot.modules.database.api

interface IDatabaseApi {
    fun saveUserGender(userId: String, gender: String)
    fun getUserGender(userId: String): String?
}

class DatabaseApi : IDatabaseApi {
    private val userGenders = mutableMapOf<String, String>()

    override fun saveUserGender(userId: String, gender: String) {
        userGenders[userId] = gender
        println(gender)
    }

    override fun getUserGender(userId: String): String? {
        return userGenders[userId]
    }
}