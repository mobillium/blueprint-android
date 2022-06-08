package com.mobillium.blueprint

import com.mobillium.blueprint.utils.DateUtils
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.*

/**
 * @author karacca
 * @date 8.06.2022
 */

class DateUtilsTest {

    private lateinit var date: Date

    @Before
    fun setup() {
        date = Calendar.getInstance().apply {
            set(Calendar.YEAR, 2022)
            set(Calendar.MONTH, 5)
            set(Calendar.DAY_OF_MONTH, 8)
        }.time
    }

    @Test
    fun `Date given output expected as DD_MM_YYYY`() {
        val given = DateUtils.formatDate(
            date,
            DateUtils.OutputFormat.DD_MM_YYYY,
            Locale.getDefault()
        )

        val expected = "08.06.2022"
        assertEquals(given, expected)
    }
}