package com.activation.lobby.listeners.player

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.PlayerDeathEvent

class PlayerDeathListener: Listener {
    @EventHandler
    fun on(event: PlayerDeathEvent) {
        event.keepLevel = true
        event.keepInventory = true
    }
}