package com.codepath.apps.restclienttemplate.models

import org.json.JSONObject

class User {

    var name: String = ""
    var screenName: String = ""
    var publicImageUrl: String = ""

    companion object{
        fun fromJSon(jsonObject: JSONObject): User{
            val user = User()
            var name = jsonObject.getString("name")
            user.screenName = jsonObject.getString("screen_name")
            user.publicImageUrl = jsonObject.getString("profile_image_url_https")
            return user
        }
    }
}