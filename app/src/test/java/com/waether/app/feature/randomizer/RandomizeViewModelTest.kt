package com.waether.app.feature.randomizer

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test


class RandomizeViewModelTest {

    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `init then update number liveData value to DEFAULE_VALUE`() {

        //Arrange
        //Act
        val viewModel = RandomizeViewModel()

        //Assert
        val result=viewModel.randomNumber.value
        Assert.assertTrue(result== DEFAULT_VALUE)
    }

    @Test
    fun `increment number when number liveData value is zero then update number liveData value to one`() {

        //Arrange
        val viewModel = RandomizeViewModel()
        viewModel.randomNumber.value = 0
        //Act
        viewModel.incrementNumber()
        //Assert
        val result=viewModel.randomNumber.value
        Assert.assertTrue(result==1)
    }
}