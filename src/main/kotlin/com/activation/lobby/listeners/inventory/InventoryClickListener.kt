package com.activation.lobby.listeners.inventory

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent

class InventoryClickListener: Listener {
    @EventHandler
    fun on(event: InventoryClickEvent) {
        val type = event.currentItem?.type ?: return

        if (type == Material.NETHER_STAR) {
            event.isCancelled = true
        }
    }
}