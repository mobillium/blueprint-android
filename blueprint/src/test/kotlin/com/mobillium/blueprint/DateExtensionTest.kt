package com.mobillium.blueprint

import com.mobillium.blueprint.extensions.format
import com.mobillium.blueprint.utils.DateUtils
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.*

/**
 * @author karacca
 * @date 8.06.2022
 */

class DateExtensionTest {

    private lateinit var date: Date

    @Before
    fun setup() {
        date = Calendar.getInstance().apply {
            set(Calendar.YEAR, 2022)
            set(Calendar.MONTH, 5)
            set(Calendar.DAY_OF_MONTH, 8)
            set(Calendar.HOUR_OF_DAY,1)
            set(Calendar.MINUTE, 1)
        }.time
    }

    @Test
    fun `Date given output expected as DD_MM_YYYY`() {
        val given = date.format(DateUtils.OutputFormat.DD_MM_YYYY)
        val expected = "08.06.2022"
        assertEquals(given, expected)
    }

    @Test
    fun `Date given output expected as DD_MM_YYYY_HH_MM`() {
        val given = DateUtils.formatDate(
            date,
            DateUtils.OutputFormat.DD_MM_YYYY_HH_MM,
            Locale.getDefault()
        )

        val expected = "08.06.2022 01:01"
        assertEquals(given, expected)
    }
}
