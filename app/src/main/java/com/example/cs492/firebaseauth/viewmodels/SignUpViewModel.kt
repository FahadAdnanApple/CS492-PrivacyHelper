package com.example.cs492.firebaseauth.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cs492.domain.model.Response
import com.example.cs492.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class SignupState(
    val loading: Boolean = false,
    val success: String? = "",
    val error: String? = ""
)

@HiltViewModel
class SignupViewModel @Inject constructor(
    private val repo: AuthRepository
): ViewModel() {

    private val _signUpState = Channel<SignupState>()
    val signUpState = _signUpState.receiveAsFlow()
    fun signupUser(name: String, email: String, password: String) = viewModelScope.launch {
        _signUpState.send(SignupState(loading = true))

        if(name.isNullOrBlank() || email.isNullOrBlank() || password.isNullOrBlank()) {
            _signUpState.send(SignupState(error = "Invalid Inputs, entry can't be empty", loading = false, success = ""))
        } else {
            repo.signup(name, email, password).collect {
                when(it) {
                    is Response.Failure -> _signUpState.send(
                        SignupState(error = it.msg, loading = false, success = "")
                    )
                    is Response.Loading -> _signUpState.send(
                        SignupState(error = "", loading = true, success = "")
                    )
                    is Response.Success -> _signUpState.send(
                        SignupState(error = "", loading = false, success = "Signup Successfully")
                    )
                }
            }
        }
    }
}

