package com.activation.lobby.managers

import com.activation.lobby.ActivationLobby
import com.activation.lobby.listeners.inventory.InventoryClickListener
import com.activation.lobby.listeners.inventory.InventoryMoveItemListener
import com.activation.lobby.listeners.inventory.InventoryPickupItemListener
import com.activation.lobby.listeners.player.*
import org.bukkit.event.Listener

object ListenerManager {
    private val plugin = ActivationLobby.instance

    fun init() {
        register(InventoryClickListener())
        register(InventoryMoveItemListener())
        register(InventoryPickupItemListener())

        register(PlayerDeathListener())
        register(PlayerDropItemListener())
        register(PlayerInteractListener())
        register(PlayerJoinListener())
        register(PlayerMoveListener())
        register(PlayerQuitListener())
        register(PlayerSwapHandItemsListener())
    }

    private fun register(listener: Listener) {
        plugin.server.pluginManager.registerEvents(listener, plugin)
    }
}