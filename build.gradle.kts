@file:Suppress("SpellCheckingInspection")

import org.jlleitschuh.gradle.ktlint.KtlintExtension

buildscript {
    extra.apply {
        set("composeVersion", "1.1.1")
        set("daggerVersion", "2.41")
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.android.tools.build:gradle:7.1.2")
        classpath("org.jlleitschuh.gradle:ktlint-gradle:10.2.1")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(uri("https://jitpack.io"))
    }

    apply(plugin = "org.jlleitschuh.gradle.ktlint")
    configure<KtlintExtension> {
        version.set("0.44.0")
        disabledRules.add("no-wildcard-imports")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
