package com.aria.refactortechniques.scenario

class Packet {

    fun getOriginator(): String {
        return "ORIGINATOR!"
    }

    fun getLength(): Int {
        return 200
    }

    fun hasValidCheckSum(): Boolean {
        return true
    }
}
