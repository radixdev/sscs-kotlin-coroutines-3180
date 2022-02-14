package com.radix.myapplication

import android.util.Log
import androidx.annotation.Keep
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

@Keep
object CustomCoroutineScope : CoroutineScope {
    private val exceptionHandler = CoroutineExceptionHandler { _, e ->
        Log.e("TAG", "Got error", e)
    }

    override val coroutineContext: CoroutineContext = Dispatchers.IO + exceptionHandler + SupervisorJob()
}
