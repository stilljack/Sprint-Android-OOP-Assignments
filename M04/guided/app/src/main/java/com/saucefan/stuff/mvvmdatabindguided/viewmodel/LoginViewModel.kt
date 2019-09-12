package com.saucefan.stuff.mvvmdatabindguided.viewmodel

import android.opengl.ETC1.isValid
import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.Bindable
import com.saucefan.stuff.mvvmdatabindguided.model.User
import java.lang.reflect.Array.set

class LoginViewModel  {

    private  val user: User =
        User("", "")
    private val successMessage = "Login succeeded."
    private val failedMessage = "Login failed."
    init {

  var user = User("", "")

        @Bindable
        fun toastMessage(): String? = null
            set(value){
                field=value
                no
            }




        @Bindable
        fun getUserEmail():String? {
            return user.email
        }
        @Bindable
        fun getUserPassword() : String {
            return user.password
        }
        fun setUserPassword(email:String) {


        }
        fun onLoginClick():String {
             if (isValid()) {
                return successMessage
            } else  return failedMessage
        }
        fun isValid(): Boolean {
            return !TextUtils.isEmpty(getUserEmail()) &&
                    Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
                    (getUserPassword()?.length ?: 0) > 7
        }
    }

}