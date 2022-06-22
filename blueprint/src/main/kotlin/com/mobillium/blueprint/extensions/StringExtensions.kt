package com.mobillium.blueprint.extensions

import com.mobillium.blueprint.utils.DateUtils
import java.util.*

fun String.toDate(inputFormat: DateUtils.InputFormat, locale: Locale = Locale.getDefault()): Date? {
    return DateUtils.dateFromString(this, inputFormat, locale)
}