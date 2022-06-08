package com.mobillium.blueprint.extensions

import com.mobillium.blueprint.utils.DateUtils
import java.util.*

/**
 * @author karacca
 * @date 8.06.2022
 */

fun Date.format(format: DateUtils.OutputFormat, locale: Locale = Locale.getDefault()) =
    DateUtils.formatDate(this, format, locale)
