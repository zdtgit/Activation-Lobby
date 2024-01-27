package com.activation.lobby.extensions.string

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer

val String.mini: Component
    get() = MiniMessage.miniMessage().deserialize(this).decoration(TextDecoration.ITALIC, false)

val String.legacy: Component
    get() = LegacyComponentSerializer.legacyAmpersand().deserialize(this).decoration(TextDecoration.ITALIC, false)