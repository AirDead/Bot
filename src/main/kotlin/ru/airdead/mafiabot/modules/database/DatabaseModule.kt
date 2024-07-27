package ru.airdead.mafiabot.modules.database

import org.koin.dsl.module
import ru.airdead.mafiabot.modules.database.api.DatabaseApi
import ru.airdead.mafiabot.modules.database.api.IDatabaseApi
import ru.airdead.mafiabot.modules.database.data.DatabaseData
import ru.airdead.mafiabot.modules.database.representation.DatabaseRepresentation

val databaseModule = module {
    single<IDatabaseApi> { DatabaseApi() }
    single { DatabaseData() }
    single { DatabaseRepresentation(get()) }
}