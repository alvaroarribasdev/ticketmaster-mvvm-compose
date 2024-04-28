package com.ticketmaster.mvvmcompose.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.ramcosta.composedestinations.generated.destinations.HomeScreenDestination
import com.ramcosta.composedestinations.generated.destinations.ProfileScreenDestination
import com.ramcosta.composedestinations.generated.destinations.SearchScreenDestination
import com.ramcosta.composedestinations.generated.destinations.TicketScreenDestination
import com.ticketmaster.mvvmcompose.R

@Composable
fun AppBottomBar(
    modifier: Modifier = Modifier,
    currentRoute: String? = null,
    backQueueRoutes: List<String?> = emptyList(),
    visible: Boolean = true,
    onItemClicked: (String) -> Unit = {}
) {
    val bottomBarRoutes = remember {
        mutableSetOf(
            HomeScreenDestination.route,
            SearchScreenDestination.route,
            TicketScreenDestination.route,
            ProfileScreenDestination.route
        )
    }

    val selectedRoute = when (currentRoute) {
        in bottomBarRoutes -> currentRoute
        else -> {
            backQueueRoutes.firstOrNull { route ->
                route in bottomBarRoutes
            } ?: HomeScreenDestination.route
        }
    }
    val paddingValues = WindowInsets.navigationBars.asPaddingValues()

    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically { it },
        exit = slideOutVertically { it }
    ) {
        NavigationBar(
            modifier = modifier
        ) {
            AppNavBarItem(
                selected = selectedRoute == HomeScreenDestination.route,
                onClick = {
                    onItemClicked(HomeScreenDestination.route)
                },
                selectedIcon = R.drawable.ic_home_active,
                unSelectedIcon = R.drawable.ic_home_inactive
            )
            AppNavBarItem(
                selected = selectedRoute == SearchScreenDestination.route,
                onClick = {
                    onItemClicked(SearchScreenDestination.route)
                },
                selectedIcon = R.drawable.ic_search_active,
                unSelectedIcon = R.drawable.ic_search_inactive
            )
            AppNavBarItem(
                selected = selectedRoute == TicketScreenDestination.route,
                onClick = {
                    onItemClicked(TicketScreenDestination.route)
                },
                selectedIcon = R.drawable.ic_ticket_active,
                unSelectedIcon = R.drawable.ic_ticket_inactive,
            )
            AppNavBarItem(
                selected = selectedRoute == ProfileScreenDestination.route,
                onClick = {
                    onItemClicked(ProfileScreenDestination.route)
                },
                selectedIcon = R.drawable.ic_profile_active,
                unSelectedIcon = R.drawable.ic_profile_inactive,
            )
        }
    }
}

@Composable
fun RowScope.AppNavBarItem(
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    selectedIcon: Int,
    unSelectedIcon: Int,
    contentDescription: String? = null,

    ) {
    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = {
            Icon(
                painter = if (selected) painterResource(id = selectedIcon) else painterResource(id = unSelectedIcon),
                contentDescription = contentDescription
            )
        }
    )
}