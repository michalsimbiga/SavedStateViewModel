package com.savedstate.di

import android.content.Context
import com.savedstate.presentation.BaseApplication
import com.savedstate.presentation.ui.main.MainActivity
import com.savedstate.presentation.ui.main.MainActivityNavigator
import com.savedstate.presentation.ui.main.MainFragment
import com.savedstate.presentation.ui.main.MainNavigator
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }
}