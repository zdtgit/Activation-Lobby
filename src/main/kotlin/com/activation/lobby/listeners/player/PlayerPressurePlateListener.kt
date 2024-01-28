package com.activation.lobby.listeners.player

import com.activation.lobby.events.player.PlayerPressurePlateEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener

class PlayerPressurePlateListener: Listener {
    @EventHandler
    fun on(event: PlayerPressurePlateEvent) {
        val player = event.player
        val type = event.type
    }
}