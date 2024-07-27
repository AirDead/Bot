package ru.airdead.mafiabot.modules.gender.api

import ru.airdead.mafiabot.modules.database.api.IDatabaseApi

interface IGenderApi {
    fun assignGenderRole(userId: String, gender: String)
}

class GenderApi(private val databaseApi: IDatabaseApi) : IGenderApi {
    override fun assignGenderRole(userId: String, gender: String) {
        databaseApi.saveUserGender(userId, gender)
    }
}