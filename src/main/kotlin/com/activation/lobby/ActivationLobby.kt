package com.activation.lobby

import com.activation.lobby.managers.ChannelManager
import com.activation.lobby.managers.CommandManager
import com.activation.lobby.managers.ListenerManager
import org.bukkit.plugin.java.JavaPlugin

class ActivationLobby: JavaPlugin() {
    override fun onEnable() {
        ChannelManager.init()
        CommandManager.init()
        ListenerManager.init()
    }

    companion object {
        val instance: ActivationLobby
            get() = getPlugin(ActivationLobby::class.java)
    }
}