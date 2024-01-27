package com.activation.lobby.extensions.player

import com.activation.lobby.ActivationLobby
import com.activation.lobby.extensions.itemstack.displayName
import com.activation.lobby.extensions.itemstack.lore
import com.activation.lobby.extensions.string.mini
import com.google.common.io.ByteStreams
import io.github.monun.invfx.InvFX
import io.github.monun.invfx.openFrame
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

fun Player.spawn() {
    val world = Bukkit.getWorld("world")!!
    val location = Location(world, 0.5, 1.0, 0.5, -90f, 0f)

    this.teleport(location)
}

fun Player.connect(server: String) {
    val out = ByteStreams.newDataOutput()

    out.writeUTF("Connect")
    out.writeUTF(server)

    this.sendPluginMessage(ActivationLobby.instance, "BungeeCord", out.toByteArray())
}

fun Player.openServerMenu() {
    val frame = InvFX.frame(3, "서버 이동".mini) {
        val p = this@openServerMenu

        slot(1, 1) {
            item = ItemStack(Material.EMERALD_BLOCK).displayName("<green><bold>로비")

            onClick {
                p.spawn()
            }
        }
        slot(3, 1) {
            item = ItemStack(Material.GRASS_BLOCK).displayName("<green><bold>야생")

            onClick {
                p.connect("survival")
            }
        }
        slot(5, 1) {
            item = ItemStack(Material.WOODEN_AXE).displayName("<green><bold>건축")

            onClick {
                p.connect("build")
            }
        }
        slot(7, 1) {
            item = ItemStack(Material.DIAMOND_SWORD).displayName("<green><bold>반야생").lore("<red>개발 중...")

            onClick {
                p.sendMessage("<red>개발 중...".mini)
            }
        }
    }

    this.openFrame(frame)
}