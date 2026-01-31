package com.example.news.domain.usecase

import com.example.news.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateNotificationsEnabledUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke(enabled: Boolean) =
        settingsRepository.updateNotificationsEnabled(enabled)
}