package com.activation.lobby.listeners.inventory

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryMoveItemEvent

class InventoryMoveItemListener: Listener {
    @EventHandler
    fun on(event: InventoryMoveItemEvent) {
        val type = event.item.type

        if (type == Material.NETHER_STAR) {
            event.isCancelled = true
        }
    }
}