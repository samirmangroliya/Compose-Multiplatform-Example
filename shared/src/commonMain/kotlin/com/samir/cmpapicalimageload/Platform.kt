package com.samir.cmpapicalimageload

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform