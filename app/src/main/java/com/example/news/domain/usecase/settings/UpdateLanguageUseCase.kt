package com.example.news.domain.usecase.settings

import com.example.news.domain.entity.Language
import com.example.news.domain.repository.SettingsRepository
import javax.inject.Inject

class UpdateLanguageUseCase @Inject constructor(
    private val settingsRepository: SettingsRepository
) {

    suspend operator fun invoke(language: Language) =
        settingsRepository.updateLanguage(language)
}