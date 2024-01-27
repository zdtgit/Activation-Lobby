package com.activation.lobby.listeners.player

import com.activation.lobby.extensions.player.openServerMenu
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent

class PlayerInteractListener: Listener {
    @EventHandler
    fun on(event: PlayerInteractEvent) {
        val player = event.player
        val action = event.action
        val type = event.item?.type ?: return

        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            if (type == Material.NETHER_STAR) {
                player.openServerMenu()
            }
        }
    }
}