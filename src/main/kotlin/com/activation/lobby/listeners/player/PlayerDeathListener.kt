package com.activation.lobby.listeners.player

import com.activation.lobby.extensions.player.spawn
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class PlayerDeathListener: Listener {
    @EventHandler
    fun on(event: PlayerDeathEvent) {
        event.isCancelled = true
        event.player.spawn()
    }
}