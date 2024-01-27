package com.activation.lobby.listeners.player

import com.activation.lobby.extensions.player.spawn
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

class PlayerMoveListener: Listener {
    @EventHandler
    fun on(event: PlayerMoveEvent) {
        val player = event.player

        if (player.y <= -40) {
            player.spawn()
        }
    }
}