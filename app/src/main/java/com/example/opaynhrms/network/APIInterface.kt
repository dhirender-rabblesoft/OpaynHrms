package com.example.opaynhrms.network

 import com.example.opaynhrms.model.LoginJson
 import com.google.gson.JsonObject
 import okhttp3.MultipartBody

 import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*
 import java.util.ArrayList


interface APIInterface
{
    @Headers("Accept: application/json")
    @POST("login")
    fun login(@Body jsonObject: JsonObject?): Call<LoginJson>?
    @Headers("Accept: application/json")
    @POST("")
    fun commonpost(@Url url:String,@Body jsonObject: JsonObject?): Call<ResponseBody>?
    @Headers("Accept: application/json")
    @POST("")
    fun commonpostwithtoken(@Url url:String,@Header("Authorization") token: String,@Body jsonObject: JsonObject?): Call<ResponseBody>
    @Headers("Accept: application/json")
    @Multipart
    @POST("user/update")
    fun updateuser(

        @Header("Authorization") token: String,
        @Part fields: ArrayList<MultipartBody.Part>
    ): Call<LoginJson>

}