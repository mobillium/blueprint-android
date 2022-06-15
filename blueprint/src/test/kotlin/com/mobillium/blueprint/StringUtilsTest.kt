package com.mobillium.blueprint

import com.mobillium.blueprint.utils.StringUtils
import org.junit.Assert.assertEquals
import org.junit.Test

class StringUtilsTest {

    @Test
    fun `Valid password given output expected as true`() {
        val given = "12345678"
        val expected = true

        assertEquals(expected, StringUtils.isPasswordValid(given))
    }

    @Test
    fun `Invalid password given output expected as false`() {
        val given = "1234"
        val expected = false

        assertEquals(expected, StringUtils.isPasswordValid(given))
    }

    @Test
    fun `Valid email given output expected as true`() {
        val given = "ramazan.ogunc@mobillium.com"
        val expected = true

        assertEquals(expected, StringUtils.isEmailValid(given))
    }

    @Test
    fun `Invalid email given output expected as false`() {
        val given = "ramazan.ogunc@mobillium."
        val expected = false

        assertEquals(expected, StringUtils.isEmailValid(given))
    }
}