package com.activation.lobby.events.player

import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class PlayerPressurePlateEvent(val player: Player, val type: Material): Event() {
    override fun getHandlers(): HandlerList {
        return handlers
    }

    companion object {
        private val handlers = HandlerList()

        @JvmStatic
        fun getHandlerList(): HandlerList {
            return handlers
        }
    }
}