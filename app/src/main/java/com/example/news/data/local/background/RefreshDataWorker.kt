package com.example.news.data.local.background

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.example.news.domain.usecase.UpdateArticlesForAllSubscriptionsUseCase
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class RefreshDataWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParameters: WorkerParameters,
    private val updateArticlesForAllSubscriptionsUseCase: UpdateArticlesForAllSubscriptionsUseCase
) : CoroutineWorker(
    appContext = context,
    params = workerParameters
) {
    override suspend fun doWork(): Result {
        Log.d("RefreshDataWorker", "Start")
        updateArticlesForAllSubscriptionsUseCase()
        Log.d("RefreshDataWorker", "Finish")
        return Result.success()
    }
}