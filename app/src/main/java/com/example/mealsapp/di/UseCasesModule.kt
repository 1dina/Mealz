package com.example.mealsapp.di

import com.example.domain.repo.MealsRepo
import com.example.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {
    @Provides
    fun provideUseCase(repo:MealsRepo) :GetMeals{
        return GetMeals(repo)
    }
}