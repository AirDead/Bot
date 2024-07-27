package ru.airdead.mafiabot.modules.gender.representation

import dev.kord.core.Kord
import dev.kord.core.event.interaction.ChatInputCommandInteractionCreateEvent
import dev.kord.core.on
import dev.kord.rest.builder.interaction.GlobalMultiApplicationCommandBuilder
import dev.kord.rest.builder.interaction.string
import ru.airdead.mafiabot.modules.gender.api.IGenderApi
import ru.airdead.mafiabot.modules.gender.data.GenderData

class GenderRepresentation(private val api: IGenderApi, private val data: GenderData) {
    suspend fun registerCommands(kord: Kord) {
        kord.on<ChatInputCommandInteractionCreateEvent> {
            if (interaction.command.rootName == "gender") {
                val gender = interaction.command.options["gender"]?.value.toString()
                api.assignGenderRole(interaction.user.id.toString(), gender)
            }
        }

        kord.createGlobalApplicationCommands {
            input("gender", "Выберите гендер") {
                string("gender", "Гендер") {
                    required = true
                }
            }
        }
    }
}