package ru.airdead.mafiabot.modules.gender

import org.koin.dsl.module
import ru.airdead.mafiabot.modules.gender.api.GenderApi
import ru.airdead.mafiabot.modules.gender.api.IGenderApi
import ru.airdead.mafiabot.modules.gender.data.GenderData
import ru.airdead.mafiabot.modules.gender.representation.GenderRepresentation

val genderModule = module {
    single<IGenderApi> { GenderApi(get()) }
    single { GenderData() }
    single { GenderRepresentation(get(), get()) }
}