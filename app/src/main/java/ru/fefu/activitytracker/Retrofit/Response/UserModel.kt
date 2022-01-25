package ru.fefu.activitytracker.Retrofit.Response

data class UserModel (
    val id: Long,
    val name: String,
    val login: String,
    val gender: GenderModel,
)