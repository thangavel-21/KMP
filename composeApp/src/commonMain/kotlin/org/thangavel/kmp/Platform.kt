package org.thangavel.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform