package com.example.uthtodo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.uthtodo.ui.theme.UTHTodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTHTodoTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    // Quản lý trạng thái điều hướng giữa các màn hình
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "splash" // Màn hình xuất hiện đầu tiên
    ) {
        // 1. Màn hình Start (Splash)
        composable("splash") {
            SplashScreen(onNext = {
                // Chuyển sang màn onboarding và xóa màn splash khỏi luồng back (không cho bấm Back quay lại Splash)
                navController.navigate("onboarding") {
                    popUpTo("splash") { inclusive = true }
                }
            })
        }

        // 2. Màn hình Onboarding (chứa cả 3 bước tương tác)
        composable("onboarding") {
            OnboardingScreen(onFinish = {
                // Xử lý sự kiện khi bấm nút "Bắt đầu ngay" ở trang cuối
                Toast.makeText(context, "Hoàn tất Onboarding UTH Todo!", Toast.LENGTH_SHORT).show()
            })
        }
    }
}