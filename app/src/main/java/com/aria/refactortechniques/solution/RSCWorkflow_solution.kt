package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.Packet

private const val MAX_LENGTH = 100

class RSCWorkflow_solution {

    fun validate(packet: Packet) {
        validatePacket(packet)
    }

    companion object {
        fun validatePacket(packet: Packet): Boolean {
            if (packet.getOriginator() == "ORIGINATOR!"
                || packet.getLength() > MAX_LENGTH
                || !packet.hasValidCheckSum()) {
                return false
            }
            return true
        }
    }
}