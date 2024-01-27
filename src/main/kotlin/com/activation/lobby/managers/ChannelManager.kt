package com.activation.lobby.managers

import com.activation.lobby.ActivationLobby

object ChannelManager {
    private val plugin = ActivationLobby.instance

    fun init() {
        register("BungeeCord")
    }

    private fun register(channel: String) {
        plugin.server.messenger.registerOutgoingPluginChannel(plugin, channel)
    }
}