/*
 * This file is part of Jetpack-Libs.
 *
 *  Jetpack-Libs is free software: you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software Foundation,
 *  either version 3 of the License, or (at your option) any later version.
 *
 *  Jetpack-Libs is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with Jetpack-Libs.
 *  If not, see <https://www.gnu.org/licenses/>.
 *
 *  **** INFORMATIONS ABOUT THE AUTHOR *****
 *  The author of this file is Antoine Pirlot, the owner of this project.
 *  You find this original project on github.
 *
 *  My github link is: https://github.com/antoinepirlot
 *  This current project's link is: https://github.com/antoinepirlot/Jetpack-Libs
 *
 *  You can contact me via my email: pirlot.antoine@outlook.com
 *  PS: I don't answer quickly.
 */

package io.github.antoinepirlot.jetpack_libs.navigation

import androidx.navigation.NavHostController

/**
 * @author Antoine Pirlot on 05/08/2024
 */

private fun backToRootDestination(navController: NavHostController) {
    var currentRoute: String? = navController.currentBackStackEntry?.destination?.route
    while (currentRoute != null) {
        navController.popBackStack()
        currentRoute = navController.currentBackStackEntry?.destination?.route
    }
}