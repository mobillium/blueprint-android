package com.mobillium.blueprint.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * @author karacca
 * @date 8.06.2022
 */

object DateUtils {

    fun formatDate(
        date: Date,
        format: OutputFormat,
        locale: Locale
    ): String {
        return SimpleDateFormat(format.value, locale).format(date)
    }

    enum class OutputFormat(val value: String) {
        DD_MM_YYYY("dd.MM.yyyy"),
        DD_MM_YYYY_HH_MM("dd.MM.yyyy HH:mm")
    }
}
