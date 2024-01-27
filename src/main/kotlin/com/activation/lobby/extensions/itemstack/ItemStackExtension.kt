package com.activation.lobby.extensions.itemstack

import com.activation.lobby.extensions.string.mini
import org.bukkit.inventory.ItemStack

fun ItemStack.displayName(displayName: String): ItemStack {
    itemMeta = itemMeta.apply {
        displayName(displayName.mini)
    }

    return this
}

fun ItemStack.lore(vararg lore: String): ItemStack {
    itemMeta = itemMeta.apply {
        lore(lore.map { it.mini })
    }

    return this
}

fun ItemStack.amount(amount: Int): ItemStack {
    this.amount = amount

    return this
}