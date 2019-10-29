package com.aria.refactortechniques

import com.aria.refactortechniques.scenario.Packet
import com.aria.refactortechniques.solution.RSCWorkflow_solution
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RSCWorkflowTest {

    private lateinit var workflow: RSCWorkflow_solution
    private lateinit var packet: Packet

    @Before
    fun setUp() {
        // workflow = RSCWorkflow_solution() // Can't put it in a test harness
    }

    @Test
    fun `given invalid packet should fail`() {
        val packet = givenInvalidPacket()
        assertEquals(RSCWorkflow_solution.validatePacket(packet), false)
    }

    fun givenInvalidPacket(): Packet {
        return Packet()
    }
}