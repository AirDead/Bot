package ru.airdead.mafiabot.bot

import dev.kord.core.Kord
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import ru.airdead.mafiabot.modules.database.databaseModule
import ru.airdead.mafiabot.modules.gender.genderModule
import ru.airdead.mafiabot.modules.gender.representation.GenderRepresentation

class App : KoinComponent {
    val genderRepresentation: GenderRepresentation by inject()

    suspend fun start() {
        val kord = Kord("MTIzMzg5NzgxNDc5OTQxNzQyNQ.GjeDL2.MKCpUVEXPj8PrQD4R3HB3PX0h8fo77C3FAMgRg")

        genderRepresentation.registerCommands(kord)
        kord.login()
    }
}

suspend fun main() {
    startKoin {
        modules(databaseModule, genderModule)
    }

    App().start()
}
