package com.example.opaynhrms.model

import java.io.Serializable

data class UserListJson(
    val `data`: List<Data>,
    val message: String
) {
    data class Data(
        val created_at: String,
        val email: String,
        val email_verified_at: Any,
        val id: Int,
        val mobile: String,
        val name: String,
        val profile: Profile,
        val roles: List<Role>,
        val updated_at: String
    ):Serializable {
        data class Profile(
            val clockify_key: Any,
            val clockify_user_id: Any,
            val clockify_workspace_id: Any,
            val created_at: String,
            val id: Int,
            val image: String,
            val updated_at: String,
            val user_id: Int
        ):Serializable

        data class Role(
            val id: Int,
            val name: String,
            val pivot: Pivot
        ) :Serializable{
            data class Pivot(
                val model_id: Int,
                val model_type: String,
                val role_id: Int
            ):Serializable
        }
    }
}