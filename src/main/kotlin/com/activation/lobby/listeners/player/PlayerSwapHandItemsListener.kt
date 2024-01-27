package com.activation.lobby.listeners.player

import com.activation.lobby.extensions.player.openServerMenu
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerSwapHandItemsEvent

class PlayerSwapHandItemsListener: Listener {
    @EventHandler
    fun on(event: PlayerSwapHandItemsEvent) {
        val player = event.player

        if (player.isSneaking) {
            event.isCancelled = true

            player.openServerMenu()

            return
        }

        val type = event.offHandItem.type

        if (type == Material.NETHER_STAR) {
            event.isCancelled = true
        }
    }
}