package com.example.uthtodo

import androidx.annotation.DrawableRes

/**
 * Class OOP đại diện cho đối tượng nội dung từng bước Onboarding
 */
data class OnboardingItem(
    val title: String,
    val description: String,
    @param:DrawableRes val imageRes: Int = 0,
)