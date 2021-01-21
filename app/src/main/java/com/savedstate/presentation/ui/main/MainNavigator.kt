package com.savedstate.presentation.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.savedstate.R
import com.savedstate.presentation.ui.common.BaseActivityNavigator
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

interface MainNavigator {
    fun navigateToFirstExample()
    fun navigateToSecondExample()
    fun navigateToThirdExample()
    fun navigateToMain()
}

@ActivityScoped
class MainActivityNavigator @Inject constructor(
    @ActivityContext private val activity: AppCompatActivity
) : BaseActivityNavigator(), MainNavigator {

    override val navController: NavController
        get() = activity.findNavController(R.id.navContainerMain)

    override fun navigateToFirstExample() {
        navigate(R.id.exampleFirstFragment)
    }

    override fun navigateToSecondExample() {
        navigate(R.id.exampleSecondFragment)
    }

    override fun navigateToThirdExample() {
        navigate(R.id.exampleThirdFragment)
    }

    override fun navigateToMain() {
        navigate(R.id.mainFragment)
    }
}