package com.activation.lobby.listeners.player

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerDropItemEvent

class PlayerDropItemListener: Listener {
    @EventHandler
    fun on(event: PlayerDropItemEvent) {
        val type = event.itemDrop.itemStack.type

        if (type == Material.NETHER_STAR) {
            event.isCancelled = true
        }
    }
}