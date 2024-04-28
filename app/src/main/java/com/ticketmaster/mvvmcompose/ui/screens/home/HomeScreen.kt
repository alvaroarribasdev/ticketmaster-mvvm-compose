package com.ticketmaster.mvvmcompose.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.paging.compose.collectAsLazyPagingItems

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    val upcomingEvents = homeViewModel.upcomingEventsState.value.collectAsLazyPagingItems()
}

