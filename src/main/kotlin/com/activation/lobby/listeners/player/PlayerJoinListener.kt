package com.activation.lobby.listeners.player

import com.activation.lobby.extensions.itemstack.displayName
import com.activation.lobby.extensions.player.spawn
import com.activation.lobby.extensions.string.legacy
import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack

class PlayerJoinListener: Listener {
    @EventHandler
    fun on(event: PlayerJoinEvent) {
        val player = event.player

        player.spawn()

        val inv = player.inventory

        inv.clear()
        inv.setItem(8, ItemStack(Material.NETHER_STAR).displayName("<green>서버 이동"))

        val prefix = PlaceholderAPI.setPlaceholders(player, "%luckperms_prefix%")

        if (!prefix.startsWith("&7")) {
            event.joinMessage("${prefix}${player.name}&e님이 로비에 접속하셨습니다!".legacy)
        } else {
            event.joinMessage(null)
        }
    }
}