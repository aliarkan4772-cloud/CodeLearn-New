package com.codelearn.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.codelearn.app.ui.screens.LanguagePickerScreen
import com.codelearn.app.ui.screens.RoadmapScreen
import com.codelearn.app.ui.screens.SplashScreen

object Routes {
    const val SPLASH = "splash"
    const val LANGUAGES = "languages"
    const val ROADMAP = "roadmap/{languageId}"
    fun roadmap(languageId: String) = "roadmap/$languageId"
}

@Composable
fun CodeLearnApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH
    ) {
        composable(Routes.SPLASH) {
            SplashScreen(
                onFinished = {
                    navController.navigate(Routes.LANGUAGES) {
                        popUpTo(Routes.SPLASH) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.LANGUAGES) {
            LanguagePickerScreen(
                onLanguageSelected = { language ->
                    navController.navigate(Routes.roadmap(language.id))
                }
            )
        }

        composable(
            route = Routes.ROADMAP,
            arguments = listOf(navArgument("languageId") { type = NavType.StringType })
        ) { backStackEntry ->
            val languageId = backStackEntry.arguments?.getString("languageId")
            RoadmapScreen(
                languageId = languageId,
                onBack = { navController.popBackStack() }
            )
        }
    }
}
