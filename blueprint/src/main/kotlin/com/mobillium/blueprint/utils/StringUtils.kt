package com.mobillium.blueprint.utils

private const val EMAIL_REGEX = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}"

object StringUtils {

    fun isPasswordValid(password: String): Boolean {
        return password.length >= 8
    }

    fun isEmailValid(email: String): Boolean {
        return email.matches(EMAIL_REGEX.toRegex())
    }
}