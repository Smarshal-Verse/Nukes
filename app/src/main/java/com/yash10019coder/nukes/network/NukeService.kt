package com.yash10019coder.nukes.network

import io.ktor.client.*

interface NukeService {

    suspend fun getNuclearStatus(): Boolean

    companion object {
        private val ktorHttpClient: HttpClient by lazy {
            ktorHttpClient
        }

        fun create(): NukeService {
            return NukeServiceImpl(ktorHttpClient)
        }
    }
}