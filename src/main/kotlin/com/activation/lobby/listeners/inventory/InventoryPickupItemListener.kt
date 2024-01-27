package com.activation.lobby.listeners.inventory

import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryPickupItemEvent

class InventoryPickupItemListener: Listener {
    @EventHandler
    fun on(event: InventoryPickupItemEvent) {
        val type = event.item.itemStack.type

        if (type == Material.NETHER_STAR) {
            event.isCancelled = true
        }
    }
}