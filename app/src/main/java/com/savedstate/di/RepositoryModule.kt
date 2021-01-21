package com.savedstate.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

//
//@Module
//@InstallIn(ApplicationComponent::class)
//object RepositoryModule {
//
//    @Singleton
//    @Provides
//    fun provideRecipeRepository(
//            recipeService: RecipeService,
//            recipeMapper: RecipeDtoMapper,
//    ): RecipeRepository{
//        return RecipeRepository_Impl(
//            recipeService = recipeService,
//            mapper = recipeMapper
//        )
//    }
//}

