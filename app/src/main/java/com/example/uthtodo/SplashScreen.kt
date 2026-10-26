package com.example.uthtodo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNext: () -> Unit) {
    // Tự động đếm lùi 2 giây (2000ms) rồi gọi hàm chuyển màn hình
    LaunchedEffect(Unit) {
        delay(2000L)
        onNext()
    }

    // Khung chứa toàn bộ màn hình với nền màu xanh dương
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2F66F6))
            .padding(24.dp)
    ) {
        // Khung giữa màn hình: Logo + Tiêu đề + Subtitle
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Logo ứng dụng UTH Todo
            AppLogoIcon(
                size = 100.dp,
                backgroundColor = Color.White,
                iconColor = Color(0xFF2F66F6)
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Tiêu đề ứng dụng
            Text(
                text = "UTH Todo",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Dòng khẩu hiệu (slogan)
            Text(
                text = "Việc học, việc nhà – gọn gàng mỗi ngày",
                color = Color.White.copy(alpha = 0.85f),
                fontSize = 14.sp
            )
        }

        // Khung dưới cùng: Thanh chỉ báo + Phiên bản
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .width(36.dp)
                    .height(4.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.5f))
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Phiên bản 2.1.0",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 12.sp
            )
        }
    }
}