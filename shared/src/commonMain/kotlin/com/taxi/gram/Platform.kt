package com.taxi.gram

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform