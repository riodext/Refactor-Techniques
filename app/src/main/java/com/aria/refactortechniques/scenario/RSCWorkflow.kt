package com.aria.refactortechniques.scenario

import com.aria.refactortechniques.solution.RSCWorkflow_solution

private const val MAX_LENGTH = 100

class RSCWorkflow {

    fun validate(packet: Packet): Boolean {
        if (packet.getOriginator() == "ORIGINATOR!"
            || packet.getLength() > MAX_LENGTH
            || !packet.hasValidCheckSum()) {
            return false
        }
        return true
    }
}