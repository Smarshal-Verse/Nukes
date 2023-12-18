package com.yash10019coder.nukes.network

import android.util.Log
import io.ktor.client.*
import io.ktor.client.request.*

class NukeServiceImpl(
    private var client: HttpClient
) : NukeService {
    private val TAG = NukeService.javaClass.simpleName

    override suspend fun getNuclearStatus(): Boolean {
        return try {
            client.get { url { encodedPath = ApiRoutes.NUKES } }
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e(TAG, "getNuclearStatus: Error", e)
            return false
        }
    }
}