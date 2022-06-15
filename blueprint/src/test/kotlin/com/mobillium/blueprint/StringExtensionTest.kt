package com.mobillium.blueprint

import com.mobillium.blueprint.extensions.toDate
import com.mobillium.blueprint.utils.DateUtils
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.*

class StringExtensionTest {

    private lateinit var dateString: String

    @Before
    fun setup() {
        dateString = "2020-10-08T13:30:00.000Z"
    }

    @Test
    fun `String date given output expected as Date object`() {
        val given = dateString.toDate(
            DateUtils.InputFormat.YYYY_MM_DDTHH_MM_SS_SSS,
            Locale.getDefault()
        )

        val expected = DateUtils.dateFromString(
            dateString,
            DateUtils.InputFormat.YYYY_MM_DDTHH_MM_SS_SSS,
            Locale.getDefault()
        )
        assertEquals(given, expected)
    }
}