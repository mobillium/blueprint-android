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

    fun dateFromString(
        dateString: String,
        format: InputFormat,
        locale: Locale
    ): Date? {
        return SimpleDateFormat(format.value, locale).parse(dateString)
    }

    fun dateFromString(
        dateString: String,
        dateFormat: String,
        locale: Locale
    ): Date? {
        return SimpleDateFormat(dateFormat, locale).parse(dateString)
    }

    enum class OutputFormat(val value: String) {
        DD_MM_YYYY("dd.MM.yyyy")
    }

    enum class InputFormat(val value: String) {
        DD_MM_YYYY("dd.MM.yyyy"),
        YYYY_MM_DDTHH_MM_SS_SSS("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    }
}
