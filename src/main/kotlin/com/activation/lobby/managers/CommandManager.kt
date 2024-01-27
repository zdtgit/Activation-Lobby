package com.activation.lobby.managers

import com.activation.lobby.ActivationLobby
import com.activation.lobby.commands.SpawnCommand
import org.bukkit.command.TabExecutor

object CommandManager {
    private val plugin = ActivationLobby.instance

    fun init() {
        register("spawn", SpawnCommand())
    }

    private fun register(name: String, executor: TabExecutor) {
        val command = plugin.getCommand(name)

        if (command != null) {
            command.setExecutor(executor)
            command.tabCompleter = executor
        }
    }
}